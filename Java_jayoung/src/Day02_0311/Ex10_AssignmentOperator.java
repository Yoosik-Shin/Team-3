package Day02_0311;

import java.util.Scanner;

public class Ex10_AssignmentOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// (바로 엔터) : shift + enter
		System.out.print("x : ");
		int x = sc.nextInt();

		System.out.print("y : ");
		int y = sc.nextInt();

		System.out.print("z : ");
		int z = sc.nextInt();

		sc.close();

		// 합계, 평균
		int    sum = x + y + z;
		double avg = sum / 3;
		// (double) = (int) / (int) : int / int = int
		// avg 변수가 정수형(int)이라서 소수 부분을 표현 할 수 없다.

		// 서로 다른 자료형 연산시, 결과는 큰 자료형으로 변환된다.
		// (큰 자료형) + (작은 자료형) = (큰 자료형)
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

		// avg 평균변수가 정수형(int)이라서 소수부분을 표현할 수 없다.
		// 평균을 소수점까지 표현하기 위해서는 실수형(double)로 변환해야 한다.
		double realAvg1 = (double) sum / 3;
		double realAvg2 = sum / 3.0;
		System.out.println("평균1 : " + realAvg1);
		System.out.println("평균2 : " + realAvg2);

	}
}
