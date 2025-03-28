package Day06_0317.Ex00_Review;

public class Ex04_Lotto {
	public static void main(String[] args) {
		// Math.random() : 0.xxxxxxxx ~ 0.9xxxxxx 사이의 난수를 반환하는 메소드
		double random = Math.random();
		System.out.println(random);

		// 1 ~ 10 사이의 정수
		// (int) (Math.random() * 10)		: 0 ~ 9
		// (int) (Math.random() * 10) + 1	: 1 ~ 10

		System.out.println("1 ~ 10	 : " + (int) ((Math.random() * 10) + 1));

		// 1 ~ 6 사이의 정수 : 주사위
		// (int) (Math.random() * 6)		: 0 ~ 5
		// (int) (Math.random() * 6) + 1	: 1 ~ 6
		// (공식) : (int) (Math.random() * [개수]) + [시작숫자]
		System.out.println("1 ~ 6	 : " + (int) ((Math.random() * 6) + 1));

		// 1 ~ 20 사이의 랜덤수
		System.out.println("1 ~ 20	 : " + (int) ((Math.random() * 20) + 1));

		// -20 ~ 20 사이의 랜덤수
		System.out.println("-20 ~ 20 : " + (int) ((Math.random() * 41) - 20));

		// 1 ~ 45 사이의 랜덤수 6개를 배열에 저장하시오.
		// (과제 오름차순 출력)
		System.out.print("1 ~ 45	 : ");
		int lotto[] = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			// 중복 제거
			lotto[i] = (int) ((Math.random() * 45) + 1);

			for (int j = i - 1; j >= 0; j--) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		for (int i : lotto) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
