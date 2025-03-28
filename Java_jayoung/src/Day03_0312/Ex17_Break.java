package Day03_0312;

import java.util.Scanner;

public class Ex17_Break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 무한루프
		// : 반드시 종료 조건을 추가해 주어야 한다.
		while (true) {
			System.out.print("입력 : ");
			String input = sc.nextLine();

			// 문자열.equals("비교 문자열")
			// : 문자열이 비교 문자열과 일치하는지 여부를 알려주는 메소드
			if ("STOP".equals(input)) break;

			System.out.println(">> " + input);
		}

		sc.close();

		System.out.println("종료");
	}
}
