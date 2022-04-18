package java01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J20220216_02_Scanner {
	//throws : 예외를 던진다
	public static void main(String[] args) throws FileNotFoundException {
		// 사용자입력받기
		//sc : 참조변수
		//new Scanner() : 객체를생성
		//System.in : 표준입력장치
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수는?");
//		int a = sc.nextInt(); //정수를 입력받아 a변수에 대입
//		System.out.println(a);		
		
		//실습) 두정수를 입력받아서 덧셈을 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 정수는?");
//		int a=sc.nextInt();
//		System.out.print("두번째 정수는?");
//		int b = sc.nextInt();
//		System.out.println("더하기:" + (a+b));
		
		//입력값을 엔터와 스페이스를 기준으로 분리
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두정수는?");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println(a+b);
		
		//실수를 입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("실수는?");
//		double d = sc.nextDouble();
//		System.out.println(d);
		
		//실습)반지름(실수)을 입력받아서 원의 넓이구하기
		//원의넓이 = 반지름*반지름*3.14
//		Scanner sc = new Scanner(System.in);
//		System.out.print("반지름은?");
//		double r = sc.nextDouble();
//		System.out.println("원의넓이는" + r*r*Math.PI);
//		
//		//소숫점 두자리로 출력
//		System.out.printf("%.2f\n", r*r*Math.PI);
//		System.out.println(Math.round(r*r*Math.PI*100));
//		System.out.println((double)Math.round(r*r*Math.PI*100)/100);
//		
//		sc.close(); //스트림 닫기
		
		//문자열을 입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열은?");
//		String s = sc.next();
//		String s2 = sc.next();
//		System.out.println("입력값1:" + s);
//		System.out.println("입력값2:" + s2);
		
		//이름을 입력을 받아 변수에 저장하고 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름은?");
//		String name=sc.nextLine();
//		System.out.println("당신의 이름은 " + name);
		
		//학과를 입력받고 이름받기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("학과는?");
//		String subject = sc.next(); //공백포함하지 않음
//		sc.nextLine(); //버퍼스트림에 남아있는 엔터처리
//		
//		System.out.print("이름은?");
//		String name = sc.nextLine(); //공백포함
//		
//		System.out.println("-------------------");
//		System.out.println("학과:" + subject);
//		System.out.println("이름:" + name);
		
		//실습)나이와 이름(공백포함)을입력받아 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이는?");
//		int age = sc.nextInt();
//		sc.nextLine(); //엔터처리
//		System.out.print("이름은?");
//		String name = sc.nextLine();
//		System.out.print("학과는?");
//		String subject = sc.nextLine();
//		System.out.println("나이:" + age);
//		System.out.println("이름:" + name);
//		System.out.println("학과:" + subject);
		
		//실습)나이를 입력받아서 20이상이면 성인
		//아니면 미성년자 출력
		//1)스캐너 객체 생성
//		Scanner sc = new Scanner(System.in);
//		//2)나이를 입력받기
//		System.out.print("나이는?");
//		int age = sc.nextInt();
//		//3)삼항연산자 이용 
//		String s = age>=20?"성인":"미성년자";
//		System.out.println(s);
		
		//실습)정수를 입력받아서 3의 배수인지 아니지 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수는?");
//		int a = sc.nextInt();
//		System.out.println(a%3==0?"3의배수":"3의 배수 아님");
		
		//Scanner로 파일 읽기
		//프로젝트폴더 밑에 data/test.txt
//		Scanner sc = new Scanner(new File("./data/test.txt"));
//		//sc.hasNext() : 다음데이터의 존재여부(true/false)
//		while (sc.hasNext()) { //데이터가 있다면
//			System.out.println("--");
//			String s = sc.nextLine();
//			System.out.println(s);
//		}
//		sc.close();
		
		//실습)합계와 평균 구하기
		//국영수점수를 입력받아서 총점과 평균(소숫점2자리)을출력
		Scanner sc = new Scanner(System.in);
		System.out.print("국어?");
		int kor = sc.nextInt();
		System.out.print("영어?");
		int eng = sc.nextInt();
		System.out.print("수학?");
		int math = sc.nextInt();
		int tot = kor + eng +math;
		double avg = (double)tot/3;
		//double avg = (double)Math.round((double)tot/3 * 100)/100;
		System.out.println("----------------");
		System.out.println("총점:" + tot);
		System.out.printf("평균:%.2f\n", avg);
		//System.out.println("평균:"+ avg);
		
		
		

	}

}
