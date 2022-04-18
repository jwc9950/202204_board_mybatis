package java02_class;
//상품 클래스
class Item{
	//필드 : 이름(String), 단가(int)
	String name="새우깡";
	int price = 1200;
	//메소드: getSales
	//판매수량*단가를 곱한 금액을 리턴해주는 메소드
	//매개변수(수량:int)
	//리턴값 : 판매금액
	int getSales(int qty) { //정상판매금액
		return price * qty;
	}
	//할인판매금액을 리턴하는 메소드
	//매개변수: 판매수량(int), 할인율(double)
	//리턴값 : 단가*판매수량*할인율
	double getSales(int qty, double rate) {
		return price * qty * rate;
	}
	
	//상품정보출력
	void printInfo() {
		System.out.println("상품명:" + name);
		System.out.println("단가:" + price);
	}
}

public class J20220223_06_Item {
	public static void main(String[] args) {
		Item item = new Item();
//		System.out.println("상품명:" + item.name);
//		System.out.println("단가:" + item.price);
		item.printInfo();
		System.out.println("판매금액:" + item.getSales(3));
		System.out.println("할인판매금액:" + item.getSales(3, 0.9));
		
	}

}
