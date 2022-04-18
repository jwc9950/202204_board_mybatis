package java02_class;

//도형의 넓이 구해주는 클래스
class Area{
	//오버로딩: 
	//매개변수의 형또는 갯수가 다르면 메소드의 이름은 중복가능
	
	//원의넓이를 반환하는 메소드
	//매개변수 : 반지름(int)
	//반환값 : 반지름*반지름*3.14
	double getArea(int r) {
		return r*r*3.14;
	}
	//원의넓이를 반환하는 메소드
	//매개변수 : 반지름(int), 원주율(double)
	//반환값 : 반지름*반지름*원주율
	double getArea(int r, double pi) {
		return r*r*pi;
	}
	
	//사각형의 넓이를 반환하는 메소드
	//매개변수 : 밑변(int), 높이(int)
	//반환값 : 밑변 *높이
	int getArea(int width, int height) {
		return width*height;
	}
}

public class J20220223_07_Area {
	public static void main(String[] args) {
		Area area = new Area();
		double d = area.getArea(7);
		System.out.println("원의넓이:" + d);
		System.out.println("원의넓이:"+area.getArea(7, Math.PI));;
		System.out.println("사각형의넓이:" + area.getArea(5, 8));
		
		//println() : 오버로딩으로 정의
		System.out.println();
		
		
	}

}
