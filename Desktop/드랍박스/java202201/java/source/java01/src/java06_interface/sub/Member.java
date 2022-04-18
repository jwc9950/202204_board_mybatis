package java06_interface.sub;
//회원정보 클래스(dto)
public class Member {
	//필드:아이디, 비밀번호, 이름
	private String userid;
	private String passwd;
	private String name;
	//생성자
	public Member() {
		super();
	}
	public Member(String userid, String passwd, String name) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
	}
	//세터,게터
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//toString
	@Override
	public String toString() {
		return "Member [userid=" + userid + ", passwd=" + passwd + ", name=" + name + "]";
	}
	
}
