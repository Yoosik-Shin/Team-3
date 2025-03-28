package Day03_0312;

import java.util.Scanner;

public class Ex06_Grade {

	public static void main(String[] args) {
		// 학점을 입력 받아, 점수 구간을 출력하시오.
		// A: 100 ~ 90점 입니다.
		// B: 89 ~ 80점 입니다.
		// C: 79 ~ 70점 입니다.
		// D: 69 ~ 60점 입니다.
		// F: 60 ~ 0점 입니다.

		Scanner sc = new Scanner(System.in);

		System.out.print("학점 : ");
		// String(문자열) 참조 자료형
		String grace = sc.next();

		sc.close();

		// 문자, 정수, 문장열은 switch문의 조건 값으로 가능
		// 실수(float, double)는 조건 값으로 불가능
		switch (grace) {
			case "A", "a" :
				System.out.println("100 ~ 90점 입니다.");
				break;
			case "B", "b" :
				System.out.println("89 ~ 80점 입니다.");
				break;
			case "C", "c" :
				System.out.println("79 ~ 70점 입니다.");
				break;
			case "D", "d" :
				System.out.println("69 ~ 60점 입니다.");
				break;
			case "F", "f" :
				System.out.println("60 ~ 0점 입니다.");
				break;
			default :
				System.out.println("A~D, F의 문자를 입력해 주세요.");
				break;
		}
	}
}
