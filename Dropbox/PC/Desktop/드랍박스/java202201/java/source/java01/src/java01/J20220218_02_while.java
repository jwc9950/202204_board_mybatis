package java01;

import java.util.Scanner;

public class J20220218_02_while {

	public static void main(String[] args) {
		// 반복문(while)
//		while(true) { //무한반복
//			//반복실행할 문장
//			System.out.println("자바!");
//		}
		//System.out.println("파이팅!");
		
		//10번 출력
//		int cnt = 0;
//		while(true) {
//			//cnt++;//cnt += 1;//cnt = cnt+1;
//			System.out.println(++cnt + " 자바!");
//			if (cnt > 9) break;
//		}
		
		
		//실습)1~10까지의 수중 짝수만 출력하세요
//		int cnt = 0;
//		while(true) {
//			cnt++;
//			if (cnt%2==1) System.out.println(cnt);
//			if (cnt >9) break;
//		}
		
		//실습)1~10까지 출력
		//디버깅모드:실행을 추적
//		int cnt=0;
//		while(cnt < 10) { //조건이 false가 되면 종료
//			cnt++;
//			System.out.println(cnt);
//		}
		
		
		//실습)
//		Scanner sc = new Scanner(System.in);
//		int cnt=0;
//		while (true) {
//			System.out.print("음악을 재생?");
//			String answer = sc.next();
//			//answer가 y가 아니라면 break
//			if (!answer.equals("y")) {
//				break;
//			}
//			cnt++;
//			System.out.println(cnt+"번 재생");
//		}
		
		//실습)정수를 입력받아서 더하기
		//만약 0을 입력하면 반복문 종료하고 더한합계를 출력
//		Scanner sc = new Scanner(System.in);
//		int s = 0; //지역변수는 반드시 초기화 되어야한다
//		while(true) {
//			System.out.print("정수는?");
//			int a = sc.nextInt();
//			if (a==0) break;
//			s = s+a;
//		}
//		
//		System.out.println("누적합계:" + s);
		
		//while의 문제점=>먼저 조건을 체크
		//조건을 나중에 체크해야 하는 문제는 적합하지 않다
//		Scanner sc = new Scanner(System.in);
//		int s = 0; //지역변수는 반드시 초기화 되어야한다
//		int a=4; //입력받는 정수
//		while(a!=0) {
//			System.out.print("정수는?");
//			a = sc.nextInt();
//			if (a==0) break;
//			s = s+a;
//		}
//		
//		System.out.println("누적합계:" + s);
		
		//do~while문
		//무조건 한번은 실행, 조건을 나중에 체크
//		Scanner sc = new Scanner(System.in);
//		int a,s = 0; //선언
//		do {
//			System.out.print("정수는?");
//			a = sc.nextInt();
//			s=s+a;
//		}while(a!=0); //문장의끝 ;을 반드시 해줘야 한다
//		
//		System.out.println("누적합계:" + s);
		
		//실습)원의 넓이 구하기
		//1)break문 이용
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("반지름은?");
//			double r = sc.nextDouble();
//			if (r==0) break;
//			if (r>0)
//				System.out.println("원의넓이 " + r*r*3.14);
//			else
//				System.out.println("다시 입력해 주세요!");
//		}
		
		//2)do~while문
//		Scanner sc = new Scanner(System.in);
//		double r; //반지름
//		do {
//			System.out.print("반지름은?");
//			r = sc.nextDouble();
//			if (r>0)
//				System.out.println("원의넓이는 " + r*r*3.14);
//			else if (r<0)
//				System.out.println("다시 입력해 주세요");
//				
//		}while(r!=0);
		
		//실습)메뉴고르기
//		Scanner sc = new Scanner(System.in);
//		String no;
//		do {
//			System.out.println("★★★★★★★★★★★★★★");
//			System.out.println("1.자장면\n2.짬뽕\n3.비빕밥\n4.햄버거");
//			System.out.println("-------------");
//			System.out.print("번호는?");
//			no = sc.next();
//			switch(no) {
//			case "1":
//			case "2":
//				System.out.println("6000원");
//				System.out.println("중식코너");break;
//			case "3":
//				System.out.println("7000원\n한식코너"); break;
//			case "4":
//				System.out.println("9000원\n양식코너"); break;
//			case "q": //
//				System.out.println("프로그램종료");
//				break; //switch의 종료
//			default:
//				System.out.println("잘못된 번호");
//			}
//			
//		}while(!no.equals("q")); //q와 같지 않을때 반복
		
		//실습)정수를 입력을 받아서 3의 배수일 때만 출력
		//0을 입력하면 종료
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("정수는?");
//			int a = sc.nextInt();
//			if (a==0) break; //반복문을 종료
//			if (a%3!=0) 
//				continue; //계속진행
//			System.out.println(a + "는 3의 배수");
//		}
		
		//실습)주사위 게임
		//a나 b가 3승이면 종료
//		int aCnt=0, bCnt=0; //이긴횟수
//		while(true) {
//			int a = (int)(Math.random())*6+1; 
//			int b = (int)(Math.random())*6+1;
//			System.out.println(a +" " + b);
//			if (a>b) {
//				System.out.println("a승");
//				aCnt++;
//			}else if (b>a) {
//				System.out.println("b승");
//				bCnt++;
//			}else
//				System.out.println("비김");
//			
//			//만약에 aCnt가 2보다크거나 
//			//	bCnt가 2보다 크면 break
//			if (aCnt>2 || bCnt>2) break;
//			
//		}
//		System.out.println("------------");
//		System.out.println("a승리횟수:"+aCnt);
//		System.out.println("b승리횟수:"+bCnt);
		
		//실습)업다운게임
		//1~100사이의 랜덤한 숫자를 저장하고
		//6번의 기회에 램덤숫자 맞추기
//		int r = (int)(Math.random()*100)+1;
//		System.out.println(r);
//		sc.nextInt();
		
		
		
		
		
		
		
		
		
		
		

	}

}
