package java02_class;
//클래스:객체를 생성하기 위한 틀
//강아지 클래스
class Dog{
	//속성:필드
	String type="강아지";
	int legs=4; //다리수 
	//동작:메서드
	//void : 반환값 없다
	//walk : 메소드명(기능을 잘 표현할수 있은 작명)
	//() : 매개변수를 넘겨줄 공간
	void walk() {
		System.out.println("걷는다");
	}
}

public class J20220223_01_class {
	//시작 메소드
	public static void main(String[] args) {
		// 객체지향언어, 
		// 인스턴스(객체)생성
		//d1:참조변수(인스턴스명)
		Dog d1 = new Dog();
		System.out.println(d1.type);
		System.out.println(d1.legs);
		d1.walk(); //메소드 호출
	}

}
