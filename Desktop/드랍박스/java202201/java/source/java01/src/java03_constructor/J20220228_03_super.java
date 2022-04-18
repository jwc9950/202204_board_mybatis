package java03_constructor;

import java.text.SimpleDateFormat;
import java.util.Date;

//수강강좌
//final 클래스 : 상속불가
class ClassRoom{//부모클래스
	//상수정의
	public static final String classname = "이젠자바클래스";
	private String name;
	ClassRoom(String name){ //반드시 매개변수가 필요
		this.name = name;
	}
	//오늘의 날짜 반환 
	//final메소드 : 오버라이딩 불가 
	final String getToday() {
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String fdate =sf.format(d);
		return fdate;
	}
	void today() {
		System.out.println("◆◆◆" + getToday() + "◆◆◆");
		System.out.println("입실체크");
		System.out.println("수강과목 듣기");
		System.out.println("퇴실체크");
	}
	@Override
	public String toString() {
		return "[name=" + name + "]";
	}
}
class Enrollee extends ClassRoom{ //등록자(수강생)
	//생성자는 오버라이딩 불가
	Enrollee(String name){
		//부모클래스의 생성자를 실행(가장첫줄에 작성)
		super(name);
		System.out.println("자식생성자 실행");
	}
}
class Manager extends ClassRoom {
	Manager(String name) { //반드시 생성자 필요
		super(name);
	}
//	@Override
//	String getToday() {
//		return "2022-02-10";
//	}
	@Override
	void today() {
		System.out.println("◆◆◆" + getToday() + "◆◆◆");
		System.out.println("수강생 입실 관리");
		System.out.println("수강생 퇴실 관리");
	}
	
}
public class J20220228_03_super {
	public static void main(String[] args) {
		System.out.println(ClassRoom.classname);
		Enrollee e1 = new Enrollee("현빈");
		System.out.println(e1);
		Manager m1 = new Manager("이선희");
		System.out.println(m1);
		
		System.out.println("------------------");
		e1.today(); //수강생
		System.out.println("------------------");
		m1.today(); //관리자
		
		//날짜포맷 만들기
//		Date d = new Date();
//		System.out.println(d);
//		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//		String fdate =sf.format(d);
//		System.out.println(fdate);
		
		
		
		
		
		
		
		
		
	}

}
