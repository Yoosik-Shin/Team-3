package Day03;

public class Ex09_While {

	public static void main(String[] args) {
		// 1~10 까지 공백을 두고 출력하시오.
		// 1 2 3 4 5 6 7 8 9 10
		
		int a = 1;
		
		// while ( 조건 ) { 반복 실행문 }
		// - 반복문에는 반드시 종료 조건이 성립하도록 작성 해야한다.
		// - 종료 조건이 만족하지 않으면, 무한 루프에 빠진다.
		while (a <= 10) {
			System.out.print(a++ + " ");
			// a = a + 1;
			//a += 1;(복합대입연산자)
			//a++; 
			//셋중에 아무거나...아래쪽일수록 권장사항
		}
	}

}
