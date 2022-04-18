package java06_interface.sub;

public interface MemberService {
	//추상메소드
	//회원가입
	void insert(String userid, String passwd, String name);
	//로그인
	String login(String userid, String passwd);
	//회원조회
	void printInfo();
	//회원수정
	void update(String userid, String passwd, String name);
	//회원탈퇴
	void delete();
	//멤버 null체크
	boolean memberCheck();
	
}
