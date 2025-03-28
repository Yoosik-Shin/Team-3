package Day02_0311;

import java.util.Scanner;
// 자동 import : ctrl + shift + O

public class Ex09_Circle {

	public static void main(String[] args) {
		// 상수
		// - 프로그램 실행 동안 값을 변경하지 않고 사용할 값
		// * 상수 선언 시, 반드시 값을 초기화 해야 한다.
		// * 선언 후에 값을 변경하면 에러가 발생한다.
		// - 키워드 : final
		final double PI = 3.141592;
		// PI = 3.14; // (에러)

		Scanner sc = new Scanner(System.in);

		System.out.print("반지름 : ");
		double radius = sc.nextDouble();

		sc.close();

		// 원의 넓이
		// (넓이) = (원주율) * (반지름)^2
		double area = PI * radius * radius;
		System.out.println("원의 넓이 : " + area);

	}

}
