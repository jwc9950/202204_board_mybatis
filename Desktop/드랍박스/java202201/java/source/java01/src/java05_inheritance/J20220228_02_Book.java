package java05_inheritance;
class Book{
	public static final String storename = "이젠서점";
	//컴파일에러를 피하기위해만든 메소드
	public String getName() {
		return "";
	}
}
class ItBook extends Book{
	private String name;
	ItBook(String name){
		this.name = name;
	}
	//부모의 getName을 오버라이딩
	//오버라이딩:부모메소드를 재정의
	//           자식클래스의 메소드가 실행
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ItBook [name=" + name + "]";
	}
}
class EssayBook extends Book{
	private String name;
	EssayBook(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EssayBook [name=" + name + "]";
	}
}
//입고,출고 클래스
class InOut{
	//입고메소드
	void in(Book book, int qty) {
		//예)자바프로그래밍 10권 입고
		System.out.println("입고:" +book.getName() + qty+"권");
	}
	//출고메소드
	void out(Book book, int qty) {
		//예)자바프로그래밍 5권 출고
		System.out.println("출고:" +book.getName() + qty+"권");
	}
}

public class J20220228_02_Book {
	public static void main(String[] args) {
		//런타임시에 객체 생성
		Book itBook =  new ItBook("자바프로그래밍");
		EssayBook esBook = new EssayBook("윌에세이");
		System.out.println(itBook);
		//컴파일시 메소드존재여부 체크
		//System.out.println("책이름:" +itBook.getName());
		
		//입고,출고 객체 생성
		InOut inout = new InOut();
		System.out.println("-------------------");
		System.out.println(Book.storename);
		System.out.println("-------------------");
		inout.in(itBook, 10);
		inout.in(esBook, 15);
		inout.out(esBook, 7);
		inout.out(itBook, 9);
		

	}

}
