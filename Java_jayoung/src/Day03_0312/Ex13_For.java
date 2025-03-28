package Day03_0312;

public class Ex13_For {
	public static void main(String[] args) {
		// 1. 1 ~ 10까지 정수를 출력하시오.
		for (int i = 1; i <= 10; i++)
			System.out.print(i + " ");
		System.out.println();

		// 2. 50 ~ 100까지 정수를 출력하시오.
		for (int i = 50; i <= 100; i++)
			System.out.print(i + " ");
		System.out.println();

		// 3. 1 ~ 20까지 정수 중 짝수만 출력하시오.
		for (int i = 2; i <= 20; i += 2)
			System.out.print(i + " ");
		System.out.println();

		// 4. 1 ~ 20까지 정수 중 홀수만 출력하시오.
		for (int i = 1; i <= 20; i += 2)
			System.out.print(i + " ");
		System.out.println();
	}
}
