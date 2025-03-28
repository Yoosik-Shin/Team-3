package Day03_0312;

import java.util.Scanner;

public class Ex07_SwitchBreak {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		sc.close();

		// 입력받은 정수를 5로 나눈 나머지가
		// 2보다 작으면 "*"
		// 그렇지 않으면 "**" 출력
		// switch 문을 이용하시오.

		print1(num);
		print2(num);
		print3(num);
		print4(num);
	}

	private static void print1(int num) {
		switch (num % 5) {
			case 0 :
				System.out.println("*");
				break;
			case 1 :
				System.out.println("*");
				break;
			case 2 :
				System.out.println("**");
				break;
			case 3 :
				System.out.println("**");
				break;
			case 4 :
				System.out.println("**");
				break;
			default :
				break;
		}
		System.out.println();
	}

	private static void print2(int num) {
		switch (num % 5) {
			case 0 :
			case 1 :
				System.out.println("*");
				break;
			case 2 :
			case 3 :
			case 4 :
				System.out.println("**");
				break;
			default :
				break;
		}
		System.out.println();
	}

	private static void print3(int num) {
		switch (num % 5) {
			case 0 :
			case 1 :
				System.out.println("*");
				break;
			default :
				System.out.println("**");
				break;
		}
		System.out.println();
	}

	private static void print4(int num) {
		switch (num % 5) {
			case 0, 1 :
				System.out.println("*");
				break;
			default :
				System.out.println("**");
				break;
		}
		System.out.println();
	}
}
