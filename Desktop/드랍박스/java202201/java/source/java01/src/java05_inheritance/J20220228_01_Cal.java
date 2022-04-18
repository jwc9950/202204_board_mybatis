package java05_inheritance;
//상속장점:코드의 중복을 줄일수 있다
class Cal{ //부모
	//+,-,*, /
	double add(double a, double b) {
		return a+b;
	}
	double sub(double a, double b) {
		return a-b;
	}
	double mul(double a, double b) {
		return a*b;
	}
	double div(double a, double b) {
		return a/b;
	}
}
class GeneralCal extends Cal{ //자식클래스
}
class EnginCal extends Cal{//자식클래스
	double remine(double a, double b) { //나머지
		return a%b;
	}
}

public class J20220228_01_Cal {
	public static void main(String[] args) {
		GeneralCal gCal = new GeneralCal();
		System.out.println("더하기:"+gCal.add(50, 15.5));
		EnginCal eCal = new EnginCal();
		
		double r = eCal.remine(10.8, 3.1);
		System.out.println("나머지:" + r);
		
	}

}
