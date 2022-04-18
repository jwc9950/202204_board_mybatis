package java06_interface.sub;

public class MemberServiceImpl implements MemberService{
	//회원가입 정보
	Member member;

	@Override
	public void insert(String userid, String passwd, String name) {
		//회원가입
		member = new Member();		
		member.setUserid(userid);
		member.setPasswd(passwd);
		member.setName(name);
		//System.out.println(member);
	}
	@Override
	public void update(String userid, String passwd, String name) {
		//회원수정
		member.setUserid(userid);
		member.setPasswd(passwd);
		member.setName(name);
	}
	@Override
	public void delete() {
		//회원탈퇴
		member = null;
		System.out.println("삭제완료");
	}
	//아이디와 패스워드 체크
	@Override
	public String login(String userid, String passwd) {
		String dbUserid = member.getUserid();
		String dbPasswd = member.getPasswd();
		if (dbUserid.equals(userid) && dbPasswd.equals(passwd)) {
			return "로그인 성공";
		}
		return "로그인 실패";
	}
	@Override
	public void printInfo() {
		System.out.println("--------회원정보--------");
		System.out.println("아이디:"+member.getUserid());
		System.out.println("비밀번호:" + member.getPasswd());
		System.out.println("이름:" + member.getName());
	}
	@Override
	public boolean memberCheck() {
		//멤버null 체크
		if (member==null) return true;
		return false;
	}
	
	



}
