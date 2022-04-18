package java03_constructor;
//사람클래스
class Person{
	//필드:아이디, 비밀번호, 이름, 생년월일
	String userid;
	String passwd;
	String name;
	int birthyear=-1;
	
	//생성자:기본생성자
	Person() {}
	//생성자(아이디, 비밀번호),
	Person(String userid, String passwd){
		this.userid = userid;
		this.passwd = passwd;
	}
	//생성자(아이디,비밀번호, 이름, 생년월일)
	Person(String userid, String passwd, String name, int birthyear){
//		this.userid = userid;
//		this.passwd = passwd;
		//this(); 자신의 생성자를 호출 
		this(userid, passwd);
		this.name = name;
		this.birthyear = birthyear;
	}
	
	//메소드
	//사람정보 출력
	void info() {
		System.out.println("아이디:" + userid);
		System.out.println("비밀번호:" + passwd);
		if (name != null)
			System.out.println("이름:" + name);
		if (birthyear != -1) System.out.println("출생년도:" + birthyear);
	}
	
}

public class J20220224_02_Person {
	public static void main(String[] args) {
		Person p1 = new Person("java", "1111");
		p1.info();
	}

}
