package java03_constructor;
class MemberService{
	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	void logout(String id){
		System.out.println(id +" 로그아웃 되었습니다.");
	}
}

public class J20220228_01_weekend {
	public static void main(String[] args) {
		//확인문제 : 275page, 15번
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id와 password가 올바르지 않습니다.");
		}

	}

}
