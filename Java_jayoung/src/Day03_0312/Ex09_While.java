package Day03_0312;

// while 조건을 만족하는 동안, 블록 내 실행문을 계속 실행하는 반복문
// do ~ while : 문조건 1회 실행 후, 조건을 검사하여 반복 실행하는 반복문
// for 초기식, 조건식, 증감식을 이용하는 반복문
// foreach문 배열이나 컬렉션의 모든 요소를 순회하는 반복문

public class Ex09_While {

	public static void main(String[] args) {

		// 1~10 까지 공백을 두고 출력하시오.
		// 1 2 3 4 5 6 7 8 9 10

		int a = 1;

		// while(조건){반복 실행문}
		// - 반복문에는 반드시 종료 조건이 성립하도록 작성해야 한다.
		// - 종료 조건이 맞지 않으면, 무한루프에 빠진다.
		while (a <= 10) {
			System.out.print(a + " ");
			a = a + 1;
		}
		System.out.println();

		a = 1;
		while (a <= 10) {
			System.out.print(a + " ");
			a += 1;	// 복합대입 연산자
		}
		System.out.println();

		a = 1;
		while (a <= 10) {
			System.out.print(a + " ");
			a++;	// 증감연산자
		}
		System.out.println();
	}
}
