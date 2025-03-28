package Day13_0326.Ex03_Stream;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoStream {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("몇 게임 : ");
		int N = sc.nextInt();

		sc.close();

		for (int i = 0; i < N; i++) {

			Set<Integer> lottoSet = new HashSet<Integer>();

			System.out.print("[" + (i + 1) + "게임] : ");
			while (lottoSet.size() < 6) {
				int rand = (int) (Math.random() * 45) + 1;
				lottoSet.add(rand);
			}

			// 정렬, 출력
			lottoSet.stream().sorted().forEach(lotto -> System.out.print(lotto + " "));

			System.out.println();
		}
	}
}
