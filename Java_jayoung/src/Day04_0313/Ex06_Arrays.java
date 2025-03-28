package Day04_0313;

import java.util.Scanner;

public class Ex06_Arrays {

	public static void main(String[] args) {
		// 2행, 3열
		// 정방행렬
		// [][][]
		// [][][]

		// 비정방 행렬
		// [][]
		// [][][][]
		// [][][]

		int arr[][] = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];

		Scanner sc = new Scanner(System.in);

		// 입력
		// arr 2차원 배열에 정수를 입력받아보세요.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(i + "행 " + j + "열 입력 : ");
				arr[i][j] = sc.nextInt();
			}
		}

		sc.close();

		// for 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		// foreach 출력
		for (int[] is : arr) {
			for (int js : is) {
				System.out.print(js + "\t");
			}
			System.out.println();
		}
		System.out.println();

		int three[][][] = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}, {{9, 10}, {11, 12}}};

		for (int[][] two : three) {
			for (int[] one : two) {
				for (int num : one) {
					System.out.print(num + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
