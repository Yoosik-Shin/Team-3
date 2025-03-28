package mission.Q07_성적정렬;

import java.util.Scanner;

// 학생 5명의 JAVA 프로그래밍 성적을 입력받아,
// 1차원 배열에 저장하고 성적을 기준으로 오름차순, 내림차순으로 각각 출력하시오.
// (단, 정렬 방식은 선택정렬, 버블정렬, 삽입정렬 중 하나의 정렬방식을 이용하시오.
// 성적은 정수 0이상 100이하로 주어집니다.)
// 입력
// 90 35 75 100 65
// JAVA API에서 제공되는 메소드는 이용하지 않는다.
// 출력
// 35 65 75 90 100
// 100 90 75 65 35
public class Main_Q07 {
	public static void main(String[] args) {
		// 1차원 배열에 저장
		int[] gradeList = new int[5];

		// 5명의 JAVA 프로그래밍 성적을 입력받아
		Scanner sc = new Scanner(System.in);

		for (int index = 0; index < gradeList.length; index++) {
			gradeList[index] = sc.nextInt();
			// 성적은 정수 0이상 100이하
			if (!(gradeList[index] >= 0 && gradeList[index] <= 100)) {
				System.out.println("성적은 0이상 100이하로 입력하세요.");
				index--;
			}
		}
		sc.close();

		// 버블정렬
		for (int row = 0; row < gradeList.length - 1; row++) {
			for (int col = 0; col < gradeList.length - 1 - row; col++) {
				if (gradeList[col] > gradeList[col + 1]) {
					int temp = gradeList[col];
					gradeList[col]     = gradeList[col + 1];
					gradeList[col + 1] = temp;
				}
			}
		}
		// 정렬 끝

		// 성적을 기준으로 오름차순, 내림차순
		for (int index = 0; index < gradeList.length; index++) {
			System.out.print(gradeList[index] + " ");
		}
		System.out.println();
		for (int index = gradeList.length - 1; index >= 0; index--) {
			System.out.print(gradeList[index] + " ");
		}
	}
}
