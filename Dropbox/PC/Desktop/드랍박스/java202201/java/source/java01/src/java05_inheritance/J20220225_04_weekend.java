package java05_inheritance;
class Animal{
	
}
class Rabbit extends Animal{
	@Override
	public String toString() {
		return "토끼";
	}
}
class Hippo extends Animal{
	@Override
	public String toString() {
		return "하마";
	}
}
class Care{ //동물 돌보기
	//다형성을 이용해서 바꾸기(결합도를 낮추는 방법)
	void eat(Animal animal) {
		System.out.println(animal + " 먹이주기");
	}
	//
	void wash(Animal animal) {//목욕시키기
		System.out.println(animal + " 목욕시키기");
	}
}
public class J20220225_04_weekend {
	public static void main(String[] args) {
		//다형성을 이용
		Rabbit rabbit = new Rabbit();
		Animal a1 = new Rabbit();
		Hippo hippo = new Hippo();
		//돌보기 객체 생성
		Care care = new Care();
		care.eat(rabbit);
		care.eat(hippo);
		care.wash(hippo); care.wash(rabbit);
		
		//참조변수에 클래스형 포함여부
		if (rabbit instanceof Animal)
			System.out.println("포함됨");

	}

}
