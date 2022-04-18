package java03_constructor;
//상품클래스
class Item{
	//필드:상품코드, 상품명, 단가
	//private : 접근제한자=>다른클래스의 접근 불가
	private String itemcode;
	private String itemname;
	private int price;
	
	//게터(getter):필드를 읽을수 있게
	//price를 리턴해주는 메소드
	int getPrice() {
		return price;
	}
	//세터(setter):필드를 쓸수 있게
	//price를 세팅해주는 메소드
	void setPrice(int price) {
		this.price = price;
	}
	
	//생성자(상품코드,상품명)
	Item(String itemcode, String itemname){
		this.itemcode = itemcode;
		this.itemname = itemname;
	}
	//생성자(상품코드,상품명, 단가)
	Item(String itemcode, String itemname, int price) {
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.price = price;
	}
	
	//정보 출력 메소드
	void info() {
		System.out.println("코드:" + itemcode);
		System.out.println("상품명:" + itemname);
		System.out.println("단가:" + price);
		System.out.println("---------------------");
	}
}


public class J20220224_03_Item {
	public static void main(String[] args) {
		Item item1 = new Item("8801","새우깡", 1200); 
		item1.setPrice(1500);
		item1.info();

		System.out.println("판매금액:" + item1.getPrice()*3);
		
		//Item item2 = new Item("8802", "감자깡", 1300);item2.info();
		
		
	}

}
