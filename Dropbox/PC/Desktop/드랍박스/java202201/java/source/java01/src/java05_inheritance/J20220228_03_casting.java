package java05_inheritance;
class Thing{
}

class Box extends Thing{
	private int unit=12;
	int getUnit() {
		return unit;
	}
	public String toString() {
		return "Box:"+unit;
	}
}

class Cup extends Thing{
	private int ea = 6;
	int getEa() {
		return ea;
	}
	public String toString() {
		return "Cup:"+ea;
	}
}

class Enter { //입고 클래스
	void in(Thing th, int qty) {
		System.out.println(th);
		
		if (th instanceof Box) {
			//다운캐스팅
			System.out.println(((Box)th).getUnit() * qty+"개"); 
		}else if (th instanceof Cup) {
			System.out.println(((Cup) th).getEa() * qty +"개");
		}
	}
}

public class J20220228_03_casting {

	public static void main(String[] args) {
		//Box box = new Box();
		//업캐스팅(자동형변환)
		//자식형을 부모형으로 변환 
		Thing box = new Box(); 
		//다운캐스팅(명시적인형변환)
		//부모형을 자식형으로 변환 
//		Box box2 = (Box)box;
//		box2.getUnit();
		
		Cup cup = new Cup();
		
		Enter enter = new Enter();
		enter.in(cup, 3);
		enter.in(box, 3);

	}

}
