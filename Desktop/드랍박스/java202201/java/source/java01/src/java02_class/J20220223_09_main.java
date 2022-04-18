package java02_class;

public class J20220223_09_main {
	public static void main(String[] args) {
		// main 메소드의 매개변수
		System.out.println("main 메소드의 매개변수 테스트");
		for(int i=0; i<args.length;i++) {
			System.out.println(args[i]);
		}
		System.out.println("-------------");
		for(String s:args) {
			System.out.println(s);
		}
		//args.length체크 해서 2보다 작으면 return
		
		if (args.length <2) {
			System.out.println("아이디와 패스워드 입력해 주세요!");
			return ; //메소드의 종료
		}
		
		
		//java 1111이면 관리자 아니면 일반사용자 출력
		if (args[0].equals("java") && args[1].equals("1111")) {
			System.out.println("관리자");
		}else {
			System.out.println("일반사용자");
		}
		
		
		
		
		
		
	}

}
