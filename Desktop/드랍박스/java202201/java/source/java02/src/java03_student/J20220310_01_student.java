package java03_student;

import java.util.List;
import java.util.Scanner;

public class J20220310_01_student {

	public static void main(String[] args) {
		StudentDAO sdao = new StudentDAO();
		Scanner sc = new Scanner(System.in);
		//입력값 저장변수
		String sno, sname, mcode;
		int score;
		Student student;
	
		while(true) {
			//메뉴
			System.out.println("-------------------");
			System.out.println("---학생관리v1.0----");
			System.out.println("-------------------");
			System.out.println("1.학생등록");
			System.out.println("2.학생수정");
			System.out.println("3.학생삭제");
			System.out.println("4.학생조회");
			System.out.println("5.전체조회");
			System.out.println("9.종료");
			System.out.println("------------");
			System.out.print("번호?");
			int no = sc.nextInt();
			switch(no) {
			case 1://학생등록
				// student테이블에 insert
				System.out.print("학생no?");
				sno = sc.next();
				System.out.print("이름?");
				sname = sc.next();
				System.out.print("전공코드?");
				mcode = sc.next();
				System.out.print("점수?");
				score = sc.nextInt();
				student = new Student();
				student.setSno(sno);
				student.setSname(sname);
				student.setMcode(mcode);
				student.setScore(score);
				System.out.println(student);
				sdao.insert(student);	
				break;
			case 2://학생수정
				// student테이블에 update
				System.out.print("수정:학생no?");
				sno = sc.next();
				System.out.print("수정:이름?");
				sname = sc.next();
				System.out.print("수정:전공코드?");
				mcode = sc.next();
				System.out.print("수정:점수?");
				score = sc.nextInt();
				student = new Student();//객체생성
				student.setSno(sno);
				student.setSname(sname);
				student.setMcode(mcode);
				student.setScore(score);
				System.out.println(student);
				sdao.update(student);
				break;
			case 3://학생삭제
				// student테이블 delete
				System.out.print("삭제:학생no?");
				sno = sc.next();
				sdao.delete(sno);
				break;
			case 4:
				System.out.print("조회:학생no?");
				sno = sc.next();				
				student = sdao.selectOne(sno);
				//학생정보 출력
				if (student != null) {
					System.out.println("-------------------");
					System.out.println("학생번호:" + student.getSno());
					System.out.println("학생이름:" + student.getSname());
					System.out.println("전공코드:" + student.getMcode());
					System.out.println("점수:" + student.getScore());
				}
				break;
			case 5: //전체조회
				List<Student> slist = sdao.selectList();
				for(Student s:slist) {
					System.out.println("-------------------");
					System.out.println("번호:" + s.getSno());
					System.out.println("이름:" + s.getSname());
					System.out.println("전공:" + s.getMcode());
					System.out.println("점수:" + s.getScore());
				}
				break;
			case 9:
				System.out.println("프로그램종료");
				System.exit(0);
			default:
				System.out.println("잘못된 번호");
			}			
		}



	}

}
