package java01;

public class J20220215_01_print {

	public static void main(String[] args) {
		//단축키 : ctrl + / => 주석 토글
		//산술연산:+,-,*,/, %
//		System.out.println(3+2); //더하기
//		System.out.println(3-2); //빼기
//		System.out.println(3*2); //곱하기
		//정수와 정수의 계산은 정수
		//실수와 정수의 계산은 실수
//		System.out.println(8/3); //몫:2, 나누기:1.5
//		System.out.println(13%5); //나머지
		
		//print():메소드
		//\n : 이스케이프 문자
//		System.out.println(); //자동개행(\n)
//		System.out.print("헬로우!\n");//개행기능이 없다
//		System.out.print("자바\n");
//		System.out.println("------------------");
//		System.out.println("1.자장면\n2.짬뽕");
//		
//		System.out.println(100 + "\n");
		
		//\, " 문자로 취급
//		System.out.println("\\korea=\"seoul\"");
		
		//printf():메소드
		//포맷문자열에 의해서 출력
//		System.out.printf("%d",10);
//		System.out.printf("\n%d + %d = %d",20,3,20+3);
//		System.out.printf("\npi %.2f", 20/3.);
//		System.out.printf("\n%c100",'$'); //문자의 포맷문자열
//		System.out.printf("\n헬로우 %s", "자바");
		//실습)
		//10 - 3 = 7
		//10 * 3 = 30
		//10 / 3 = 3.33
		//10 % 3 = 1
		System.out.printf("%d - %d = %d\n", 10,3,10-3);
		System.out.printf("%d * %d = %d\n", 10, 3, 10*3);
		System.out.printf("%d / %d = %.2f\n", 10, 3, 10/3.);
		System.out.printf("%d %% %d = %d\n", 10, 3, 10%3);
		
		
	}

}
