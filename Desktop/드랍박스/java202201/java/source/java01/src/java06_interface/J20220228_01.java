package java06_interface;
//인터페이스:
//두클래스간의 연결
//기본적으로 구현부가 없기때문에 객체 생성 불가
//다중상속 가능
interface A{
	//구현부가 없는 메소드
	//public : 접근제한자 생략
	//abstract : 추상메소드 생략
	void test();
}

class B implements A{

	@Override
	public void test() {
		System.out.println("테스트 B");
	}

}
public class J20220228_01 {
	public static void main(String[] args) {
		B b1 = new B();
		A b2 = new B();
		b1.test(); b2.test();
		
	}

}
