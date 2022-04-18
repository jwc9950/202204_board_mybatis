package service;

import java.util.List;

import dao.ReplyDAO;
import dto.Reply;

public class ReplyService {
	
	private ReplyDAO replyDAO = new ReplyDAO();
	
	public void insert(Reply reply) {
		//댓글의 순서 (restep)
		reply.setRestep(reply.getRestep()+1);	
		//댓글의 레벨(relevel)	
		reply.setRelevel(reply.getRelevel()+1);
		
		//기존댓글의 순서를 수정
		replyDAO.update_restep(reply);
		
	
		int cnt =replyDAO.insert(reply);
		System.out.println(cnt+"건추가");	
	}

		public List<Reply> selectList(int bnum) {
		// TODO Auto-generated method stub
		return replyDAO.selectList(bnum);  //dao로 보냄
	}

		public void delete(int rnum) {
			int cnt =	replyDAO.delete(rnum);
		System.out.println(cnt +"건 댓글 삭제");
	}

	

		public Reply selectOne(int rnum) {
			
			return replyDAO.selectOne(rnum);
			
		}

		public void update(Reply reply) {
			int cnt =replyDAO.update(reply);
			System.out.println(cnt +" 댓글 건 수정");
		}
	
		
	
	
	
	
}
