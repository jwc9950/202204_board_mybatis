package java01;

import java.math.BigDecimal;

public class J20220215_03_variable {

	public static void main(String[] args) {
		//변수:데이터를 저장하기 위한 메모리의 공간
		//변수의 장점 : 데이터의 재활용
		//메소드안에 선언되는 변수는 로컬(지역)변수
		//로컬변수는 반드시 초기화후 사용
		
		//정수형 변수(4byte)
		//변수명: 변수를 접근하기 위한 이름
//		int a;  //정수를 저장하기위한 변수를 선언
//		a = 10; //= 대입연산자 
//		System.out.println(a);
		
		//실습)정수형 변수를 2개선언하고 값을 할당하고 덧셈을 출력 
		
//		int a=35, b=10; //선언과동시에 초기화
//		System.out.printf("%d + %d = %d\n",a,b, a+b);
//		System.out.printf("%d - %d = %d\n", a,b,a+b);
//		System.out.printf("%d * %d = %d\n", a,b,a*b);
//		//a를 실수형으로 변환(형변환연산자)후 b와연산
//		System.out.printf("%d / %d = %.2f\n", a,b,(double)a/b);
		
		//실수형 변수
		//작은형은 큰형에 자동 대입
		//큰형은 작은형에 자동 대입 불가
//		double d = Math.PI;  //8byte, pi값을 가지고 있는 상수
//		float f = 3.141592653589793f;  //4byte
//		double d2 = 10;
//		System.out.println(d);
//		System.out.printf("%20.15f\n", d);
//		System.out.printf("%20.15f\n", f);
//		System.out.println(d2);
		
		//부동소숫점방식의 오차
		//정확도의 문제점
//		double d1 = 608.4, d2 = 206.2;
//		System.out.println(d1+d2);
//		System.out.printf("%.2f\n", d1+d2);
		
		//정확도를 요하는 계산
		//클래스
//		BigDecimal b1 = new BigDecimal("608.4");
//		BigDecimal b2 = new BigDecimal("206.2");
//		System.out.println(b1.add(b2));
		
		//논리형(true/false)
//		boolean b = false;
//		System.out.println(b);
		
		//문자열(클래스)
		//call_by_reference방식
//		String s;//변수에 주소가 저장
//		s = "hello";
//		System.out.println(s);
//		System.out.println(s.toUpperCase());
		
		//주소/값 
//		String s = new String("hello");
//		String s2 = "hello";
//		String s3 = "hello";
//		System.out.println(s);
//		System.out.println(s2);
//		
//		//== : 비교연산자(같은지 비교)
//		//잘못된 예
//		System.out.println(s==s2);//주소비교, true/false
//		System.out.println(s2==s3);//주소비교 , 주소가 같다
//		//바른 예
//		System.out.println(s.equals(s2));//문자열의 비교
		
		//실습1)
//		int a=100; //정수(변수)
//		double d=200.5; //실수
//		System.out.println(a);
//		System.out.println(d);
		
		//실습2)오차 발생
//		double d1=608.4, d2=206.2;
//		System.out.println(d1+d2);
		
		//형변환
//		double d = 10;//자동형변환
//		System.out.println(d);
//		
//		float f =(float)10.5; //명시적인 형변환  
		
		//실습)
//		double pi=3.14;
//		int a = (int)pi;
//		System.out.println(a);
		
		//실습)
//		char c = '가';
//		int a = c; //자동형변환
//		System.out.println(a);
		
		//문자열을 정수로 변환
//		String s = "10";
//		int a=Integer.parseInt(s);//래퍼클래스 이용
//		System.out.println(a);
//		System.out.println(a+20);
		
		//변수:변경이 가능
		int a =10;
		a=20;
		System.out.println(a);
		
		//상수:변경이 불가능
		final int B; //선언
		B = 10; //초기화
		//b = 20;
		System.out.println(B);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
