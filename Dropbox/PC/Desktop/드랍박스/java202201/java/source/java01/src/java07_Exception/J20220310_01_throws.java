package java07_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.naming.AuthenticationException;

import java06_interface.sub.Member;

public class J20220310_01_throws {
	//throws : 예외를 던진다
	//장점 : 메소드의 내용을 간격하게(소스파악 용이)
	//       메소드를 호출측에서 예외에 대한 처리를 결정
	//ArrayIndexOutOfBoundsException : 언체크 예외
	static void arrayIndex() throws ArrayIndexOutOfBoundsException{

		int[] arr = {1,2,3,4,5};
		for(int i=0; i<= arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	//Exception : 모든예외를 던지겠
	static int div() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("나눌수는?");
		int a = sc.nextInt();
		return 100/a;
	}
	
	public static void main(String[] args) {
//		try {
//			arrayIndex();
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("잘못된 인덱스");
//		}
		
		int a = 0;
		try {
			a = div();
		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}
		System.out.println("리턴값:" + a);
		
		System.out.println("프로그램 종료");
	}

}
