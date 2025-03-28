package mission.Q06_배열_로또;

import java.util.Scanner;

// 정수N을 입력받아 N개의 게임의 로또번호를 출력하시오.
// 즉, 6개의 배열 요소를 갖는 1차원 배열을 선언하여
// 1 ~ 45 사이의 랜덤한 값을 중복되지 않도록 저장하고 출력하는 과정을 N번 반복하시오.
// - Math.random(); 메소드
// : 0.0이상 1.0미만의 임의의 값을 반환
// - Random random= new Random();
// random.nextInt(N);
// : 0이상 N이하의 임의의 정수 타입의 값을 반환
// - ex) System.out.println( Math.random() ); // 0.5446712360575938
// System.out.println( random.nextInt(10) ); // 7
// 입력
// 몇게임? 5
// 출력
// [1 게임] : 2 9 14 23 41 44
// [2 게임] : 1 8 17 33 37 41
// [3 게임] : 6 12 15 22 23 37
// [4 게임] : 1 8 15 18 28 37
// [5 게임] : 3 11 12 23 31 37
public class Main_Q06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("몇게임?");
		int N = sc.nextInt();

		sc.close();

		for (int i = 0; i < N; i++) {

			System.out.print("[" + (i + 1) + "게임] : ");

			int lotto[] = new int[6];

			// -랜덤수 6개 대입
			for (int j = 0; j < lotto.length; j++) {
				int rand = (int) (Math.random() * 45) + 1;
				lotto[j] = rand;

				// 중복 제거
				for (int k = 0; k < j; k++) {
					// 현재 뽑은 랜덤 수가 기존 수들과 같으면 다시 뽑는다.
					if (rand == lotto[k]) {
						j--;
						break;
					}
				}
			}
			// -랜덤수 6개 대입

			// 정렬 - 버블
			for (int j = 0; j < lotto.length - 1; j++) {

				for (int k = 0; k < lotto.length - 1 - j; k++) {
					if (lotto[k] > lotto[k + 1]) {
						int temp = lotto[k];
						lotto[k]     = lotto[k + 1];
						lotto[k + 1] = temp;
					}
				}
			}
			// 정렬 끝

			// 출력
			for (int j = 0; j < lotto.length; j++) {
				System.out.print(lotto[j] + " ");
			}
			System.out.println();
		}
	}
}
