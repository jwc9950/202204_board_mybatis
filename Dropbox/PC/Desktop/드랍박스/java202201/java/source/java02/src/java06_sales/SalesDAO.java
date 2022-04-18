package java06_sales;

import java.util.List;
import java.util.Map;

public interface SalesDAO {
	//추상메소드
	//판매일자의 판매리스트 조회
	List<Map<String, Object>> selectListDaySales(String sdate);
}
