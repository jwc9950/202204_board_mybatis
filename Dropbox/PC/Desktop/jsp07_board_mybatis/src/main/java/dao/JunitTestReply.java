package dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import dto.Reply;



class JunitTestReply {

	ReplyDAO replyDAO = new ReplyDAO();
	
	@Test
	void testInsert() {
		Reply reply = new Reply();			
		reply.setBnum(35);
		reply.setContent("댓글1");
		reply.setRestep(1);
		reply.setRelevel(1);	
		replyDAO.insert(reply);	
		int cnt = replyDAO.insert(reply);
		System.out.println(cnt + "건 삽입");
		
		
	}
	@Test
	void testUpdate() {
		Reply reply = new Reply();
		reply.setContent("댓글수정");
		replyDAO.update(reply);
		int cnt =replyDAO.update(reply);
		System.out.println(cnt +"건수정");
	}
	
    @Test
	void testDelete() {
	int cnt = replyDAO.delete(3);

	System.out.println(cnt +"건 삭제");
    }
    
    @Test
	void testSelectOne() {
    	Reply reply  = replyDAO.selectOne(3);
    	System.out.println(reply);	
    }    
    
    @Test
	void testSelectList() {
    	List<Reply> rlist  = replyDAO.selectList(35);
    	System.out.println(rlist);	
    }    
    
    
    
}


