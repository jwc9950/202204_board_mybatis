package java02_class;

public class J20220223_08_method {
	//call_by_value방식으로 매개변수 넘기기
	void callByValue(int a, int b) {
		System.out.println("더하기:" + (a+b));
	}
	//call_by_reference방식으로 매개변수 넘기기
	void callByReference(int[] arr) {
		arr[0] = 100; //main메소드의 배열(arr)을 수정
		for(int a:arr) {
			System.out.println(a);
		}
	}
	
	//가변인자
	void varargsTest(String... arr) {
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(String s :arr){
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		// 메소드
		J20220223_08_method j1 = new J20220223_08_method();
//		j1.callByValue(10,15);
//		
//		int[] arr = new int[] {1,2,3,4};
//		j1.callByReference(arr); //arr의 값을 변경
//		System.out.println(arr[0]);
		
		//가변인자 테스트
		j1.varargsTest("java");
		j1.varargsTest("java", "oracle", "python");
		
		

	}

}
