package java03_constructor;

import java.util.Arrays;

//dto
class Student{
	//필드: 학년, 이름, 키
	private int grade;
	private String name;
	private double height; 
	//생성자: 기본생성자, 모든필드 생성자
	public Student() {}
	public Student(int grade, String name, double height) {
		this.grade = grade;
		this.name = name;
		this.height = height;
	}
	//게터,세터
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	//toString
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", name=" + name + ", height=" + height + "]";
	}
}
//성적처리 클래스
class CalScore{
	//총점 리턴 메소드
	int getTotal(int kor, int eng, int math) {
		return kor+eng+math;
	}
	
	//이름과 총점을 출력
	void printInfo(Student std, int[] scores ) {
		System.out.println("학생의 이름과 총점");
		System.out.println("---------------------");
//		System.out.println(std);
//		System.out.println(Arrays.toString(scores));
		System.out.println("이름:" + std.getName());
		int s=0;
		for(int a:scores) {
			s+=a;
		}
		System.out.println("총점:" + s);

	}
}

public class J20220224_06_Student {
	public static void main(String[] args) {
		Student std1 = new Student(1, "홍길동", 168.8);
		System.out.println(std1);
		
		//성적처리객체
		CalScore cals = new CalScore();
		System.out.println("총점:"+ cals.getTotal(50, 90, 77));
		cals.printInfo(std1, new int[] {50, 90, 77});
		
//		Student std2 = new Student(2, "이순신", 170.5);
//		System.out.println(std2);
		
	}

}
