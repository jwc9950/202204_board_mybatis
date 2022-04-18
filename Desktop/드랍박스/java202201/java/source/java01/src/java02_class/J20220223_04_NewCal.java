package java02_class;

//계산기 클래스
class NewCal{
	//필드
	double result; //계산결과
	//메소드
	void add(int a) { //더하기
		result += a;
	}
	//빼기
	void sub(int a) {
		result -= a;
	}
	//곱하기(mul)
	void mul(int a) {
		result *= a;
	}
	//나누기(div)
	void div(int a) {
		result /=a;
	}
	
}

public class J20220223_04_NewCal {

	public static void main(String[] args) {
		//인스턴스 생성
		NewCal nCal = new NewCal();
		System.out.println("결과값:" + nCal.result);
		nCal.add(10);nCal.add(5);
		System.out.println("결과값:" + nCal.result);
		nCal.sub(3);
		System.out.println("결과값:" + nCal.result);
		nCal.mul(2);
		System.out.println("결과값:" + nCal.result);
		nCal.div(5);
		System.out.println("결과값:" + nCal.result);
		//인스턴스의 소멸은 가비지컬럭션에 의해서
		
	}

}
