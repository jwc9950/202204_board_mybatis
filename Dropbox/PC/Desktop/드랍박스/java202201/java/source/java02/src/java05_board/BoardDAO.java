package java05_board;

import java.util.List;
import java.util.Map;

public interface BoardDAO {
	//추가
	int insert(Board board);
	//수정
	int update(Board board);
	//삭제
	int delete(int seq); //seq기준 
	int delete(String writer);//wrtier기준
	//한건조회
	Board selctOne(int seq);
	//리스트
	List<Board> selectList(); //전체
	List<Board> selectList(String writer); //작성자게시물
	//보드 + 멤버 리스트
	List<Map<String,Object>> selectListMember(String findvalue);
	//보드+멤버리스트(출생년도포함)
	List<Map<String, Object>> selectListMemberYear(String findvalue);
	
	
	
	
	
	
	
	
	
	
}
