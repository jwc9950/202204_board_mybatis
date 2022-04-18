package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import dto.Board;

public class BoardDAO {

	public int insert(Board board) {
		
		try(SqlSession session =MBConn.getSession()) {
			return session.insert("BoardMapper.insert", board);
		}
	}
	
	public int update(Board board) {
		try (SqlSession session = MBConn.getSession()) {
			return session.update("BoardMapper.update", board);
		}
		
	}

	public int update_readcnt(int bnum) {
		try (SqlSession session = MBConn.getSession()) {
			return session.update("BoardMapper.update_readcnt", bnum);
		}
		
	}
	
	
	
	
	public int delete(int bnum) {
		try(SqlSession session =MBConn.getSession()) {
			return session.delete("BoardMapper.delete",bnum);
		}
		
		
	}
	
	public Board selectOne(int bnum) {
		try(SqlSession session = MBConn.getSession()){
			return session.selectOne("BoardMapper.selectOne", bnum);
		}
	}
	
	public List<Board> selectList(Map<String,Object> findmap) {
		try(SqlSession session = MBConn.getSession()) {
			return session.selectList("BoardMapper.selectList",findmap);
		}
	}
	
	
	//게시물수
	public int  select_totalcnt(Map<String,Object> findmap) {
		try(SqlSession session = MBConn.getSession()) {
			return session.selectOne("BoardMapper.select_totalcnt",findmap);
		}
	}
	
}
