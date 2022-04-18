package java02_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J20220308_01_dbconn {

	public static void main(String[] args) throws Exception {
		// db접속 테스트
		Connection con = DBConn.getConnection();
		System.out.println(con);
		
		//program테이블에 insert
//		String code ="004";
//		String name = "파이썬";
//		int price = 10000;
//		String sql = "INSERT INTO program(code, name,price) " +
//					"VALUES(?, ?, ?)";
//		PreparedStatement pstmt = con.prepareStatement(sql);
//		pstmt.setString(1, code);
//		pstmt.setString(2, name);
//		pstmt.setInt(3, price);
//		int cnt = pstmt.executeUpdate(); //실행
//		//cnt : 적용건수
//		System.out.println(cnt+"건 추가");
		
		//program테이블에 update
//		String sql ="UPDATE program "
//				+ "SET name = ? "
//				+ "WHERE code = ?";
//		PreparedStatement pstmt = con.prepareStatement(sql);
//		pstmt.setString(1, "오라클");
//		pstmt.setString(2, "001");
//		int cnt = pstmt.executeUpdate();
//		System.out.println(cnt+"건 수정");
		
		//program테이블에 delete
		String sql = "DELETE FROM program \r\n"
				+ "WHERE code = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "001");
		int cnt = pstmt.executeUpdate();
		System.out.println(cnt+"건 삭제");
		
		//autoCommit이 true가 디폴트: 자동 commit
		//con.setAutoCommit(false);
		
		

	}

}
