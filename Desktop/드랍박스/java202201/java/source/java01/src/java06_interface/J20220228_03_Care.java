package java06_interface;

interface Animal{
	//추상메소드
	String getName();
}
class Lion implements Animal{
	private String name;

	public Lion(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Lion [name=" + name + "]";
	}

}

class Tiger implements Animal{
	private String name;

	public Tiger(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tiger [name=" + name + "]";
	}

}
//동물 돌보기
class Care{
	void eating(Animal ani) {
		System.out.println(ani.getName() + " 먹이 주기");
	}
}
public class J20220228_03_Care {

	public static void main(String[] args) {
		Lion lion = new Lion("라이언");
		Tiger tiger = new Tiger("타이거");
		Care care = new Care();
		care.eating(tiger);
		care.eating(lion);
		

	}

}
