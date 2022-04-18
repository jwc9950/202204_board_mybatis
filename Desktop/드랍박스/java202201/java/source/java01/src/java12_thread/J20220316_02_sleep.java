package java12_thread;

public class J20220316_02_sleep {

	public static void main(String[] args) {
		
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("카운터 시작");
				try {
					//sleep() : 실행중인 스레드를 Blocked상태로 만들기
					for(int i=10; i>0; i--) {
						System.out.println(i);
						Thread.sleep(1000);//밀리세컨드 단위(1/1000초)
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("발사");
			}
		});
		th.start();

	}

}
