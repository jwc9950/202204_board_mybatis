package java05_board;

import java.util.Scanner;

public class J20220314_main {

	public static void main(String[] args) {
		//게시물관리
		BoardService bservice = new BoardServiceImpl();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("----------------");
			System.out.println("1.게시물등록");
			System.out.println("2.게시물수정");
			System.out.println("3.게시물삭제");
			System.out.println("4.한건조회");
			System.out.println("5.전체조회");
			System.out.println("6.작성자게시물조회");
			System.out.println("9.종료");
			System.out.println("----------------");
			System.out.print("번호:");
			int no = sc.nextInt();
			switch(no) {
			case 1: //등록
				bservice.insert();
				break;
			case 2: //수정
				bservice.update();
				break;
			case 3: //삭제
				bservice.delete();
				break;
			case 4: //한건조회
				bservice.selectOne();
				break;
			case 5: //전체조회
				bservice.selectList();
				break;
			case 6: //작성자조회게시물
				bservice.selectListWriter();
				break;				
			case 9:
				System.exit(0);
			default:
				System.out.println("잘못된 번호");
			}
			
		}

		
		

	}

}
