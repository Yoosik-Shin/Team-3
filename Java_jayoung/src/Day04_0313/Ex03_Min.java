package Day04_0313;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {
		// 첫번째 줄에 입력할 개수 N을 입력받고
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N 개의 정수 중, 최솟값을 구하시오.
		// (입력)
		// 5
		// 90 60 70 100 55
		// (출력)
		// 최솟값 : 55
		/*
		 	(순서도)
		 	1. 정수 하나를 입력받아서 N에 대입
		 	2. N개 요소를 갖는 배열 arr 선언 및 생성
		 	3. N번 반복하면서 정수를 입력받아서 배열 arr에 순서대로 대입
		 	4. 배열을 반복해서 최솟값 min를 배열 i번째 요소랑 비교
		 	5. 두 요소 중에서 더 큰 요소를 min 에 대입
		 	6. 반복 끝나고, min 를 출력
		*/

		// 1.
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 숫자의 개수 : ");
		int n = sc.nextInt();

		// 2.
		int arr[] = new int[n];

		// 4. Integer.MAX_VALUE : int의 최댓값
		int min = Integer.MAX_VALUE;

		// 3.
		for (int i = 0; i < arr.length; i++) {
			System.out.print("입력 : ");
			arr[i] = sc.nextInt();
			// 5.
			min = min > arr[i] ? arr[i] : min;
		}

		sc.close();

		// 6.
		System.out.println("최솟값 : " + min);
	}
}
