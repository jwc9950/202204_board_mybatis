package java04_squid;

import java.util.List;
import java.util.Scanner;

public class J20220311_main {

	public static void main(String[] args) {
		//메뉴 만들기
		SquidDAO sdao = new SquidDAOImpl();
		Scanner sc = new Scanner(System.in);
		int no, debt;
		String name;
		Squid squid;

		try {
			while(true) {
				System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
				System.out.println("◆◆◆오징어게임◆◆◆");
				System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
				System.out.println("1.참가자등록");
				System.out.println("2.참가자수정");
				System.out.println("3.참가자삭제");
				System.out.println("4.참가자조회");
				System.out.println("5.전체조회");
				System.out.println("9.종료");
				System.out.println("↔↔↔↔↔↔↔↔↔↔↔↔↔↔↔↔↔");
				System.out.print("선택:");
				int selno = sc.nextInt();
				switch (selno) {
				case 1://추가
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.println("☆☆☆참가자추가☆☆☆");
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");					
					System.out.print("참가자번호?"); 
					no = sc.nextInt();
					sc.nextLine();//엔터처리
					System.out.print("참가자이름?");
					name = sc.nextLine();
					System.out.print("참가자빛은?");
					debt = sc.nextInt();
					sdao.insert(new Squid(no, name, debt));
					break;
				case 2://수정
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.println("☆☆☆참가자수정☆☆☆");
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");					
					System.out.print("참가자번호?"); 
					no = sc.nextInt();
					sc.nextLine();//엔터처리
					System.out.print("참가자이름?");
					name = sc.nextLine();
					System.out.print("참가자빛은?");
					debt = sc.nextInt();
					sdao.update(new Squid(no, name, debt));					
					break;
				case 3: //삭제
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.println("☆☆☆참가자삭제☆☆☆");
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.print("참가자번호?"); 
					no = sc.nextInt();
					sdao.delete(no);
					break;
				case 4: //한건조회
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.println("☆☆☆참가자조회☆☆☆");
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.print("참가자번호?"); 
					no = sc.nextInt();
					squid = sdao.selectOne(no);
					System.out.println("----------------------");
					System.out.println("번호:" + squid.getNo());
					System.out.println("이름:" + squid.getName());
					System.out.println(" 빛 :" + squid.getDebt());
					System.out.println("탈락:" + squid.getFail());
					System.out.println("일자:" + squid.getRegidate());
					System.out.println("----------------------");
					break;
				case 5:
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.println("☆☆☆전체조회☆☆☆");
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					List<Squid> slist = sdao.selectList();
					System.out.println("----------------------");
					for(Squid s:slist) {
						System.out.println("번호:" + s.getNo());
						System.out.println("이름:" + s.getName());
						System.out.println(" 빛 :" + s.getDebt());
						System.out.println("탈락:" + s.getFail());
						System.out.println("일자:" + s.getRegidate());
						System.out.println("----------------------");
					}
					break;
				case 9: //종료
					System.exit(0);
				default:
					System.out.println("잘못된 선택");
				}
			}

		} catch (Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
		}
	}

}
