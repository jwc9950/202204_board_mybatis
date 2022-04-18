package java04_squid;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.jupiter.api.Test;

class JUnitTest {
	//단위테스트
	SquidDAO sdao = new SquidDAOImpl();
	
	@Test
	void testInsert() {
		//추가테스트
		Squid squid = new Squid(1,"이순신", 2000000);
//		squid.setNo(2);
//		squid.setName("홍길동");
//		squid.setDebt(3000000);
		
		System.out.println(squid);
		int cnt = sdao.insert(squid);
		
		//한건이 추가됐을때만 성공
		//cnt가 1이면 성공
		assertEquals(1, cnt);
		
	}
	
	@Test
	void testUpdate() {
		//수정테스트
		Squid squid = new Squid(1, "이철수", 50000);
		int cnt = sdao.update(squid);
		//cnt가 1이면 성공
		assertEquals(1, cnt);
		
	}
	
	@Test
	void testDelete() {
		//삭제테스트
		int cnt = sdao.delete(1);
		assertEquals(1, cnt);
	}
	
	@Test
	void testSelectOne() {
		//한건조회
		Squid squid = sdao.selectOne(2);
		System.out.println(squid);
		
		//squid가 널이 아닐때만 성공
		assertNotNull(squid);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sf.format(squid.getRegidate()));;
		
	}

	@Test
	void testSelectList() {
		//리스트
		List<Squid> slist = sdao.selectList();
		System.out.println(slist);
		//slist에 데이터가 존재시 성공
		//slist의 사이즈가 0과 같지 않다면 성공
		assertNotEquals(0, slist.size());
		
		for(Squid squid:slist) {
			System.out.println("--------------");
			System.out.println(squid.getNo());
			System.out.println(squid.getName());
			System.out.println(squid.getDebt());
			System.out.println(squid.getFail());
			System.out.println(squid.getRegidate());
		}
		
		
	}

	
	
	
	

}
