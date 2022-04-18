package java06_interface;

import java.text.SimpleDateFormat;
import java.util.Date;
//5번 클래스
class SampleTest{
	private String name;
	SampleTest(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "SampleTest [name=" + name + "]";
	}
	
}
//6번 클래스
class Cal{
	int add(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
}

//7번)
interface School{
	String scoreCal(int score);
}
class Middle implements School{//중학교
	//점수가 80점이상이면 ‘잘함’, 60점이상이면 ‘보통’, 아니면 ‘노력’을 리턴하는 메소드
	@Override
	public String scoreCal(int score) {
		if (score >= 80)
			return "잘함";
		else if (score >= 60)
			return "보통";
		else 
			return "노력";
	}

	@Override
	public String toString() {
		return "이젠 중학교";
	}
	
}
class High implements School{
	//점수가 80점 이상이면  ‘A’,  60점 이상이면 ‘B’, 아니면  ‘C’을 리턴하는 메소드
	@Override
	public String scoreCal(int score) {//고등학교
		if (score >= 80)
			return "A";
		else if (score >= 60)
			return "B";
		else 
			return "C";
	} 
	@Override
	public String toString() {
		return "이젠 고등학교";
	}
	
}
class SchoolManage{
	//점수의 결과 출력 메소드
	void printScore(School school, int score) {
		System.out.println("***" + school +"***");
		System.out.println("결과:"+school.scoreCal(score));
	}
}
public class J20220303_01_Test {

	public static void main(String[] args) {
		//1. 변수선언 초기화
//		String name = "hong gil dong";
//		int a = 25;
//		double d = 3.14;
//		char c = 'k';
//		boolean b = false;
		
		//2. 연산 출력
//		int a=30, b= 20;
//		System.out.println(a + "+" + b + "=" + (a+b));
//		System.out.println(a + "-" + b + "=" + (a-b));
//		System.out.println(a + "*" + b + "=" + (a*b));
//		System.out.println(a + "/" + b + "=" + (a/b));
//		System.out.println(a + "/" + b + "=" + (double)a/b);
		
		//3-1. 패스워드 일치여부
//		String pw = "1234";
//		if (pw.equals("1234")) {
//			System.out.println("패스워드가 일치합니다.");
//		}
		//3-2. 10 20 30 40 50 60
//		for(int i=1; i<7; i++) {
//			System.out.print(i*10 +" ");
//		}
		//3-3.배열을 출력
//		int[] score = {10,30,80,90,20};
//		for(int i=0; i<score.length; i++) {
//			System.out.print(score[i]+5 +" ");
//		}
		
		//3-4. 1~10까지의 합
//		int s=0;
//		for(int i=1; i<11; i++) {
//			s+=i;
//		}
//		System.out.println("1부터 10까지의 합은"+s+"입니다");
		
		//3-5) 임의의 6개의 숫자
//		int[] arr = new int[6];
//		for(int i=0; i<6; i++) {
//			arr[i] = (int)(Math.random()*48)+1;
//		}
//		for(int a:arr) {
//			System.out.print(a + " ");
//		}
		
		//3-6)현재시스템의 날짜
//		Date d = new Date();
//		SimpleDateFormat sf 
//			= new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
//		System.out.println(sf.format(d));
		
		//4. 용어
		//public :접근제한자
		//static : 정적메소드(정적멤버, 클래스 메소드..)
		//void : 반환형(리턴타입,...)
		//methodA : 메소드명
		//int a : 매개변수
		
		//5. 클래스정의 객체 생성
		//SampleTest stest = new SampleTest("테스트");
		
		//6.
//		Cal cal = new Cal();
//		int result = cal.add(10, 5);
//		System.out.println("두수의 합은 " + result);
//		result = cal.sub(10, 5);
//		System.out.println("두수의 차은 " + result);
		
		//7.
		Middle middle = new Middle();
		High high = new High();
		SchoolManage manage = new SchoolManage();
		manage.printScore(high, 75);
		manage.printScore(middle, 85);
		
		
		
		
		
	}

}
