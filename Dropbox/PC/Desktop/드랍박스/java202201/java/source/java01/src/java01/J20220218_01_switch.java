package java01;

import java.util.Scanner;

public class J20220218_01_switch {

	public static void main(String[] args) {
		// 조건문(switch)
		//숫자를 영어로
//		int a = 1;
//		if (a==0) {
//			System.out.println("zero");
//		}else if (a==1) {
//			System.out.println("one");
//		}else if (a==2) {
//			System.out.println("two");
//		}else {
//			System.out.println("잘못된 숫자");
//		}
		
		//switch문으로
		//{} : switch문 의 끝
		//break : 강제 종료 
//		int a=1;
//		switch(a) {
//		case 0:
//			System.out.println("zero"); break;
//		case 1:
//			System.out.println("one"); break;
//		case 2:
//			System.out.println("two"); break;
//		default:
//			System.out.println("잘못된 숫자");
//		}
		
		//실습)월의 마지막날을 출력
//		int mon=5;
//		switch(mon) {
//		case 1: 
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			System.out.println("31일"); break;
//		case 2:
//			System.out.println("28일");break;
//		case 4: 
//		case 6: 
//		case 9: 
//		case 11:
//			System.out.println("30일");
//		default:
//			System.out.println("잘못된 월");
//		}
		
		//실습)메뉴고르기
//		System.out.print("1.자장면\n2.짬뽕\n3.설렁탕\n4.비빕밥");
//		System.out.print("\n5.피자\n6.스파게티");
//		System.out.println("\n---------------");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("메뉴는?");
//		int no = sc.nextInt();
//		switch(no) {
//		case 1:
//		case 2: System.out.println("중식코너"); break;
//		case 3:
//		case 4: System.out.println("한식코너"); break;
//		case 5: 
//		case 6: System.out.println("양식코너"); break;
//		default :
//			System.out.println("잘못된 번호");
//		}
		
		//실습)
		//100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F
		Scanner sc = new Scanner(System.in);
		System.out.print("점수는?");
		int score = sc.nextInt();
		//System.out.println(80/10);
		switch(score/10) {
		case 10:
		case 9:System.out.println("A"); break;
		case 8:System.out.println("B"); break;
		case 7:System.out.println("C"); break;
		case 6:System.out.println("D"); break;
		default :
			System.out.println("F"); break;
		}
		
		

	}

}
