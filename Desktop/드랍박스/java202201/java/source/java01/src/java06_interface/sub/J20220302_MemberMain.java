package java06_interface.sub;

import java.util.Scanner;

public class J20220302_MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//다형성
		MemberService mservice = new MemberServiceImpl();
		String userid, passwd, name, no;
		do {
			System.out.println("=====================");
			System.out.println("=== 회원관리 v0.1 ===");
			System.out.println("=====================");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원조회");
			System.out.println("4.회원수정");
			System.out.println("5.회원탈퇴");
			System.out.println("q.종료");
			System.out.println("--------------");
			System.out.print("번호?");
			no = sc.next();
			switch(no) {
			case "1": // 회원가입
				System.out.println("--------------");
				System.out.println("***회원가입***" );
				System.out.println("--------------");
				System.out.print("아이디는?");
				userid = sc.next();
				System.out.print("비밀번호는?");
				passwd = sc.next();
				System.out.print("이름은?");
				name = sc.next();
				mservice.insert(userid ,passwd, name);
				break;
			case "2": //로그인
				if (mservice.memberCheck()) {
					System.out.println("회원 가입후 로그인");
					break;
				}
				System.out.print("아이디는?");
				userid = sc.next();
				System.out.print("비밀번호는?");
				passwd = sc.next();
				String msg = mservice.login(userid,passwd);
				System.out.println(msg);
				break;
			case "3"://회원조회
				mservice.printInfo();
				break;
			case "4": //회원수정
				System.out.println("--------------");
				System.out.println("***회원수정***" );
				System.out.println("--------------");
				System.out.print("수정아이디는?");
				userid = sc.next();
				System.out.print("수정비밀번호는?");
				passwd = sc.next();
				System.out.print("수정이름은?");
				name = sc.next();
				mservice.update(userid, passwd, name);
				break;
			case "5": //회원삭제
				mservice.delete();
				break;
			case "q": //종료
				System.out.println("프로그램종료");
				System.exit(0); //프로그램 즉시 종료
				//break;
			default:
				System.out.println("잘못된 번호");
			}
			
		}while(!no.equals("q"));

	}

}
