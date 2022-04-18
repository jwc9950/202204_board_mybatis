package java03_constructor;

class Bird{ //부모클래스
	void born() {
		System.out.println("알을 낳는다");
	}
	void fly() {
		System.out.println("날수있다");
	}
}

//참새
class Sparrow extends Bird{
	@Override
	public String toString() {
		return "참새";
	}
}
//타조
class Ostrich extends Bird{
	void fly() {
		System.out.println("날수없다");
	}
	@Override
	public String toString() {
		return "타조";
	}
}
public class J20220228_02_overriding {
	public static void main(String[] args) {
		Sparrow s1 = new Sparrow();
		System.out.println(s1);
		s1.born(); s1.fly();
		Ostrich o1 = new Ostrich();
		System.out.println(o1);
		o1.born(); o1.fly();
	}

}
