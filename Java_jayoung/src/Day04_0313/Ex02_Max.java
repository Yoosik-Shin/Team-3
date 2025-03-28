package Day04_0313;

import java.util.Scanner;

public class Ex02_Max {

	public static void main(String[] args) {
		// 첫 번째 주에 입력할 개수 N을 입력받고
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수 중, 최댓값을 구하시오.
		// (입력)
		// 5
		// 90,60,70,100,55
		// (출력)
		// 최댓값 : 100

		/*
		 * 순서도
		 * 1. 정수 하나를 입력받아서 n에 대입
		 * 2. n개의 요소를 갖는 배열 arr 선언 및 생성
		 * 3. n번 반복하면서 정수를 입력 받아 배열 arr에 순서대로 대입한다.
		 * 4. 배열을 반복해서 최댓값 max를 배열 i번째 요소와 비교한다.
		 * 5. 두 요소 중 더 큰 요소를 max 에 대입한다.
		 * 6. max값을 출력한다.
		 */
		// // 1.
		// Scanner sc = new Scanner(System.in);
		// System.out.print("입력할 숫자의 개수 : ");
		// int n = sc.nextInt();
		// 
		// // 2.
		// int arr[] = new int[n];
		// 
		// // 3.
		// for (int i = 0; i < arr.length; i++) {
		// 	System.out.print("입력 : ");
		// 	arr[i] = sc.nextInt();
		// }
		// 
		// // 4.
		// int max = Integer.MIN_VALUE;
		// 
		// // 5.
		// for (int i = 0; i < arr.length; i++) {
		// 	max = max < arr[i] ? arr[i] : max;
		// }
		// 
		// // 6.
		// System.out.println("최댓값 : " + max);
		// 
		// sc.close();

		// 1.
		Scanner sc = new Scanner(System.in);

		System.out.print("입력할 숫자의 개수 : ");
		int n = sc.nextInt();

		// 2.
		int arr[] = new int[n];

		// 4. Integer.MIN_VALUE : int의 최솟값
		int max = Integer.MIN_VALUE;

		// 3.
		for (int i = 0; i < arr.length; i++) {
			System.out.print("입력 : ");
			arr[i] = sc.nextInt();
			// 5.
			max = max < arr[i] ? arr[i] : max;
		}

		sc.close();

		// 6.
		System.out.println("최댓값 : " + max);
	}
}
