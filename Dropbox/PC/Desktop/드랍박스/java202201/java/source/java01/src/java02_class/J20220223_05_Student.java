package java02_class;
//학생클래스
class Student{
	//필드:이름(String),나이(int), 총점(int)
	int tot;
	//메소드:
	//매개변수(세과목의 점수)를 더해서 총점에 저장
	int totCal(int a, int b, int c) {
		//지역변수(매개변수):메소드 호출시 생성되고 호출종료시 소멸
		int total = a+b+c;
		tot = total;
		return tot; //반환
	}
	
}

public class J20220223_05_Student {
	public static void main(String[] args) {
		Student std1 = new Student();
		//메소드 실행시 매개변수의 갯수, 형 일치
		int tot = std1.totCal(100, 70, 87);
		System.out.println("총점:" + tot);
		System.out.println("평균:" +(double) tot /3 );
	}

}
