package java05_inheritance;
//모든 클래스는 Object의 자식
//다중 상속은 불가
class Person{
	void breath() {
		System.out.println("숨쉬기");
	}
	void eat() {
		System.out.println("먹기");
	}
}
class School{
	void info() {
		System.out.println("이젠 학교");
	}
}
class Student extends Person{
	void learn() {
		System.out.println("배우기");
	}
}
class Teacher extends Person{
	void teach() {
		System.out.println("가르치기");
	}
}

public class J20220225_02_Person {
	public static void main(String[] args) {
		Student std = new Student();
		std.breath();
		std.eat();
		std.learn();
		System.out.println("-------------------");
		Teacher teac = new Teacher();
		teac.breath();
		teac.eat();
		teac.teach();

		
	}

}
