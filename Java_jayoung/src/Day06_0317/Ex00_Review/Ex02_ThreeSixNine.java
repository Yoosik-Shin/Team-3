package Day06_0317.Ex00_Review;

public class Ex02_ThreeSixNine {

	public static void main(String[] args) {
		// 정수 1 ~ 100 까지 수를 반복하여 출력하면서,
		// 해당 수가 3, 6, 9가 될 때는
		// 자리수마다 369가 되는 개수 만큼 정수에 대한
		// "*"을 출력하는 프로그램을 작성하시오.
		// ex)
		// 13 : *
		// 66 : *

		// 1. 1 ~ 100까지 출력한다.
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " : ");

			// 십의 자리수 : 해당수(i) / 10
			// 일의 자리수 : 해당수(i) % 10
			// 2. 해당 수의 369가 몇 개인지 판단
			int ten = i / 10;
			int one = i % 10;

			// 2-1 십의 자리수가 369인지 여부 판단(A)
			// boolean ten369 = ten != 0 && ten % 3 == 0;
			boolean ten369 = ten == 3 || ten == 6 || ten == 9;

			// 2-2 일의 자리수가 369인지 여부 판단(A)
			// boolean one369 = one != 0 && one % 3 == 0;
			boolean one369 = one == 3 || one == 6 || one == 9;

			// 3. 369 개수에 따라 출력
			// A and B --> **
			// A or B --> *
			// 그 외 --> 정수
			if (ten369 && one369)		System.out.println("**");
			else if (ten369 || one369)	System.out.println("*");
			else System.out.println(i);

		}
	}
}
