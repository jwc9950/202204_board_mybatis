package controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.Member;

//회원관리 controller
@WebServlet("/member/*")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MemberDAO mdao = new MemberDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		System.out.println(uri);
		if (uri.contains("join")) {
			//회원등록
			//자동발번
			//int custno = Integer.parseInt(request.getParameter("custno"));
			String custname = request.getParameter("custname");
			String phone = request.getParameter("phone");
			String address = request.getParameter("address");
			String joindate = request.getParameter("joindate");
			String grade = request.getParameter("grade");
			String city = request.getParameter("city");
			
                       //생성자 형성
			Member member = new Member(custname, phone, address, joindate, grade, city);
			System.out.println(member);
			//dao호출
			int cnt = mdao.insert(member);
			System.out.println(cnt+"건 추가");
			//redirect 이동  // contextPath를 가지고 와서 이런방식으로 해도된다
			String contextPath = request.getContextPath();
			System.out.println(contextPath);
			String msg = URLEncoder.encode("등록이 완료되었습니다.", "utf-8");
			response.sendRedirect(contextPath + "/view/memberAdd.jsp?msg=" + msg);
		}else if (uri.contains("list")) {
			//리스트
			//dao호출
			List<Member> mlist = mdao.selectList();
			System.out.println(mlist);
			//forward
			request.setAttribute("mlist", mlist);
			request.getRequestDispatcher("/view/memberList.jsp")  //memberList로 보내줌
				.forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
