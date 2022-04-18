package java01;

import java.util.Scanner;

public class J20220217_01_if {

	public static void main(String[] args) {
		// 조건문(if)
//		if (true) { //조건이 참일때 실행
//			System.out.println("참");
//		}
		
		//양수, 음수출력
//		int a=-10;
//		System.out.println(a > 0 ? "양수" : "음수");
//		if (a > 0) {
//			//조건문이 참일때
//			System.out.println("양수");
//		}else {
//			System.out.println("음수");
//		}
		
		//실습)정수가 짝/홀수 출력 
//		int a =11;
//		if (a%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
		
		//실습)두정수중 큰수를 출력
		//이중조건문
//		int a=30, b=30;
//		if (a>b) 
//			System.out.println(a + ":a가 더큼");
//		else if (b>a) 
//			System.out.println(b + ":b가 더큼");
//		else 
//			System.out.println("두수는 같다");
			
		//실습) 
		// 100~90점: good, 89~80점: soso, 79~0 try 출력
		//단점수는 0~100점 사이, 그외는 에러 출력
//		int score = 88;
//		if (score >100 || score <0) 
//			System.out.println("에러");
//		else if (score >= 90) 
//			System.out.println("good");
//		else if (score >= 80) 
//			System.out.println("soso");
//		else 
//			System.out.println("try");
		
		//실습)100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F
		//{} : 코드를 묶는다
//		Scanner sc = new Scanner(System.in); //키보드에서 입력
//		System.out.print("점수는?");
//		int score = sc.nextInt();
//		if (score>100 || score <0) {
//			System.out.println("점수 에러");
//		}
//		else if (score >= 90) {
//			System.out.println("A");
//		}
//		else if (score >= 80) {
//			System.out.println("B");
//		}
//		else if (score >= 70) {
//			System.out.println("C");
//		}
//		else if (score >= 60) {
//			System.out.println("D");
//		}
//		else {
//			System.out.println("F");
//		}
			
		//실습)상대평가 학점
//		Scanner sc = new Scanner(System.in);
		
//		int rank = sc.nextInt(); //내등수
//		int tot = sc.nextInt(); //전체학생수
//		
//		System.out.println(0.15 * tot); //A학점의 인원수
//		System.out.println((double)rank / tot); //나의 백분률
//		
//		if (rank < tot * 0.15)
//			System.out.println("A학점");
//		else if (rank < tot * 0.35)
//			System.out.println("B학점");
//		else if (rank < tot * 0.5)
//			System.out.println("C학점");
//		else 
//			System.out.println("D학점");
		
		//실습)계산기 프로그램
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두정수를 입력:");
//		int a = sc.nextInt(), b = sc.nextInt();
//		
//		System.out.print("기호는?");
//		String sign= sc.next();
//		
//		if (sign.equals("+")) { //문자열의 비교(값을비교)
//			System.out.println("더하기:" + (a+b));
//		}else if (sign.equals("-")) {
//			System.out.println("빼기:" + (a-b));
//		}else if (sign.equals("*")) {
//			System.out.println("곱하기:" + (a*b));
//		}else if (sign.equals("/")) {
//			System.out.printf("나누기: %.2f\n", (double)a/b);
//		}else if (sign.equals("%")) {
//			System.out.println("나머지:" + (a%b));
//		}else {
//			System.out.println("+,-,*,/, % 연산만 가능");
//			System.out.println("다시 입력해 주세요!!");
//		}
		
		//실습)국영수, 총점 평균
//		int kor=80, eng=94, math=74;
//		//또는(||), 그리고(&&)
//		if (kor<60 || eng<60 || math<60) {
//			System.out.println("과락입니다.");
//		}else {
//			//총점
//			int tot = kor + eng + math;
//			//평균
//			double avg = (double)tot/3;
//			
//			System.out.println("총점:" + tot);
//			System.out.printf("평균:%.2f\n", avg);
//			
//		}
		
		//실습)적정체중 구하기
//		String name="홍길동";
//		double height = 160, weight=57;
//		//평균체중
//		double normal = (height-100) * 0.9;
//		System.out.println("평균체중:" + normal);
//		
//		if (weight < normal * 0.95) {
//			System.out.println(name + "님 미달");
//		}else if (weight <= normal * 1.05) {
//			System.out.println(name + "님 정상");
//		}else {
//			System.out.println(name + "님 과체중");
//		}
		
		//실습)섭씨/화씨 변환
//		Scanner sc = new Scanner(System.in);
//		System.out.print("변환 온도는?");
//		double t = sc.nextDouble();
//		String unit = sc.next();  //C:섭씨, F:화씨
//		double result;
//		
//		if (unit.equals("C")) { //섭씨->화씨
//			//{} 안의 지역변수,{}밖에서는 사용 불가능
//			//선언은 {} 밖에서
//			result = t * 9 / 5 +32;
//		}else if (unit.equals("F")) { //화씨 -> 섭씨
//			result = (t - 32) * 5 / 9; 
//		}else {
//			System.out.println("잘못된 단위");
//		}
//		System.out.println(result);
		
		//반드시 지역변수는 초기화가 되야한다
//		int a=10;
//		String s = null; //참조변수는 null로 초기화
//		if (a>0) {
//			s = "양수";
//		}else {
//			System.out.println("음수");
//		}
//		System.out.println(s);
		
		//실습)아이디,패스워드 체크
		//기존등록된 정보
//		String dbid = "java";  
//		String dbpw = "1234";
		
		//로그인시 등록된 정보
//		Scanner sc = new Scanner(System.in);
//		System.out.print("아이디는?");
//		String id=sc.next();
//		
//		if (id.equals(dbid)) {
//			System.out.println("아이디가 일치");
//			System.out.print("패스워드는?");
//			String pw = sc.next();
//			if (pw.equals(dbpw)) {
//				System.out.println("패스워드 일치");
//				System.out.println("로그인 성공");
//			}else {
//				System.out.println("패스워드가 불일치");
//			}
//		}else {
//			System.out.println("아이디가 불일치");
//		}

		//윤년체크(주말과제)
		//윤년: 2월이 29일
		//윤년의 조건 : 1)4의배수이면 윤년
		//              2)100의 배수이면 평년
		//              3)400의 배수이면 윤년 
		
		
		
		
		
		
		
		
		
		

	} //메소드 닫기

} //클래스 닫기
