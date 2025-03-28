package Day13_0326.Ex03_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LottoArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("몇 게임 : ");
		int N = sc.nextInt();

		sc.close();

		for (int i = 0; i < N; i++) {

			ArrayList<Integer> lottoSet = new ArrayList<Integer>();

			System.out.print("[" + (i + 1) + "게임] : ");

			// -랜덤수 6개 대입
			for (int j = 0; j < N; j++) {
				int rand = (int) (Math.random() * 45) + 1;

				// 중복 제거
				if (lottoSet.contains(rand)) j--;
				else lottoSet.add(rand);
			}

			// 정렬
			Collections.sort(lottoSet);

			// 출력
			for (Integer lotto : lottoSet) {
				System.out.print(lotto + " ");

			}
			System.out.println();
		}
	}
}
