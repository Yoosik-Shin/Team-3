package mission.Q08_지그재그;

import java.util.Scanner;

// 정수N을 입력받아, N행 N열의 2차원 배열을 선언하시오.
// 그리고 배열 요소의 1부터 1씩 증가하는 값을 순서대로 저장하면서
// 1행이 증가할 때마다 배열 요소에 접근하는 방향을 반대로하여 값을 저장하고 출력하시오.
// 입력이3 인경우,
// 1 2 3
// 6 5 4
// 7 8 9
// 출력
// 1 2 3
// 6 5 4
// 7 8 9
public class Main_Q08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수N을 입력받아
		System.out.print("정수 입력 (2 <= N <= 50) : ");
		int num = sc.nextInt();

		sc.close();

		// N행 N열의 2차원 배열을 선언
		int arr[][] = new int[num][num];

		int index = 0;

		// 배열 요소의 1부터 1씩 증가하는 값을 순서대로 저장
		for (int row = 0; row < arr.length; row++) {
			// 1행이 증가할 때마다 배열 요소에 접근하는 방향을 반대로하여 값을 저장
			if (row % 2 == 0) {
				for (int col = 0; col < arr[row].length; col++) {
					arr[row][col] = ++index;
				}
			} else {
				for (int col = arr[row].length - 1; col >= 0; col--) {
					arr[row][col] = ++index;
				}
			}
		}

		
		// 출력
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();

		}
	}
}
