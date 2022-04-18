package java03_constructor;

//default:접근제한(같은 패키지에서만 접근 가능)
class Controll{
	//메소드:
	//walk() : 이름 + 걷는다 출력, 걸음수 카운트
	void walk(Dog dog) {
		//walkCnt = walkCnt+1;
		//dog.setWalkCnt(dog.getWalkCnt()+1);
		dog.setWalkCnt(dog.getWalkCnt()+1);
		System.out.println(dog.getName() +"가 걷는다");
		System.out.println("걸음수:" + dog.getWalkCnt());
	}
}

public class J20220225_03_Dog {
	public static void main(String[] args) {
		Dog d1 = new Dog("흰둥이",5);
		System.out.println(d1);
		Dog d2 = new Dog("발발이",3);
		System.out.println(d2);
		Controll cont = new Controll();
		System.out.println("----------------");
		cont.walk(d1);cont.walk(d1);
		cont.walk(d2);
		
		
	}

}
