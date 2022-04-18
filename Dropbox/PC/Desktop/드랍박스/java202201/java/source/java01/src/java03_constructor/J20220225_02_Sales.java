package java03_constructor;

import java.util.Scanner;
//상품클래스
class Product{
	//정적멤버:프로그램시작시 static영역에 저장
	//	인스턴스의 생성과는 상관없이 사용가능
	//	정적메소드는 인스턴스필드는 사용불가
	//	프로그램 종료시 소멸
	
	//정적필드
	//public :접근제한자(모든클래스 접근가능)
	//static : 정적멤버(static메모리에 상주)
	//final : 상수(값 변경불가능)
	//final은 반드시 초기화
	//public static final String COMPANY="이젠슈퍼";
	public static final String COMPANY;
	static { //static초기화 블록
		//파일이나 db에서 정보를 가져와서 초기화 가능
		COMPANY = "이젠슈퍼";
	}
	final String TYPE;
	{
		TYPE = "공상품";
	}
	
	private String pcode;
	private String pname;
	private int price;
	
	public Product(String pcode, String pname, int price) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
	}
	//정적메소드
	//타이틀 출력 메소드
	static void titlePrint() {
		System.out.println("-------------------");
		System.out.println("[" +COMPANY+"]");
		System.out.println("-------------------");
	}
	
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", pname=" + pname + ", price=" + price + "]";
	}
	
}
//판매클래스
class Sales{
	
	//상품판매금액을 반환하는 클래스
	//매개변수 : 상품, 판매수량
	//반환값 : 판매금액
	int productSale(Product product, int qty) {
		return product.getPrice() * qty;
	}
}

public class J20220225_02_Sales {

	public static void main(String[] args) {
//		System.out.println("-------------------");
//		System.out.println(Product.type);//정적필드
//		System.out.println("-------------------");
		//Product.company = "국제"; 상수는 변경 불가능
		Product.titlePrint(); //정적메소드
		Scanner sc = new Scanner(System.in);
		Product p1 = new Product("8801", "라면", 800);
		System.out.println(p1);
		Sales sales = new Sales();
		
		
		while (true) {
			System.out.print("구매갯수는?");
			int qty = sc.nextInt();
			if (qty==0) {
				System.out.println("프로그램 종료!");
				break;
			}
			int sellPrice = sales.productSale(p1, qty);
			System.out.println("판매금액:" + sellPrice+"원");
		}

		
	}

}
