package java01;

public class J20220216_01_operator {

	public static void main(String[] args) {
		// 산술연산자
		//+,-,*,/, %
//		int d1=26,d2=20;
//		//10.5 + 20.3 = 30.8
//		System.out.println(d1 + "+" + d2 + "=" + (d1+d2));
//		System.out.println(d1 + "-" + d2 + "=" + (d1-d2));
//		System.out.println(d1 + "*" + d2 + "=" + (d1*d2));
//		System.out.println(d1 + "/" + d2 + "=" + ((double)d1/d2));
//		System.out.println(d1 + "%" + d2 + "=" + (d1%d2));
		
		//대입연산자(=),복합대입연산자(+=, -=, *=, /=, %=)
//		int a=10; double r;
//		System.out.println(a);
//		a += 20;//a = a+20;
//		System.out.println(a);
//		a -= 15;
//		System.out.println(a);
//		a *= 3;
//		System.out.println(a);
//		r = (double)a /6;
//		System.out.println(r);
//		r %= 2;
//		System.out.println(r);
		
		//단항연산자
//		boolean b = true;
//		System.out.println(!b); //부정연산자
		
		//++, --:증감연산자
//		int a=10;
//		a++;//a += 1;//a=a+1;
//		System.out.println(a);
//		a--;
//		System.out.println(a);
		
		//증감연산자(전위/후위)
//		int a=10;
//		//++a;//전위
//		//a++; //후위
//		System.out.println(a++); //후위,print->a증가
//		System.out.println(a);
//		System.out.println(++a); //전위,a증가->print
		
		//실습)
//		int a = 10;
//		int b = a++;
//		System.out.println(a);
//		System.out.println(b);
//		실습)
//		int a = 10;
//		int b = ++a; //전위 : a증가후 b에 대입
//		a = b++; //후위 : 대입후 b증가
//		int c = ++b; //전위 : b증가후 c에 대입
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(++c);
		
		//비교연산자:결과는 반드시 true/false
		//==, <, >, >=, <=, !=
//		int a=10, b=20;
//		System.out.println(a==b);
//		System.out.println(a!=b);
//		System.out.println(a<b);
		
		//논리연산자(&&(그리고), ||(또는), !)
//		System.out.println(true && false); //둘다 참일때 참
//		int a=10, b=-20;
//		System.out.println(a>0 && b>0);
		
//		System.out.println(true || false); //둘중 한개만 참이면 참 
//		int a=10, b=-20;
//		System.out.println(a < 0 || b < 0);
		
//		System.out.println(!true);
//		int a=10;
//		System.out.println(!(a>0)); 

		//비트연산자
//		System.out.println(4 & 2);
//		System.out.println(4 | 2);
		
		//실습)ip : 192.168.0.10
		//     sm : 255.255.255.0
		//     nw : 192.168.0.0
//		System.out.println(192 & 255);
//		System.out.println(168 & 255);
//		System.out.println(0 & 255);
//		System.out.println(10 & 0);
		
		//시프트연산자(>>, <<) :비트의 이동
//		System.out.println(8 << 1);
//		System.out.println(5 << 1);
		
		//삼항연산자(조건에 따라서 수행문장을 다르게)
//		int a=-10;
//		System.out.println(a>0?"양수":"음수"); 
//		String s = a>0?"양수":"음수";
//		System.out.println(s);
		
		//실습)큰수를 출력
		//b가 큽니다.
//		int a = 10, b= 20;
//		String s = a>b?"a가큼":"b가큼";
//		System.out.println(s);
//		//큰 변수의 값을 출력
//		//30
//		int max = a>b?a:b;
//		System.out.println(max);
		
		//실습)세수의 비교
//		int a=45, b=55, c=30;
//		
//		//가장큰수
////		int max = a>b?a:b;
////		max = max>c?max:c;
//		int max = a>b?(a>c?a:c):(b>c?b:c);
//		System.out.println(max);
//		//가장작은수
//		int min = a<b?(a<c?a:c):(b<c?b:c);
//		System.out.println(min);
		
		//실습)짝/홀수 알아내기
//		int a = 9;
//		String s = a%2==0?"짝수":"홀수";
//		System.out.println(a+"는 "+s);
		
		//실습)두정수가 80점이상이면 합격
		int a=90, b=85;
		String s = a>=80 && b>=80?"합격":"불합격";
		System.out.println(s);
		
		
		
		
		
		
		

	}

}
