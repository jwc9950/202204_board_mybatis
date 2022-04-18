package java03_constructor;

//public 모든패키지 접근 가능
public class Dog{
	//필드:type, name(이름), age(나이), walkCnt(걸음수)
	public static final String TYPE="강아지";
	private String name;
	private int age;
	private int walkCnt;
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWalkCnt() {
		return walkCnt;
	}
	public void setWalkCnt(int walkCnt) {
		this.walkCnt = walkCnt;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", walkCnt=" + walkCnt + "]";
	}
	
}