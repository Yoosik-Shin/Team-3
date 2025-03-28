package test;

import java.util.Scanner;

public class Input {

	// main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수 입력 받기
		int num = sc.nextInt();
		System.out.print("정수 : ");

		// 정수 출력
		System.out.println("입력 받은 정수는 " + num + " 입니다.");
		sc.close();
	}
}
