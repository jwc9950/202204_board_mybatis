package java05_board;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class JunitTest {

	BoardDAO bdao = new BoardDAOImpl();
	@Test
	void testInsert() {
		int cnt = bdao.insert(new Board("java", "가입인사", "만나서반갑습니다"));
		assertEquals(1, cnt);
	}

	@Test
	void testUpdate() {
		int cnt = bdao.update(new Board(1, "hong", "가입수정", "내용수정"));
		assertEquals(1, cnt);
	}

	@Test
	void testDelete() {
		int cnt = bdao.delete(1);
		assertEquals(1, cnt);
	}

	@Test
	void testSelctOne() {
		Board board = bdao.selctOne(3);
		System.out.println(board);
		assertNotNull(board);
	}

	@Test
	void testSelectList() {
		List<Board> blist = bdao.selectList();
		System.out.println(blist);
		assertNotEquals(0, blist.size());
	}
	
	@Test
	void testSelectListMember() {
		List<Map<String,Object>> mlist = bdao.selectListMember("가입");
		System.out.println(mlist);

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		try {
			for(Map<String,Object> map:mlist) {
				System.out.println("---------------------");
				String seq = (String) map.get("seq"); //다운캐스팅
				String writer = (String) map.get("writer");
				String email = (String)map.get("email");
				String subject = (String)map.get("subject");
				Date regidate = (Date)map.get("regidate");
				System.out.println("순번:" + seq);
				System.out.println("작성자:" + writer);
				System.out.println("등록일자:" + sf.format(regidate));
			}
//			
//		}catch (Exception e) {
//			e.printStackTrace(); //콘솔에서 예외를 추적할수 있다
//		}
		
	}
	@Test
	void testSelectListMemberYear() {
		List<Map<String, Object>> mlist = bdao.selectListMemberYear("h");
		System.out.println(mlist);
		for(Map<String, Object> map:mlist) {
			System.out.println(map.get("seq"));
			System.out.println(map.get("writer"));
			System.out.println(map.get("birthyear"));
			System.out.println(map.get("subject"));
			System.out.println(map.get("regidate"));
		}
	}
	
	

}
