package java03_constructor;

import java.util.Scanner;

class Animal{
	//필드(private):type, age
	private String type;
	private int age;
	//생성자:기본생성자
	Animal(){}
	//생성자:type, age
	Animal(String type, int age){
		this.type = type;
		this.age = age;
	}
	//세터
	void setType(String type) {
		this.type = type;
	}
	void setAge(int age) {
		 this.age = age;
	}
	//게터
	String getType() {
		return type;
	}
	int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Animal [종=" + type + ", 나이=" + age + "]";
	}
	
}

public class J20220224_05_Animal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("종은?");
		String type = sc.next();
		System.out.print("나이는?");
		int age = sc.nextInt();
		Animal a1 = new Animal(type, age);
		System.out.println(a1);
		a1.setAge(4);
		System.out.println(a1);
	}

}
