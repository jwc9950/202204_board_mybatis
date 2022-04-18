package java03_constructor;
class Pen{
	private String name;
	//생성자
	Pen(String name){
		this.name = name;
	}
	//게터/세터
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	//toString
	@Override
	public String toString() {
		return "펜이름:" + name;
	}
}
class Eraser{
	private String name;
	Eraser(String name){
		this.name = name;
	}
	//게터/세터
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	//toString
	@Override
	public String toString() {
		return "지우개이름:" + name;
	}
	
}


class Box{
	//문구를 박스에 담는 메소드
	void inputBox(Pen pen) { //펜을 담을수 있는 기능
		//예)모나미펜이 박스에 담김 출력
		System.out.println(pen.getName()+"이 담김");
	}
	
	void inputBox(Eraser earser) {
		System.out.println(earser.getName() +"가 담김");
	}
	
	
}

public class J20220224_07_Box {
	public static void main(String[] args) {
		Pen p1 = new Pen("모나미펜");
		//System.out.println(p1);
		Box box = new Box();
		box.inputBox(p1);
		
		Pen p2 = new Pen("형광펜");
		box.inputBox(p2);
		
		Eraser e1 = new Eraser("점보지우개");
		box.inputBox(e1);
		
	}

}
