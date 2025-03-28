package Day03_0312;

import java.util.Scanner;

// 알클 : java, java 기본, 조건문 yield
public class Ex08_SwitchYield {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		sc.close();

		// 입력받은 정수를 5로 나눈 나머지가
		// 2보다 작으면 "*"
		// 그렇지 않으면 "**" 출력
		// switch 문을 이용하시오.

		String result = switch (num % 5) {
			case 0, 1 : {
				yield "*";
			}
			default : {
				yield "**";
			}
		};
		System.out.println("1 : " + result);

		// 반환값만 지정하는 경우, yield 생략하고 -> 사용 가능
		result = switch (num % 5) {
			case 0, 1 -> "*";
			default   -> "**";
		};
		System.out.println("2 : " + result);

		// 블록의 실행문이 여러 줄인 경우 yield 필수
		// yield 반환값;
		result = switch (num % 5) {
			case 0, 1 -> "*";
			default   -> {
				System.out.println("별 2개");
				yield "**";
			}
		};
		System.out.println("3 : " + result);

		System.out.println("4 : " + switch (num % 5) {
			case 0, 1 -> "*";
			default   -> "**";
		});
	}
}
