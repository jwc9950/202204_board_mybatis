package java02_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//db접속 클래스
public class DBConn {
	//db접속 메소드
	static Connection getConnection() {
		Connection con = null;
		//오라클접속 url, user, password
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		//체크 예외처리
		try {
			//오라클 접속 드라이버
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료");
			//오라클 접속
			con =DriverManager.getConnection(url, user, password);
			//System.out.println("접속 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}
		
		return con;
		
	}
}
