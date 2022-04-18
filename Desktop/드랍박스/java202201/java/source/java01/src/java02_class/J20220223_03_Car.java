package java02_class;
//자동차 클래스
class Car{
	//필드:차종(String), 가격(int), 색상(String), 파워(boolean), 속력(int)
	//자동초기화
	String name="람보르기니";
	int price = 10000;
	String color ="노랑";
	boolean power; //default false
	int speed; //0
	//기능: 파워토글, 속도올리기, 속도내리기
	void powerToggle() {
		power = !power;
	}
	void speedUp() {//제한속도를 100으로
		if(speed<100) speed++;
	}
	void speedDown() {//제한속도를 0으로
		if (speed>0) speed--;
	}
}

public class J20220223_03_Car {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.speedUp();c1.speedUp();c1.speedUp();
		System.out.println("c1의 속력:" + c1.speed);
		
		Car c2 = new Car();
//		c2의 속력 100까지 올리기
		for(int i=0; i<200; i++)
			c2.speedUp();
		System.out.println("c2의 속력:" + c2.speed);	
		for(int i=0; i<200; i++)
			c2.speedDown();
		System.out.println("c2의 속력:" + c2.speed);	
		
		
		
	}

}
