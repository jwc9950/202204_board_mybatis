package java04_squid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date; //년월일시분초
import java.util.List;

import java03_student.DBConn;
//dao
public class SquidDAOImpl implements SquidDAO{
	Connection con;
	PreparedStatement pstmt;
	String sql;
	
	//insert
	@Override //부모의 메소드를 재정의
	public int insert(Squid squid) {
		int cnt = 0;
		con = DBConn.getConnection();
		sql ="INSERT INTO squid (no, name, debt) \r\n"
				+ "VALUES (?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, squid.getNo());
			pstmt.setString(2, squid.getName());
			pstmt.setInt(3, squid.getDebt());
			cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 추가");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}
	
	//update
	@Override
	public int update(Squid squid) {
		con = DBConn.getConnection();
		int cnt=0;
		sql = "UPDATE squid\r\n"
				+ "SET name = ?,\r\n"
				+ "    debt = ?\r\n"
				+ "WHERE no = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, squid.getName());
			pstmt.setInt(2, squid.getDebt());
			pstmt.setInt(3, squid.getNo());
			cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 수정");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return cnt;
		
	}
	//delete
	@Override
	public int delete(int no) {
		int cnt=0;
		con = DBConn.getConnection();
		sql = "DELETE FROM squid\r\n"
				+ "WHERE no = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 삭제");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
	}
	//selectOne
	@Override
	public Squid selectOne(int no) {
		Squid squid=null;
		con = DBConn.getConnection();
		sql = "SELECT * FROM squid\r\n"
				+ "WHERE no = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				String name = rs.getString("name");
				int debt = rs.getInt("debt");
				String fail = rs.getString("fail");
				//getTimestamp : 년월일 시분초 까지 리턴
				Date regidate = rs.getTimestamp("regidate");
				squid = new Squid(no, name, debt, fail, regidate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return squid;
	}
	
	//selectList
	@Override
	public List<Squid> selectList(){
		List<Squid> slist = new ArrayList<>();
		con = DBConn.getConnection();
		sql = "SELECT * FROM squid\r\n"
				+ "ORDER BY no";
		try {
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				int debt = rs.getInt("debt");
				String fail = rs.getString("fail");
				Date regidate = rs.getTime("regidate");
				Squid squid = new Squid(no, name, debt, fail, regidate);
				slist.add(squid);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return slist;
	}
	
	
	
	
	
}
