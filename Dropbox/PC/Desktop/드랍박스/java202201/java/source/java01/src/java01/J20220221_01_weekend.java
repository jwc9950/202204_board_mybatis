package java01;

import java.util.Scanner;

public class J20220221_01_weekend {

	public static void main(String[] args) {
		// 주말과제
		//1)두변수의 값 바꾸기
//		int a=10, b=20;
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println("a:" + a + "  b:" + b);
		
		//2)시분초구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇초?");
//		int s = sc.nextInt();
//		int t =s/3600;
//		System.out.println(t+"시간");
//		int r = s%3600; //나머지 초
//		//System.out.println(r);
//		int m = r/60;
//		System.out.println(m+"분");
//		int ss = r%60; //나머지 초
//		System.out.println(ss + "초");
		
		//3)윤년체크(주말과제)
		//윤년: 2월이 29일
		//윤년의 조건:1)4의배수이면 윤년
//		              2)100의 배수이면 평년
//		              3)400의 배수이면 윤년 
		Scanner sc = new Scanner(System.in);
		System.out.print("년도는?");
		int year = sc.nextInt();
		if (year%4==0 && year%100 != 0 || year%400==0) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
		
		
		
		

	}

}
