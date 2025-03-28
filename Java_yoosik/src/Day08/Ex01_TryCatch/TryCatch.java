package Day08.Ex01_TryCatch;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// try : ctrl + space
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		try {
			int result = a / b;
			System.out.println("result : " + result);
		} catch (Exception e) {
			System.err.println("예외 발생"); // 출력1
			System.err.println("0으로 나눌 수 없습니다."); // 출력3 아닐때도 있
			// 실제로는 catch가 먼저 실행된 후 finally가 마지막에 실행 된다.
		} finally {
			System.out.println("예외 처리 완료"); // 출력2
		}
		sc.close();
	}
	
}
