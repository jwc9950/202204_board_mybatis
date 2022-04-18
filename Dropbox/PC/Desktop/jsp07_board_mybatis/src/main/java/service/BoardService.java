package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.BoardDAO;
import dao.BoardfileDAO;
import dao.ReplyDAO;
import dto.Board;
import dto.Boardfile;


public class BoardService {
	private BoardDAO boardDAO = new BoardDAO();
	private BoardfileDAO boardfileDAO = new BoardfileDAO();
	private ReplyDAO replyDAO = new ReplyDAO();
	
	
  public void  insert(Board board, List<String> filenames) {
	  
	  int cnt =boardDAO.insert(board);
		System.out.println(cnt+"건 board 추가");
		System.out.println("service:" + board);
		//게시물 파일저장
		//bnum는 board저장시 생성(boardMapper에서 selectkey로 세팅)
		for(String filename : filenames) {
			Boardfile boardfile = new Boardfile();
			boardfile.setBnum(board.getBnum());
			boardfile.setFilename(filename);
		cnt+=	boardfileDAO.insert(boardfile);
		}
		System.out.println(cnt+"건 boardfile 추가");
	
  }
public List<Board> selectList(Map<String,Object> findmap) {
	

	//페이징처리
	
	int perPage =10; //한페이지의 게시물수 :
	int curPage = (int)findmap.get("curPage");
	int startnum=(curPage-1)*perPage +1;  //시작번호
	int endnum= startnum+perPage -1; //끝번호
	findmap.put("startnum", startnum);
	findmap.put("endnum", endnum);
	
	//페이징블럭 처리
	
	//전체게시물수
	int totCnt =boardDAO.select_totalcnt(findmap);
	int totPage = totCnt /perPage;  //전체페이지  
	if(totCnt % perPage >0) totPage++;    //나머지가 있을때가 문제   ->해결 totPage에+1 (소숫점 반올림원리)
	findmap.put("totPage", totPage);
	
	
	int perBlock = 10;  //10페이지인것
	int startPage =curPage-( (curPage-1)%perBlock);
	int endPage =startPage+perBlock-1;
	
	
	
	//endpage수정(endpage가 조회된 totpage보다 클수없는데 커버릴때 문재해결)(같아야한다)
	//total페이지는 데이터의 최대가 얼마나 들어있는지 보는것임
if(endPage>totPage) endPage =totPage;
	
	findmap.put("startPage", startPage); //블럭의 시작페이지
	findmap.put("endPage", endPage); //블럭의 끝페이지
	
	

	

	
	
	System.out.println("findmap:"+ findmap);
	return boardDAO.selectList(findmap);
}
public Board selectOne(int bnum) {

	return boardDAO.selectOne(bnum);
}
public void delete(int bnum) {
	//게시물파일을 먼저삭제 해야함 : 반드시 자식부터 삭제가 되어야한다.   //댓글을 먼저 삭제하고  부모를 삭제해야 에러 안남
	//댓글삭제: 반드시 자식부터 삭제해야됨 그래야 에러 no
	
	//1)댓글삭제
	int cnt = replyDAO.delete_bnum(bnum);
	System.out.println(cnt);
	
	//2)게시물파일 삭제
	 cnt =boardfileDAO.delete(bnum);
	System.out.println(cnt+"건 boardfile삭제");
	
	//게시물삭제
	 cnt = boardDAO.delete(bnum);
	System.out.println(cnt +"건삭제");
	
}
public void update(Board board, List<String> filenames, String[] removefiles) {
	//1)게시물수정
	boardDAO.update(board);

	//2)추가할파일들 추가
	for(String filename : filenames) {
		Boardfile boardfile = new Boardfile();
		boardfile.setBnum(board.getBnum());
		boardfile.setFilename(filename);
		boardfileDAO.insert(boardfile);
	}
	
	//3)파일들 삭제
	if(removefiles == null) return;
	for(String bfnum :removefiles) { 
		boardfileDAO.delete(Integer.parseInt(bfnum));
	}
	
}

//조회수+1
public void update_readcnt(int bnum) {
	boardDAO.update_readcnt(bnum);
}


}

