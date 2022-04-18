package java03_student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	//db 접속 connection을 리턴하는 메소드
	//싱글톤패턴: 인스턴스를 하나만 생성하고 재사용
	private static Connection conn;//공용필드로 생성
	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="hr";
		String password = "hr";
		try {
			//conn객체가 null이거나 close됐다면
			if (conn == null || conn.isClosed()) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, password);
				//System.out.println("접속완료");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("db접속 실패");
			e.printStackTrace();
		}
		
		return conn;
	}
}
