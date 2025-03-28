package Day08_0319.Ex01_TryCatch;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();

		sc.close();

		try {
			int result = a / b;
			System.out.println("result : " + result);
		} catch (Exception e) {
			System.out.println("예외발생");
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("예외 처리 완료");
		}
	}
}
