package Day03_0312;

import java.util.Scanner;

public class Ex16_Continue {

	public static void main(String[] args) {
		// 5개의 정수를 입력 받아
		// 입력 받은 정수 중 양수(+)만 합계를 구하여 출력하시오.

		int sum = 0;

		Scanner sc = new Scanner(System.in);

		// -3, -1, 1, 3, 5
		// 5번 반복
		// 반복변수 i : 0 ~ 4
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			// if (n > 0) sum += n;
			if (n < 0) continue;
			sum += n;
		}

		sc.close();

		// continue
		// : 남은 실행문을 무시하고, 다음 반복으로 점프
		// - while : 조건식으로 돌아간다.
		// - for : 증감식으로 돌아간다.

		System.out.println("양수의 합 : " + sum);
	}
}
