package Day01_0310;

import java.util.Scanner;

public class Ex00_Test002_Input {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 정수 입력 받기
		System.out.print("정수를 입력하세요. : ");
		int num = sc.nextInt();

		sc.close();

		// 정수 출력
		System.out.println("입력 받은 정수는 " + num + "입니다.");
	}
}
