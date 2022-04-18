package java11_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class J20220311_01_List {

	public static void main(String[] args) {
		//자료구조: 데이터를 메모리나 저장장치에 저장하고 사용하는 논리적인 구조
		//          프로그램의 성능이 좌우
		//저장방식 : 리스트, 스택, 큐, 트리, 해쉬..
		//자바 프레임워크 : 잘 정의된 구조의 클래스들
		
		//배열(리스트) 
//		int[] arr = {1,2,3,4,5};
//		int[] arr2 = new int[6];
//		for(int i=0; i<arr.length; i++) {
//			arr2[i] = arr[i];
//		}
//		arr2[arr2.length-1] = 6;
//		System.out.println(Arrays.toString(arr2));
		
		//1)리스트(List) : 순서가있다(index가있다), 중복데이터 허용
		//1-1)ArrayList
		//배열기반 : 검색시 유리, 추가/삭제 어렵다
		//다형성을 이용해서 ArrayList 참조변수선언
//		List<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(10);
//		System.out.println(list);
		
		//실습)이름을 저장할수있는 ArrayList를 생성
//		List<String> list = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("이름은?");
//			String name = sc.nextLine();
//			if (name.equals("")) break;
//			list.add(name);
//		}
//		System.out.println(list);
//		//for문
//		//index를 이용해서 출력
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i)); 
//		}
//		//for each문
//		for(String name:list) {
//			System.out.println(name);
//		}
		
		//회원정보의 리스트를 만들기
//		List<Member> list = new ArrayList<>();
//		Member member = new Member("java","1111");
//		list.add(member);
//		member = new Member("hong","2222");
//		list.add(member);
//		System.out.println(list);
//		
//		//출력
//		for(int i=0; i< list.size(); i++) {
//			System.out.println("아이디:" + list.get(i).getUserid()); 
//			System.out.println("비밀번호:" + list.get(i).getPasswd());
//		}
//		System.out.println("--------------------------");
//		for(Member m:list) {
//			System.out.println("아이디:" + m.getUserid());
//			System.out.println("비밀번호:" + m.getPasswd());
//		}
		
		//1-2)LinkedList
		//추가,삭제 쉽다, 검색시 성능 저하
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(50);
		list.add(30);
		System.out.println(list);
		for(int a:list) {
			System.out.println(a);
		}
		
		
		
		

	}

}
