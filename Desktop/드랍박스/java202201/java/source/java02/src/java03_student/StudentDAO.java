package java03_student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//데이터베이스액세스 클래스
public class StudentDAO {
	//db접속 인스턴스 
	private Connection con = DBConn.getConnection();
	
	//insert메소드
	void insert(Student student) {
		String sql = "INSERT INTO student(sno,sname,mcode,score)" +
					 "VALUES (?,?,?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, student.getSno());
			pstmt.setString(2, student.getSname());
			pstmt.setString(3, student.getMcode());
			pstmt.setInt(4, student.getScore());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 추가");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		//싱글톤 패턴으로 적용
//		}finally {
//			try {
//				if (con != null) con.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}
	//update메소드
	void update(Student student) {
		String sql = "UPDATE student \r\n"
				    + "SET sname = ?,\r\n"
				    + "    mcode =?,\r\n"
				    + "    score=?\r\n"
				    + "WHERE sno = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, student.getSname());
			pstmt.setString(2, student.getMcode());
			pstmt.setInt(3, student.getScore());
			pstmt.setString(4, student.getSno());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 수정");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//delete메소드
	void delete(String sno) {
		String sql = "DELETE FROM student\r\n"
				+ "WHERE sno = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sno);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt +"건 삭제");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//한건조회
	Student selectOne(String sno) {
		Student student = null; //학생객체 반환
		
		String sql="SELECT *\r\n"
				+ "FROM student\r\n"
				+ "WHERE sno = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sno);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) { //다음데이터로 포인터이동
				sno = rs.getString("sno");
				String sname = rs.getString("sname");
				String mcode = rs.getString("mcode");
				int score = rs.getInt("score");
				student = new Student(sno, sname, mcode, score);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(student);
		return student;
		
	}
	
	//전체조회리스트
	List<Student> selectList() {
		List<Student> slist = new ArrayList<>();
		
		String sql = "SELECT * FROM student";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) { //다음 자료가 존재하지 않을때 까지
				String sno = rs.getString("sno");
				String sname = rs.getString("sname");
				String mcode = rs.getString("mcode");
				int score = rs.getInt("score");
				Student student = new Student(sno, sname, mcode, score);
				slist.add(student); //리스트에 추가
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(slist);
		return slist;
	}
	
	
	
	
	
	
	
	
}
