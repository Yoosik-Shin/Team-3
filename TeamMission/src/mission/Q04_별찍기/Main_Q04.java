package mission.Q04_별찍기;

import java.util.Scanner;

// 정수 하나를 입력받아, 정수형 변수N 에 초기화 시키고,
// 예시<출력>과 같이“*” 기호를 출력하는 프로그램을 작성하시오.
// 입력
// 5
// 출력
//     *
//    ***
//   *****
//  *******
// *********
public class Main_Q04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int N = sc.nextInt();

		sc.close();

		for (int row = 1; row <= N; row++) {
			// 공백 출력 (N - row : 6 - 1 : 5)
			for (int col = 1; col <= N - row; col++) {
				System.out.print(" ");
			}

			// 별 출력 (2 * row - 1 : 2 * 1 - 1)
			for (int col = 1; col <= (2 * row - 1); col++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
