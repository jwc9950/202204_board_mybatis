package java07_Exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

import java06_interface.sub.Member;

public class J20220308_01 {

	public static void main(String[] args) {
		// 예외처리 : 개발자가 처리할수 있는 오류
		
//		Scanner sc = new Scanner(System.in);
//		int a=10;
//		System.out.print("나눌수는?");
//		int b = sc.nextInt();
//		try {
//			System.out.println(a/b);	
//		}catch(ArithmeticException e) { //예외를 잡아서 처리
//			System.out.println("0으로 나눌수 없습니다.");
//		}
//		
//		System.out.println("프로그램 진행.....");
		
		//두가지 이상의 예외발생
		//두정수의 나눗셈
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두정수는?");
//		try {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println(a/b);
//		//예외가 발생되면 JVM이 예외객체를 생성해서 catch에 전달
//		}catch(InputMismatchException e) {
//			System.out.println("숫자를 입력해 주세요!");
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나눌수 없습니다.");
//		}catch(Exception e) { //모든 예외 처리
//			System.out.println("예외발생");
//		}
		
		//실습)NullPointerException 
//		try {
//			Member member=null;
//			System.out.println(member.getName());
//		} catch(NullPointerException e) {
//			System.out.println("멤버객체 미존재");
//			e.printStackTrace(); //예외 출력 메시지
//		} catch (Exception e) {
//			System.out.println("예외처리");
//			e.printStackTrace();
//		}
		
		//실습) 
//		try {
//			int[] arr ={1,2,3};
//			for(int i=0; i<=3; i++) {
//				System.out.println(arr[i]);
//			}
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("잘못된 인덱스 접근");
//		}catch (Exception e) {
//			System.out.println("예외 발생");
//			e.printStackTrace();
//		}
//		
//		System.out.println("프로그램 진행...");
		
		//체크예외 : 반드시 처리해야 하는 예외
		//         RuntimeException을 상속을 받지 않은 예외
		//파일읽기
		//프로젝트 폴더기준 상대경로
//		File file = new File("./data/test.txt");
//		//절대경로
//		//File file = new File("D:/Dropbox/java2022_1/java/source/java01/data/test.txt");
//		Scanner sc = null; //초기값
//		try {
//			sc = new Scanner(file);
//			System.out.println("파일이 존재");
//			while(sc.hasNext()) {
//				System.out.println(sc.next());
//			}
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("파일이 미존재!!");
//			//e.printStackTrace();
//		} catch (Exception e) {
//			System.out.println("예외 발생");
//			//e.printStackTrace();			
//		}finally { //예외가 발생하든 안하든 무조건 실행 블록
//			if (sc != null) sc.close();	
//			System.out.println("종료");
//		}

		//파일을 읽어오기
//		FileReader fr =null;
//		BufferedReader br = null;
//		try {
//			fr = new FileReader("./data/test2.txt"); //문자단위 읽기 스트림
//			br = new BufferedReader(fr); //보조스트림(속도향상,한라인단위로 읽기)
//			while(true) {
//				String s = br.readLine();
//				if (s == null) break;
//				System.out.println(s);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("파일이 없습니다");
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("파일 읽기 실패");
//			e.printStackTrace();
//		}finally {
//			try {
//				if (br != null)br.close();
//				if (fr != null)fr.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
		
		//파일만들기
//		FileWriter fw = null; //문자출력 스트림
//		BufferedWriter bw = null; //보조출력스트림
		PrintWriter pw = null; //보조출력스트림
		try {
//			fw = new FileWriter("./data/fileWriter.txt");
//			bw = new BufferedWriter(fw);
//			pw = new PrintWriter(bw, true); //true:자동으로 버퍼 비움
			
			pw = new PrintWriter(
					new BufferedWriter(
							new FileWriter("./data/fileWriter.txt")), true); //true:자동으로 버퍼 비움
			
			pw.println("안녕!");
			pw.println("자바");
			pw.printf("%d + %d = %d\n", 30, 20, 30+20);
			//pw.flush();//true가 없으면
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
//			if (fw!=null) fw.close();
//			if (bw !=null) bw.close();
			if (pw != null) pw.close();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
