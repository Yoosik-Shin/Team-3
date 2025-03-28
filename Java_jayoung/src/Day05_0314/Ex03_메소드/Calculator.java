package Day05_0314.Ex03_메소드;

/**
 * 계산기
 * - 피연산자를 2개로 하는 계산기
 * - 기능
 * 1. 덧셈	: 정수 2개를 덧셈
 * 2. 뺄셈	: 정수 인자1 - 인자2 연산을 하는 뺄셈
 * 3. 곱셈	: 실수 2개를 곱셈
 * 4. 나눗셈	: 실수 인자1 / 인자2 연산을 하는 나눗셈
 * 5. 나머지	: 정수 인자1 % 인자2 연산을 하는 나눗셈
 * 6. 합계	: 배열로 매개변수를 전달받아, 모든 요소의 합계를 구함
 * 7. 평균	: 배열로 매개변수를 전달받아, 모든 요소의 평균를 구함
 * 
 * = 메소드명
 * : plus, minus, multiple, divide, remain, sum, avg
 */
public class Calculator {

	// 덧셈
	int plus(int num1, int num2) {
		return num1 + num2;
	}
	// 뺄셈
	int minus(int num1, int num2) {
		return num1 - num2;
	}
	// 곱셈
	double multiple(double num1, double num2) {
		return num1 * num2;
	}
	// 나눗셈
	double divide(double num1, double num2) {
		return num1 / num2;
	}
	// 나머지
	int remain(int num1, int num2) {
		return num1 % num2;
	}

	// 합계
	int sum(int arr[]) {
		int sum = 0;
		for (double d : arr) {
			sum += d;
		}
		return sum;
	}

	double avg(int arr[]) {
		return (double) sum(arr) / arr.length;
	}
}
