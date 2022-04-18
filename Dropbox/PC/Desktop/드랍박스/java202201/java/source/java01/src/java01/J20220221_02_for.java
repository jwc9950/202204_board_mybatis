package java01;

import java.util.Scanner;

public class J20220221_02_for {

	public static void main(String[] args) {
		// 반복문(for)
		//while문 (1~10 출력)
//		int i=0; //선언과 초기화
//		while(i<10) { //조건식
//			i++; //증감식
//			System.out.println(i);
//		}
		
		//for문으로 1~10출력
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//		}
		
		//실습)10부터 19까지 출력
		//10,11,12,....19
//		for (int i=10; i<20;i++) {
//			System.out.println(i);
//		}
		//반복범위가 주어질때는 for문 유리
		//아니면 while문 유리(사용자입력값 처리, 파일 입출력 ...)
		//실습)0,2,4,6,8,10 출력
//		for(int i=0;i<11;i+=2) {
//			System.out.println(i);
//		}
//		//System.out.println(i); //i는 {}의 지역변수 사용불가
//		System.out.println("---------------");
//		for(int i=0; i<11; i++) {
//			//조건문
//			if (i%2==0)
//				System.out.println(i);
//		}
//		System.out.println("---------------");
//		for(int i=0; i<11; i++) {
//			if (i%2!=0) continue; //계속진행
//			System.out.println(i);
//		}
		
		//1~10까지의 합
		//1+2+3+4+5+....10
//		int s=0; //누적합계
//		for(int i=1; i<11;i++) {
//			s=s+i;
//			//System.out.println(i + " " + s);
//		}
//		System.out.println("누적합계:" + s);
		
		//실습)n단 구구단
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단수는?");
//		int dan = sc.nextInt();
//		
//		for(int i=1; i<10; i++) {
//			//System.out.println(dan + "★" + i + "=" + dan*i);
//			System.out.printf("%d★%d=%d\n",dan, i, dan*i);
//		}
//		sc.close();
		
		
		//이중 for문
//		for(int i=0; i<10;i++) {
//			for(int j=0; j<10; j++)
//				System.out.println(i + " " + j);
//		}
		
		//실습)2단~9단 출력
//		for(int i=2; i<10; i++) {
//			System.out.println(i + "단");
//			for(int j=1; j<10; j++)
//				System.out.printf("%d * %d = %d\n",i,j, i*j);
//		}

		//실습)별찍기1
		// *
		// **
		// ***
//		for(int i=0; i<10;i++) {
//			for(int j=0; j<i+1; j++)
//				System.out.print("*");
//			System.out.println();//개행
//		}
		//2)별찍기2
//		for(int i=0; i<5;i++) {
//			for(int j=0; j<5-i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();//개행
//		}
		
		//3)별찍기3
//		for(int i=0; i<5;i++) {
//			for(int j=0; j<5-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<i+1;j++) {
//				System.out.print("*");
//			}
//				
//			System.out.println();//개행
//		}
		
		//4)별찍기4
		Scanner sc = new Scanner(System.in);
		System.out.print("줄수?");
		int line = sc.nextInt();
		for(int i=0; i<line;i++) {
			for(int j=0; j<line-1-i; j++) //공백찍기
				System.out.print(" ");
			for(int j=0; j<i*2+1; j++) //별찍기
				System.out.print("*");
			System.out.println();//개행
		}
		
		
		
		
		
		//Math.random() 메소드
		//난수(0 <= r < 1)
//		double r = Math.random();
		//System.out.println((int)(r*10)+1); //0~9 + 1 => 1~10 
		
		//실습)주사위 게임
		//5게임을 실행
//		int aCnt=0, bCnt=0; //이긴횟수
//		for(int i=0; i<5; i++) {
//			int a = (int)(Math.random()*6)+1; //주사위의 눈
//			int b = (int)(Math.random()*6)+1;
//			System.out.println(a +" " + b);
//			if (a>b) {
//				System.out.println("a승");
//				aCnt++;
//			}else if (b>a) {
//				System.out.println("b승");
//				bCnt++;
//			}else
//				System.out.println("비김");
//		}
//		System.out.println("------------");
//		System.out.println("a승리횟수:"+aCnt);
//		System.out.println("b승리횟수:"+bCnt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
