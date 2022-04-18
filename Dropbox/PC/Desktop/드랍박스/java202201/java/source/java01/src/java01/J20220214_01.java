package java01;

//클래스
//puliic 클래스의 이름과 파일이름은 반드시 일치 
public class J20220214_01 {
	//main메소드: 프로그램의 시작 (반드시 한개만 존재)
	public static void main(String[] args) {
		// 프로그램의 시작점
		//; : 문장의 끝
		//println()메소드:콘솔에 매개변수를 출력해주는 기능
		System.out.println("헬로우"); //문자열은 반드시 큰따움표로 감싼다
		System.out.println("자바");
		System.out.println('a'); //문자는 작은따움표로 감싼다
		System.out.println(100); //정수
		System.out.println(3.14); //실수
		System.out.println(true); //부울린(true/false)
		System.out.println("원주율:" + 3.14);
		//+,-,*,/,%
		System.out.println(100+200);
		System.out.println(100-55.5);
		System.out.println(100*25);
		System.out.println(10/3);
		System.out.println(10%3);
	}

}
