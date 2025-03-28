package Day03_0312;

public class Ex15_GuguAll {

	public static void main(String[] args) {
		// (단) X (1 ~ 9)
		// 단에 대한 반복 : 1 ~ 9
		// 각 단의 곱 : 1 ~ 9
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		System.out.println();

		// 중첩 반복문(이중 반복문)
		// 안쪽 반복문이 먼저 다 돌고, 바깥쪽 반복 변수가 증감된다..
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " x " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
