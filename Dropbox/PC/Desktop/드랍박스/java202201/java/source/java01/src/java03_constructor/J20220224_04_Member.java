package java03_constructor;
//회원 클래스
class Member {
	//필드:아이디,비밀번호, 이메일
	//은닉화,캡슐화
	private String userid;
	private String passwd;
	private String email;
	//생성자:아이디, 비밀번호, 이메일
	Member(String userid, String passwd, String email){
		this.userid = userid;
		this.passwd = passwd;
		this.email = email;
	}
	//게터(필드의형 get+필드의 첫글자는 대문자로)
	String getUserid() {
		return userid;
	}
	String getPasswd() {
		return passwd;
	}
	String getEmail() {
		//return email;
		//리턴되는 데이터를 가공
		return email.substring(0, 2) + "***********";
	}
	//모든 필드 조회 메소드
	//오버라이딩 어노테이션
	//부모클래스(Object)의 메소드를 재정의
	//public : 모든클래스에서 접근 가능
	@Override
	public String toString() {
		return "Member [userid=" + userid + ", passwd=" + passwd + ", email=" + email + "]";
	}
	
}

public class J20220224_04_Member {
	public static void main(String[] args) {
		//회원가입
		String userid = "java";
		String passwd = "1111";
		String email = "java@gmail.com";
		Member m1 = new Member(userid, passwd, email);
		
		//로그인 
		String loginId = "java";
		String loginPw = "1111";
		if (loginId.equals(m1.getUserid()) && loginPw.equals(m1.getPasswd())) {
			System.out.println("로그인 성공");
			System.out.println("이메일:" + m1.getEmail());
		}else {
			System.out.println("로그인 실패");
		}
		
		System.out.println("----------------");
		//System.out.println(m1.toString());
		System.out.println(m1);//toString()자동 실행
		

	}

}
