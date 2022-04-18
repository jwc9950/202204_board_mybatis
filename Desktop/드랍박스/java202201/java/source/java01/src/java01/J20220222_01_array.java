package java01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class J20220222_01_array {

	public static void main(String[] args) {
		// 배열
		//10,20,30
//		int[] a = null; //참조형:주소를 저장하는 변수명
//		a = new int[3]; //객체생성후 a에 할당
//		a[0] = 10; //런타임예외
//		a[1] = 20;
//		a[2] = 30;
//		System.out.println(a); //주소 출력
////		System.out.println(a[0]);
////		System.out.println(a[1]);
////		System.out.println(a[2]);
//		for(int i=0; i<3;i++) {
//			System.out.println(a[i]);
//		}
		
		//실수배열
		//1.1, 2.1, 3.1
//		double[] arr = new double[5];
//		//데이터 대입
//		arr[0] = 1.1;
//		arr[1] = 2.1;
//		arr[2] = 3.1;
//		
//		//데이터 출력
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		//문자형 배열
		//char[] arr = new char[5]; //반드시 크기를 입력
		//데이터를 초기화 할경우 크기를 무조건 생략
		//char[] arr = new char[] {'a', 'b', 'c','d','e'};
		//데이터를 초기화 할경우 new연산자 생략 가능
//		char[] arr = {'a', 'b', 'c','d','e'};
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		//실습)1~10을 배열에 저장하고 출력
		//배열에 저장, 출력시 반복문
//		int[] arr = new int[10] ;
//		//대입
//		for(int i=0; i< arr.length; i++) {
//			arr[i] = i+1;
//		}
//		//출력
//		for(int i=0; i< arr.length; i++)
//			System.out.println(arr[i]);
		
		//실습)10,20,30....100
//		int[] arr = new int[10];
//		for(int i=0; i < arr.length; i++) {
//			arr[i] = (i+1) * 10;
//			System.out.println(arr[i]);
//		}
		
		//실습) 1.1, 2.1, 3.1.....10.1
//		double[] arr = new double[10];
//		for(int i=0; i< arr.length; i++) {
//			arr[i] = i+1.1;
//		}
//		for(int i=0; i< arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//for~each문
//		int[] arr = {10,20,30,40,50};
//		for(int i=0; i<arr.length; i++)
//			System.out.println(arr[i]);
//		
//		for(int a:arr) {
//			System.out.println(a);
//		}
		
		//실습)for~each문으로 출력
//		double[] arr = {3.14, 5.78, 9.65};
//		for(double d:arr) {
//			System.out.println(d);
//		}
//		
//		char[] arr2 = {'가','나','다'};
//		for(char c:arr2) {
//			System.out.println(c);
//		}
//		
//		boolean[] arr3 = {false, true, false, false, true};
//		for(boolean b:arr3) {
//			System.out.println(b);
//		}
		
		//실습)성적 평균 구하기
//		int[] arr = new int[3];
//		Scanner sc = new Scanner(System.in);
//		//입력받기
//		for(int i=0; i<arr.length; i++) {
//			System.out.print("점수는?");
//			arr[i] = sc.nextInt();
//		}
//		System.out.println(Arrays.toString(arr) );
//		//합계, 평균 구하기
//		int s=0; //합계
//		for(int a:arr) {
//			s += a;//s = s+a;
//		}
//		System.out.println("합계:" +s );
//		System.out.println("평균:" + (double)s/arr.length );
		
		
		//실습)학생들의 키(double)의 평균 구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("학생수는?");
//		int num = sc.nextInt(); //학생수
//		double[] arr = new double[num]; //자바는 동적배열
//		//데이터를 입력받기
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(i+1 +"번 키는?");
//			arr[i] = sc.nextDouble();
//		}
//		System.out.println(Arrays.toString(arr));
//		//평균구하기
//		double s=0;
//		for(double a:arr) {
//			s+=a;//s = s+d;
//		}
//		System.out.println("합계:" + s);
//		System.out.println("평균:" + s/arr.length);
		
		//실습)피보나치 수열(10개) 구하기
		//1,1,2,3,5,8,13,21,34.....
//		int[] pibo = new int[10];
//		
//		pibo[0] = 1;
//		pibo[1] = 1;
//		for(int i=2; i<pibo.length; i++) {
//			pibo[i] = pibo[i-2] + pibo[i-1];
//		}
//		System.out.println(Arrays.toString(pibo));
//		for(int a:pibo) {
//			System.out.println(a);
//		}
		
		//실습)채점프로그램(점수 출력)
//		int[] right = {4,2,3,1,2}; //정답배열
//		int[] answer = new int[right.length]; //대답배열
//		
//		Scanner sc = new Scanner(System.in);
//		//대답 입력
//		for(int i=0; i<answer.length; i++) {
//			System.out.print(i+1+"답은?");
//			answer[i] = sc.nextInt();
//		}
//		System.out.println(Arrays.toString(answer));
//		
//		//채점
//		int rCnt=0; //맞은 갯수
//		for(int i=0; i<answer.length; i++) {
//			//만약에 right[] 값과 answer의 값이 같다면 rCnt++
//			if (right[i]==answer[i]) rCnt++;
//		}
//		//점수 출력
//		System.out.println("맞은갯수:" + rCnt);
//		System.out.println("점수:" + rCnt*100/answer.length);
//		
		//실습)로또 프로그램(1~45의 정수중 6개의 램덤의 수)
		//1~45
//		for(int i=0; i<6; i++) {
//			System.out.println((int)(Math.random()*45) +1);
//		}
//		int[] lotto = {45,22,12,9,34,11};
//		int[] no = {22,12,7,33,5};
//		int rCnt=0;
//		for(int n: no) {
//			for(int lo : lotto) {
//				
//			}
//		}
 		
		
		//문자열의 배열
		//"python", "java", "oracle"
//		String[] arr=new String[3];
//		arr[0] = "python";
//		arr[1] = "java";
//		arr[2] = "oracle";
//		
//		//for문
//		for(int i=0; i < arr.length; i++)
//			System.out.println(arr[i]);
//		
//		//for~each문
//		for(String s:arr) {
//			System.out.println(s);
//		}
		
		//실습)이름을 입력(3명)받아서 배열에 저장하고 출력
//		Scanner sc = new Scanner(System.in);
//		//선언
//		String[] names = new String[3];
		
		//입력받기
//		for(int i=0; i<names.length; i++) {
//			System.out.print("이름은?");
//			names[i] = sc.next();
//		}
//		System.out.println(Arrays.toString(names));
//		
//		//출력
//		for(String s:names) {
//			System.out.println(s);
//		}
		
		//클래스를 배우고 나서 나중에 
//		List<String> list = new ArrayList<String>();
//		list.add("kim");
//		list.add("park");
//		System.out.println(list);
		
		//실습)만약에 아이디가 root이면 관리자 출력 
		//아니면 일반 사용자 
//		String[] ids={"python", "root", "java", "hr"};
//		
//		for(String id:ids) {
//			System.out.print(id + ":");
//			if (id.equals("root")) {
//				System.out.println("관리자");
//			}else {
//				System.out.println("일반사용자");
//			}
//		}
		
		//실습)최대값, 최솟값 구하기
//		int[] arr= {5,7,1,9,4,2};
//		//최대값 : 9
//		int max= arr[0]; //배열의 첫번째 값을 초기값으로
//		for(int i=1; i<arr.length; i++) {
//			if (arr[i] > max) max=arr[i];
//		}
//		
//		System.out.println("max:" + max);
		
		//최솟값 : 1
//		int[] arr= {5,7,1,9,4,2};
//		int min=arr[0]; 
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i] < min) min = arr[i];
//		}
//		System.out.println("min:" + min);
		
		//실습)교재 183page 9번 도전
		
		
		
		
		
		
		
		
		
		
		
	}

}
