package Day03_0312;

import java.util.Scanner;

public class Ex04_Nested2 {

	public static void main(String[] args) {

		// 정보처리기사 합격 기준
		// * 응시자격 : 대학교 4학년
		// * 점수 : 60점 이상
		Scanner sc = new Scanner(System.in);

		// 응시 자격이 있는 경우에만 점수 입력 받기
		System.out.print("학년 : ");
		int year = sc.nextInt();

		if (year != 4) {
			System.out.println("응시 자격이 없습니다.");
		} else {
			System.out.print("점수 : ");
			int score = sc.nextInt();

			if (score >= 60) System.out.println("합격");
			else System.out.println("불합격");
		}

		// 응시 자격이 있는 경우에만 점수 입력 + 중첩 if문 없애기
		if (year != 4) {
			System.out.println("응시 자격이 없습니다.");
			sc.close();
			return;
		}

		System.out.print("점수 : ");
		int score = sc.nextInt();

		sc.close();

		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		System.out.println("끝");
	}
}
