package java08_generics;
//제네릭타입
//객체생성시 필드의 형을 바꿔줄수 있다
class Info<T>{
	private T code;
	public Info(T code) {
		this.code = code;
	}
	public T getCode() {
		return code;
	}
	public void setCode(T code) {
		this.code = code;
	}
}

public class J20220310_01 {
	public static void main(String[] args) {
		Info<String> info = new Info<String>("100");
		System.out.println(info.getCode());
		Info<Integer> info2 = new Info<Integer>(1);
		System.out.println(info2.getCode());
		Info<Double> info3 = new Info<Double>(1.1);
		System.out.println(info3.getCode());
		
	}

}
