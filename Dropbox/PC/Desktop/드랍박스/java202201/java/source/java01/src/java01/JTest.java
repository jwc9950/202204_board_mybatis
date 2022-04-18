package java01;

public class JTest {
	//별저장 배열
	static String[][] arr = new String[27][27];
	//메소드
	static void test(int a, int x, int y) {
		
		if (a==1) {
			arr[y][x] = "*";
			return;
		}
		
		for (int i=x; i<x+a; i+=a/3) test(a/3,i,y);
		test(a/3,x,y+a/3);
		test(a/3,x+a/3*2,y+a/3);
		for (int i=x; i<x+a; i+=a/3) test(a/3,i,y+a/3*2);
		
	}

	public static void main(String[] args) {
		//백준)2447번
		//재귀메소드(자기자신의 메소드 호출) 이용한 풀이
		
		//초기화
		for(int i = 0; i< arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = " ";
			}
		}

		test(27,0,0);
		
		//배열출력
		for(int i = 0; i< arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
