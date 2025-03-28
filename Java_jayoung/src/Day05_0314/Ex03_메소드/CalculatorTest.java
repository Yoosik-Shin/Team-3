package Day05_0314.Ex03_메소드;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		Scanner sc = new Scanner(System.in);

		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();

		// 덧셈 메소드 호출
		System.out.println(a + " + " + b + "\t: " + calculator.plus(a, b));
		// 뺄셈 메소드 호출
		System.out.println(a + " - " + b + "\t: " + calculator.minus(a, b));

		System.out.print("x : ");
		double x = sc.nextDouble();
		System.out.print("y : ");
		double y = sc.nextDouble();

		sc.close();

		// 곱셈 메소드 호출
		System.out.println(x + " * " + y + "\t: " + calculator.multiple(x, y));
		System.out.printf(x + " * " + y + "\t: %5.2f \n", calculator.multiple(x, y));

		// 나눗셈 메소드 호출
		System.out.println(x + " / " + y + "\t: " + calculator.divide(x, y));
		System.out.printf(x + " / " + y + "\t: %5.2f \n", calculator.divide(x, y));

		// printf("포맷", 변수) : %X.Y(리터럴)
		// - X : 양수 - 크기만큼 칸을 지정하고 오른쪽으로 정렬
		// 		 음수 - 크기만큼 칸을 지정하고 왼쪽으로 정렬
		// - Y : 지정한 크기만큼 소수점 아래 자리수를 표현(반올림)
		// * (리터럴) : %d (정수), %f (실수), %s (문자열)

		// 나머지 메소드 호출
		System.out.println(a + " % " + b + "\t: " + calculator.remain(a, b));

		int arr[] = {10, 20, 30, 40, 50};
		// 덧셈 메소드 호출
		System.out.println("합계\t: " + calculator.sum(arr));
		// 덧셈 메소드 호출
		System.out.println("평균\t: " + calculator.avg(arr));
	}
}
