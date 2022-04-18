package java05_inheritance;
class ParentA{
	void ptest() {
		System.out.println("부모메소드");
	}
	void ctest() {}
}
class ChildC extends ParentA{
	void ctest() {
		System.out.println("자식메소드 C");
	}
}
class ChildD extends ParentA{
	void ctest() {
		System.out.println("자식메소드 D");
	}
}

//자식클래스 테스트
class ChildTest{
	void childtest(ParentA child) {
		child.ctest();
	}
}

public class J20220225_03_polymorphism {
	public static void main(String[] args) {
		//다형성:다양한형으로 객체의 참조변수를 만든다
		ChildC childc = new ChildC();
		ParentA parent = new ChildC();
		Object object = new ChildC();
		ParentA childd = new ChildD();

		ChildTest ct = new ChildTest();
		ct.childtest(childc);
		ct.childtest(childd);
		
		

	}

}
