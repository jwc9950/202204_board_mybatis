package java06_interface;
interface Soundable{
	String sound();
}
class Cat implements Soundable{

	@Override
	public String sound() {
		return "야옹야옹";
	}
}
class Dog implements Soundable{

	@Override
	public String sound() {
		return "멍멍";
	}
	
}

public class J20220228_04_Soundable {
	private static void printSound(Soundable sa) {
		System.out.println("소리:"+sa.sound());
	}
	public static void main(String[] args) {
		// 확인문제 385page 3번 
		Cat cat = new Cat();
		printSound(cat);
		
		Dog dog = new Dog();
		printSound(dog);
	}

}
