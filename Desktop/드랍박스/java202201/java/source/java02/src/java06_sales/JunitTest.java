package java06_sales;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class JunitTest {
	SalesDAO sdao = new SalesDAOImpl();
	
	@Test
	void testSelectListDaySales() {
		List<Map<String, Object>> slist = sdao.selectListDaySales("2022-03-17");
		System.out.println(slist);
		
		
	}

}
