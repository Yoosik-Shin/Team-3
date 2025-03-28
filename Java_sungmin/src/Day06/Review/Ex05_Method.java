package Day06.Review;

import java.util.Scanner;

public class Ex05_Method {
	
	public static int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
//	메소드 정의
//	: 접근지정자 (static) 반환타입 메소드명 ( 매개변수) { }
	public static int minus(int a, int b) {
		if( a < 0 || b < 0 ) {
			return 0;
		}
		int result = a - b;
		
		return result;
		
//		System.out.println("종료 이후에 출력");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		System.out.println( plus(a, b));
		System.out.println( minus(a, b));
		
		
		sc.close();
	}

}
