package java02_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class J20220308_02_major {

	public static void main(String[] args) throws SQLException {
		//컨넥션 객체 얻기
		Connection conn = DBConn.getConnection();
		
//		Scanner sc = new Scanner(System.in);
//		//major테이블 insert
//		System.out.print("전공코드는?");
//		String mcode = sc.next();
//		sc.nextLine(); //엔터처리
//		System.out.print("전공명은?");
//		String mname = sc.nextLine();
//		
//		String sql = "INSERT INTO major(mcode, mname) VALUES (?,?)";
//		PreparedStatement pstmt = conn.prepareStatement(sql);
//		pstmt.setString(1, mcode);
//		pstmt.setString(2, mname);
//		int cnt = pstmt.executeUpdate();
//		System.out.println(cnt+"건 추가");
		//major테이블 update
//		String mcode = "a03";
//		String mname = "수정학과";
//		
//		String sql="UPDATE major\r\n"
//				+ "SET mname = ?\r\n"
//				+ "WHERE mcode = ?";
//		PreparedStatement pstmt = conn.prepareStatement(sql);
//		pstmt.setString(1, mname);
//		pstmt.setString(2, mcode);
//		int cnt = pstmt.executeUpdate();
//		System.out.println(cnt+"건 수정");
		
		//major테이블 delete
		String mcode = "a03";
		String sql = "DELETE FROM major\r\n"
				+ "WHERE mcode = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, mcode);
		int cnt = pstmt.executeUpdate();
		System.out.println(cnt+"건 삭제");
		
		
		
		
		
		
		
		
		
		

	}

}
