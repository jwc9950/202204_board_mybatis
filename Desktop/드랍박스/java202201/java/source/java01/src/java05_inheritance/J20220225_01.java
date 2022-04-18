package java05_inheritance;
class Parent{ //부모
	void parentTest() {
		System.out.println("부모 메소드");
	}
}
class ChildA extends Parent{ //자식A
	void childATest() {
		System.out.println("자식A 메소드");
	}
}
class ChildB extends Parent{
	void childBTest() {
		System.out.println("자식B 메소드");
	}
}

public class J20220225_01 {
	public static void main(String[] args) {
		ChildA cha = new ChildA();
		cha.childATest();
		cha.parentTest();
		
		ChildB chb = new ChildB();
		chb.childBTest();
		chb.parentTest();
	}

}
