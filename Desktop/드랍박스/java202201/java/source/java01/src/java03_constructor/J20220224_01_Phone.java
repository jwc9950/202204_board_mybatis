package java03_constructor;

import java.util.Scanner;

//생성자
//핸드폰클래스
class Phone{
	//필드:이름(String), 용량(int)
	String name;//null초기화
	int capacity;//0 초기화
	//생성자:객체를 생성할때 자동으로 실행되는 메소드
	//반환형이 없다
	//생성자가 없다면 컴파일러가 자동으로 기본생성자를 만든다
	//생성자를 만들면 컴파일러가 기본생성자를 만들지 않는다
	//생성자의 오버로딩:
	//매개변수의 형또는 갯수가 다르면 생성자 중복가능
	Phone(){} //기본생성자
	Phone(String name, int capacity){
		//매개변수명과 필드명이 같으면 매개변수명이 우선
		//this:객체자신(객체의 주소)
		System.out.println("생성자" + this);
		this.name = name;
		this.capacity = capacity;
	}
	//매개변수가 이름인 생성자
	Phone(String name){
		this.name = name;
	}
	//매개변수가 용량인 생성자
	Phone(int capacity){
		this.capacity = capacity;
	}
	
	//메소드
	//전화걸기출력
	void call() {
		System.out.println(name + " 전화걸기");
	}
	//내폰의 정보 출력
	void info() {
		System.out.println("종류:" + name);
		System.out.println("용량:" + capacity + "GB");
	}
	
}

public class J20220224_01_Phone {
	public static void main(String[] args) {
		// 객체생성
		Phone p1 = new Phone();//기본생성자를 이용해서 객체 생성
		p1.call();
		p1.info();
		Phone p2 = new Phone("아이폰", 64);
		p2.info();

	}

}
