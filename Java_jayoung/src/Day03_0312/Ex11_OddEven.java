package Day03_0312;

public class Ex11_OddEven {

	public static void main(String[] args) {
		// 1 ~ 20 까지 정수 중,
		// 홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오.

		// 순서도
		// 1. 1 ~ 20까지 반복
		// 2. 홀수인지 짝수인지 판별
		// 3. 홀수 합계
		// 4. 짝수 합계
		print1();
		print2();
	}

	private static void print1() {
		int i = 1, oddSum = 0, evenSum = 0;

		while (i <= 20) {
			// 홀수
			if (i % 2 == 1) 
				oddSum = oddSum + i;
			// 짝수
			if (i % 2 == 0) 
				evenSum = evenSum + i;
			i++;
		}

		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("짝수의 합 : " + evenSum);
	}

	private static void print2() {
		int i = 1, oddSum = 0, evenSum = 0;

		while (i <= 20) {
			if (i % 2 == 1) {
				oddSum += i++;
			} else {
				evenSum += i++;
			}
		}

		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("짝수의 합 : " + evenSum);
	}

}
