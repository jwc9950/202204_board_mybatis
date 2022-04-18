package java12_thread;
//1) Thread 클래스 상속
//단점:자바는 단일 상속, 다른 클래스를 상속 못함
class Th1 extends Thread{
	@Override
	public void run() {
		System.out.println("상속받아서 쓰레드 생성");
		for(int i=0; i<10; i++) {
			System.out.println("상속 스레드:" + i);
		}
	}
}
//2) Runnable 인터페이스 구현
//장점:인터페이스는 다중상속 가능
//class Th2 implements Runnable{
//	@Override
//	public void run() {
//		System.out.println("인터페이스구현 쓰레드 생성");
//		for(int i=0; i<10; i++) {
//			System.out.println("인터페이스 스레드:" + i);
//		}
//		
//	}
//	
//}
public class J20220316_01 {
	public static void main(String[] args) {
		// 스레드 : 프로세스 내에서 실행되는 세부 실행 단위
		// 멀티스레드 : 하나의 프로세스 내에서 여러개의 스레드가 병행 처리
		// 자바는 멀티 스레드로 동작
		// 장점 : 코드의 재사용성, 데이터 공유가 가능
		// 단점 : 여러스레드가 동시 실행시 공유자원에 대한 동기화 필요
		
		//스레드를 만드는 방법
		//1) Thread 클래스 상속
		Th1 th1 = new Th1(); //인스턴스 생성
		th1.start(); //스레드 실행(run()메소드를 실행)
		
		
		//2) Runnable 인터페이스 구현
		//2-1)이름있는 클래스로 만들기
//		Th2 th2 = new Th2(); //run() 메소드 구현
//		Thread th = new Thread(th2);
//		th.start();
		//2-2)익명클래스로 만들기
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("인터페이스구현 쓰레드 생성");
				for(int i=0; i<10; i++) {
					System.out.println("인터페이스 스레드:" + i);
				}
			}
		});
		th2.start();
		
		//메인스레드의 동작
		for(int i=0; i<10;i++) {
			System.out.println("main 스레드:" + i);
		}

	}

}
