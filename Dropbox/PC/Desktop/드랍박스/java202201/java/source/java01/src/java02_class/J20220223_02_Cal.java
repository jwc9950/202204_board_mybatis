package java02_class;
//계산기 클래스
class Cal{
	//필드(속성)
	//메이커(String), 가격(int), 색상(String), 라이트(boolean)
	String maker="이젠계산기";
	int price = 10000;
	String color = "검정";
	boolean light=false;
	//메소드(기능)
	//라이트 토글
	void toggle() {
//		if (light)
//			light=false;
//		else
//			light = true;
		light=!light; //부정연산자
	}
	
}
//public 클래스의 이름과 파일의 이름은 같아야 한다
public class J20220223_02_Cal {
	public static void main(String[] args) {
		// 객체 생성
		Cal cal1 = new Cal();
		System.out.println(cal1.maker);
		System.out.println("가격:" + cal1.price);
		System.out.println("색상:" + cal1.color);
		cal1.toggle();
		System.out.println("라이트:" +cal1.light);
	}

}
