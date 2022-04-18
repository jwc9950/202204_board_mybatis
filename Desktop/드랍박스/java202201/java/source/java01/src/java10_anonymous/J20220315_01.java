package java10_anonymous;
class Parent{
	void methodA() {
		System.out.println("부모 메세지출력");
	}
}
//자식메소드를 실행하기 위해서 클래스 생성
//익명클래스를 생성하면 클래스를 만들지 않아도 된다
//class Child extends Parent{
//	void methodA() {
//		System.out.println("자식 메세지출력");
//	}
//}

//인터페이스는 구현부가 없기 때문에 객체를 만들수 없다
interface InterfaceA{
	void insert();
	void update();
	void delete();
}
//class Box implements InterfaceA{
//
//	@Override
//	public void insert() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void update() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void delete() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}


public class J20220315_01 {

	public static void main(String[] args) {
//		자식클래스정의 생성
//		Parent p = new Child();
//		p.methodA();
		
		// 익명클래스:이름이 없는 클래스
		//1회성으로 실행해야할 메소드
		Parent p = new Parent() {
			//오버라이딩만 의미가 있다
			void methodA() {
				System.out.println("자식 메세지출력");
			}
		};
		p.methodA();
		
		//인터페이스의 자식 객체(익명) 만들기
		InterfaceA inter = new InterfaceA() {
			@Override
			public void update() {
				System.out.println("자식1수정");
			}
			@Override
			public void insert() {
				System.out.println("추가");
			}
			@Override
			public void delete() {
				System.out.println("삭제");
			}
		};
		inter.insert();
		inter.update();
		inter.delete();

		
	}

}
