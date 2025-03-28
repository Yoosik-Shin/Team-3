package Day01_0310;

import java.util.Scanner;

public class Ex02_ScannerPluralTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력하세요. : ");

		while (sc.hasNext()) {
			int a = sc.nextInt();
			System.out.println("입력하신 값은 : " + a);
		}
		sc.close();
	}
}
