package java09_lang;

public class J20220315_02_String {

	public static void main(String[] args) {
		String s1 = "hello";
		
//		if (s1=="hello") { //주소의 비교
//			System.out.println("주소가 같다");
//		}
		//Object의 equals()메소드를 오버라이딩해서 값을 비교
		if (s1.equals("hello")) {
			System.out.println("값이 같다");
		}
		
		//String형  +연산자를 이용해서 문자열 연결
		//+연결시 속도 저하
		//StringBuilder를 이용하여 속도 향상
		StringBuilder sb = new StringBuilder();
		sb.append("hello!");
		sb.append("java");
		sb.append("반가워!");
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
