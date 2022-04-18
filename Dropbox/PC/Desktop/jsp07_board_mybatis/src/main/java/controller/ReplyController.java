package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Reply;
import service.ReplyService;

@WebServlet("/reply/*")
public class ReplyController extends HttpServlet {
	private static final long serialVersionUID = 1L; 
   
  private ReplyService replyService = new ReplyService();
		 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		String uri =request.getRequestURI();
		System.out.println(uri);
		String path = request.getContextPath();
		
		
		
		if(uri.contains("add")) {
			//파라메터 dto넣기
			int bnum = Integer.parseInt(request.getParameter("bnum"));
			int restep = Integer.parseInt(request.getParameter("restep"));
			int relevel = Integer.parseInt(request.getParameter("relevel"));
			String content =request.getParameter("content");
			
			Reply reply = new Reply();
			reply.setBnum(bnum);
			reply.setRestep(restep);
			reply.setRelevel(relevel);
			reply.setContent(content);
			System.out.println(reply);
			
			replyService.insert(reply);
			
			//댓글 게시물의 상세조회 이동
			response.sendRedirect(path +"/board/detail?bnum="+bnum);
			
			
		}else if(uri.contains("remove")) {
			//댓글삭제
			int rnum = Integer.parseInt(request.getParameter("rnum"));
			replyService.delete(rnum);
			//detail로 이동시 필요
			int bnum = Integer.parseInt(request.getParameter("bnum"));
		
			
			//board detail로 이동 리다이렉트 방식//	int bnum =Integer.parseInt(request.getParameter("bnum")); 보드컨트롤러 detail에서 여기서 들고온것 ?bnum쪽에
			response.sendRedirect(path+"/board/detail?bnum="+bnum);  //위에detail의 bnum
		
			
		}else if (uri.contains("modiform")) {
			
			int rnum =Integer.parseInt(request.getParameter("rnum"));
			
			Reply reply = replyService.selectOne(rnum);
			
			request.setAttribute("reply", reply);
			request.getRequestDispatcher("/view/board/replymodify.jsp").forward(request, response);
			
		}else if (uri.contains("modify")) {
			
			//수정
			int rnum = Integer.parseInt(request.getParameter("rnum"));
			String content = request.getParameter("content");
			Reply reply = new Reply();
			reply.setRnum(rnum);
			reply.setContent(content);
			System.out.println(reply);
			replyService.update(reply);
			
			int bnum = Integer.parseInt(request.getParameter("rnum"));
			response.sendRedirect(path+"/board/detail?bnum="+bnum);
			
		}else {
			System.out.println("잘못된 uri");
		
			}
			
		
				
			}
		
	

		


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
