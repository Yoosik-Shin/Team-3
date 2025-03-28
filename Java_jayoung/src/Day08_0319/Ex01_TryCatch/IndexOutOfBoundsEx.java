package Day08_0319.Ex01_TryCatch;

import java.util.Scanner;

/**
 * 예외 처리
 * IndexOutOfBound
 * : 배열이나 문자열의 index 범위를 벗어나는경우 발생하는 예외
 */
public class IndexOutOfBoundsEx {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("배열 요소의 개수 : ");
		int N = sc.nextInt();

		int arr[] = new int[N];

		System.out.print("접근 할 index : ");
		int index = sc.nextInt();
		System.out.print("입력 할 값 : ");
		int input = sc.nextInt();

		sc.close();

		// 예외 메세지	: java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
		// 예외 상황	: 배열의 index 범위를 초과하여 접근하는 경우
		try {
			arr[index] = input;
			System.out.println("arr[" + index + "]" + arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("배열의 index 범위를 초과하여 접근하였습니다.");
			System.err.println("(0 ~ " + (N - 1) + ") 사이의 정수 범위에서 입력해 주세요.");
		}
	}
}
