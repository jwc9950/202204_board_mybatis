package java08_generics;
//T : type
class Student<T1, T2> {
	private T1 ban;//1,2,3  // A, B, C
	private T2 name;
	public Student(T1 ban, T2 name) {
		super();
		this.ban = ban;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [ban=" + ban + ", name=" + name + "]";
	}

}
public class J20220310_02 {
	public static void main(String[] args) {
		Student<Integer, String> std1 = new Student<>(1,"홍길동"); ;
		System.out.println(std1);
		Student<String, String> std2 = new Student<>("A반", "김자바");
		System.out.println(std2);
		
		

	}

}
