package Day06.Review;

import java.util.Scanner;

public class Ex04_Matrix {
	public static void main(String[] args) {
//		양의 정수 M과 N을 입력받아 저장하고,
//		M행 N열의 2차원 배열을 생성한다.
//		각 요소의 값을 입력받고, 그대로 출력하시오.
//		(입력 예시)
//		M : 2
//		N : 3
//		1 2 3
//		4 5 6
//		(출력 예시)
//		1 2 3
//		4 5 6
		Scanner sc = new Scanner(System.in);
		System.out.println("M : ");
		int M = sc.nextInt();
		System.out.println("N : ");
		int N = sc.nextInt();
		
//		M행 N열의 2차원 배열 선언 및 생성
		int arr[][] = new int[M] [N];
		
//		입력
//		2차원 배열은 이중반복문으로 접근한다.
//		바깥쪽 반복문     : i : 행 접근
//		안쪽 반복문     : j : 열 접근
//		arr.length     : 행의 개수
//		arr[i].length  : 열의 개수
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
//		출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
	}

		System.out.println("----------------");
//		foreach 문으로 2차원 배열 출력
		for (int[] row : arr) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
			sc.close();
		}
}
