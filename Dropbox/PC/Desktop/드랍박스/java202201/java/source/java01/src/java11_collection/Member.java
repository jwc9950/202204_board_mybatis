package java11_collection;
//회원클래스(dto)
public class Member {
	private String userid;
	private String passwd;
	
	public Member() {
	}
	public Member(String userid, String passwd) {
		super();//생략가능
		this.userid = userid;
		this.passwd = passwd;
	}
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
	@Override
	public String toString() {
		return "Member [userid=" + userid + ", passwd=" + passwd + "]";
	}
	
}
