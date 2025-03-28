package Day02_0311;

import java.util.Scanner;

public class Ex07_Boolean {

	public static void main(String[] args) {

		// boolean
		// true(참), false(거짓) 논리 값만 가지는 자료형

		boolean check1 = false;
		boolean check2 = true;

		System.out.println("check1 : " + check1);
		System.out.println("check2 : " + check2);

		Scanner sc = new Scanner(System.in);

		System.out.print("true 또는 false 입력 : ");
		// 논리값(true,false) 를 입력받는 메소드
		boolean on = sc.nextBoolean();

		sc.close();

		System.out.println("on : " + on);

		if (on) {
			System.out.println("전원 ON");
		} else {
			System.out.println("전원 OFF");
		}
	}
}
