package java06_sales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java03_student.DBConn;

public class SalesDAOImpl implements SalesDAO{

	@Override
	public List<Map<String, Object>> selectListDaySales(String sdate) {
		List<Map<String, Object>> mlist = new ArrayList<>();
		Connection con = DBConn.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("select s.pcode, p.pname, p.price, s.qty, s.amount ");
		sb.append("from sales s join product p on(s.pcode=p.pcode)");
		sb.append("where s.sdate = ?");

		try {
			PreparedStatement pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, sdate);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Map<String, Object> map = new HashMap<>();
				map.put("pcode", rs.getString("pcode"));
				map.put("pname", rs.getString("pname"));
				map.put("price", rs.getInt("price"));
				map.put("qty", rs.getInt("qty"));
				map.put("amount", rs.getInt("amount"));
				mlist.add(map);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mlist;

	}

}
