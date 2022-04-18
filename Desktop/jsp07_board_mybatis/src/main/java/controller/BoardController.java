package controller;


import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.BoardfileDAO;
import dto.Board;
import dto.Boardfile;
import dto.Reply;
import service.BoardService;
import service.BoardfileService;
import service.ReplyService;

@WebServlet("/board/*")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private BoardService boardService = new BoardService();   
    
    private BoardfileService boardfileService = new BoardfileService();
    private ReplyService replyService = new ReplyService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		System.out.println(uri);
		
		String path = request.getContextPath();
		
		if (uri.contains("add")) {
			//게시물등록
			/* 파일저장경로:web.xml에서 읽기 */
			//web.xml에서 저정한것을 getServletContext()로 읽어들인다.
			//getInitParameter: web.xml에서 초기화한 name값을 받아옴.이것을 savedirectory에 저정하겠다는것
                       // 항상 int size로 크기를 지정함
			//multipartRequest로 업로드 파일정보를 업로드 장소에 크기 및 파일 업로드 수행할수 있게함
			//defaultFileRenamePolicy() : 똑같은 이름을 가진 파일이 존재한다면 파일명에 1.2.3.으로 붙게해주는 클래스
			String saveDirectory = getServletContext().getInitParameter("savedir");
			int size = 1024*1024*20; // 20mbyte
			MultipartRequest multi = 
					new MultipartRequest(request,saveDirectory,size,"utf-8", 
							new DefaultFileRenamePolicy());
			
			//접속 ip정보
			String ip = request.getRemoteAddr();
			String userid = multi.getParameter("userid");
			String subject = multi.getParameter("subject");
			String content = multi.getParameter("content");
			//board dto만들기
			Board board = new Board();
			board.setUserid(userid);
			board.setSubject(subject);
			board.setContent(content);
			board.setIp(ip);
			
			System.out.println(board);
			
			List<String> filenames = new ArrayList<>();
			
			//파일의 이름의 모음
			Enumeration<String> files =multi.getFileNames();
			//자동완성
			while (files.hasMoreElements()) {
				String name= (String) files.nextElement();
				System.out.println(name);
			    String filename =	multi.getFilesystemName(name); //실제저장된 파일이름
			    System.out.println(filename);
			    if(filename !=null) filenames.add(filename);
			}
			
			//service 호출
			boardService.insert(board, filenames);
			//리다이렉트방식
			response.sendRedirect(path + "/board/list?msg="+URLEncoder.encode("추가완료","utf-8"));
			
			
		} else if (uri.contains("list")) {
			String findkey =request.getParameter("findkey");
			String findvalue =request.getParameter("findvalue");
			String curPage_s =request.getParameter("curPage");
			//curPage가 null일때 처리
			int curPage =1;
			if(curPage_s !=null)  
			curPage =Integer.parseInt(curPage_s);
			System.out.println("현재페이지:" +curPage);
			
			
			//조회조건map만들기 
			Map<String,Object>  findmap = new HashMap<>();
			if(findkey==null || findkey.equals("")) findkey ="userid";   //순서를 잘지켜야. (findkey.equals.한이유 리스트에서 조회를 하고다시 리스트를가면 페이지번호 선택하면 에러가뜨는것을 방지
			if(findvalue==null) findvalue ="";
			findmap.put("findkey",findkey);
			findmap.put("findvalue",findvalue);
			findmap.put("curPage",curPage);
			
			
			List<Board> blist = boardService.selectList(findmap);
			System.out.println(blist);
			//forward방식으로 이동
			request.setAttribute("blist", blist);
			
			request.setAttribute("findmap", findmap);  //페이징처리 결과
			
			request.getRequestDispatcher("/view/board/list.jsp").forward(request, response);
			
		}else if (uri.contains("detail")) {
			//상세페이지
			int bnum =Integer.parseInt(request.getParameter("bnum"));
			System.out.println(bnum);
			
			//조회수 +1
			boardService.update_readcnt(bnum); //bnum넘겨받음
			
			//게시물을 조회한것
			Board board =boardService.selectOne(bnum);
			System.out.println(board);
		
			//게시물파일을 조회
			List<Boardfile>bflist=	boardfileService.selectList(bnum);
			System.out.println(bflist);
			
			//댓글조회
			List<Reply> rlist = replyService.selectList(bnum);
		
			//forward방식 //view로 보냄
			request.setAttribute("board", board);
			request.setAttribute("bflist", bflist);
			request.setAttribute("rlist", rlist);
			request.getRequestDispatcher("/view/board/detail.jsp").forward(request, response);
		
		}else if(uri.contains("remove")) {
			int bnum =Integer.parseInt(request.getParameter("bnum"));
			System.out.println(bnum);
			boardService.delete(bnum);
			
			response.sendRedirect(path+"/board/list");
			
		}else if(uri.contains("modiform")) {
			//수정폼으로 이동
			int bnum= Integer.parseInt(request.getParameter("bnum"));  //변수아니라서 문자열
			//borard조회
			Board board =boardService.selectOne(bnum);
			//boardfile조회
			List<Boardfile>bflist= boardfileService.selectList(bnum);
			//forward이동 : modify.jsp로이동
			request.setAttribute("board", board);
			request.setAttribute("bflist", bflist);
			request.getRequestDispatcher("/view/board/modify.jsp").forward(request, response);
		
		}else if(uri.contains("modify")) {
		
				String saveDirectory = getServletContext().getInitParameter("savedir");
				int size = 1024*1024*20; // 20mbyte
				MultipartRequest multi = 
						new MultipartRequest(request,saveDirectory,size,"utf-8", 
								new DefaultFileRenamePolicy());
				
				//접속 ip정보
				String ip = request.getRemoteAddr();
				int bnum =Integer.parseInt(multi.getParameter("bnum"));
				String userid = multi.getParameter("userid");
				String subject = multi.getParameter("subject");
				String content = multi.getParameter("content");
				//board dto만들기
				Board board = new Board();
				board.setBnum(bnum);
				board.setUserid(userid);
				board.setSubject(subject);
				board.setContent(content);
				board.setIp(ip);
				
				System.out.println(board);
				
				List<String> filenames = new ArrayList<>();
				
				//파일의 이름의 모음
				Enumeration<String> files =multi.getFileNames();
				//자동완성
				while (files.hasMoreElements()) {
					String name= (String) files.nextElement();
					System.out.println(name);
				    String filename =	multi.getFilesystemName(name); //실제저장된 파일이름
				    System.out.println(filename);
				    if(filename !=null) filenames.add(filename);
				}
				System.out.println("추가할파일리스트:" + filenames);
				
				//삭제할 파일번호들
				String[] removefiles =multi.getParameterValues("removefile");
				System.out.println("삭제할파일리스트" + Arrays.toString(removefiles));
				
				//서비스를 호출
				boardService.update(board,filenames,removefiles);
				
				//detail로 이동
				response.sendRedirect(path+"/board/detail?bnum="+bnum);
				
				
			
			
			}
				
				
		}		
	
		
		
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

