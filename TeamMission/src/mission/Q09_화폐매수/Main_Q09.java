package mission.Q09_화폐매수;

import java.util.ArrayList;
import java.util.Scanner;

// 다음의 <조건>에따라 화폐 매수를 구하는 프로그램을 작성하시오.
// <조건>
// (1) 화폐는 고액권을 우선으로 지급, 나머지 금액은 그 다음 단위의 화폐 순서로 지급한다.
// (2) 화폐 단위는50000원, 10000원, 5000원, 1000원, 500원, 100원, 50원, 10원, 5원, 1원의 10가지 종류가 있다.
// (3) 입력 데이터는 성명, 간식비 지급액이며, 성명의 입력이"QUIT" 이면 입력의 끝으로 간주한다.
// (4) 출력은 성명, 간식비 지급액, 개인별 각 화폐매수, 마지막에 전체 화폐매수를 출력한다.
// 입력
// 제니 623843
// 지수 728394
// 리사 432942
// 로제 942783
// 출력
// 성명 출장비 오만원 만원 오천원 천원 오백원 백원 오십원 십원 오원 일원
// 제니 623843 12 2 0 3 1 3 0 4 0 3
// 지수 728394 14 2 1 3 0 3 1 4 0 4
// 리사 432942 8 3 0 2 1 4 0 4 0 2
// 로제 942783 18 4 0 2 1 2 1 3 0 3
// 전체화폐매수: 52 13 1 10 3 12 2 15 0 12
class Person {
	String name;
	int    pay;
	int[]  units;

	public Person(String name, int pay) {
		this.name  = name;
		this.pay   = pay;
		this.units = new int[10];
	}

	@Override
	public String toString() {
		String unit = "";

		for (int i : units) {
			unit = unit + "\t" + i;
		}

		return this.name + "\t" + this.pay + unit;
	}

}

public class Main_Q09 {

	public static void main(String[] args) {
		Scanner           sc     = new Scanner(System.in);
		ArrayList<Person> people = new ArrayList<Person>();
		while (true) {
			// 입력 데이터는 성명, 간식비 지급액

			System.out.print("성명 : ");
			String name = sc.nextLine();

			// 성명의 입력이"QUIT" 이면 입력의 끝
			if ("QUIT".equals(name)) {
				break;
			}

			System.out.print("출장비 : ");
			int pay = sc.nextInt();
			sc.nextLine(); // 비우기

			people.add(new Person(name, pay));

		}
		sc.close();

		// 화폐매수 계산
		for (Person person : people) {

			int     money  = 50000; // 화폐단위
			int     count  = 0;     // 화폐매수
			boolean change = true;  // 화폐단위변환

			int   input = person.pay;
			int[] unit  = person.units;
			int   index = 0;

			while (money >= 1) {

				// 화폐매수 계산
				count = input / money;

				// 잔액 계산
				input = input % money;

				// (장수, 개수) 저장
				unit[index++] = count;

				// 화폐 단위 변환
				if (change) {
					money /= 5;
				} else {
					money /= 2;
				}
				change = !change;
			}

		}

		// 성명 출장비 오만원 만원 오천원 천원 오백원 백원 오십원 십원 오원 일원
		// 제니 623843 12 2 0 3 1 3 0 4 0 3
		// 지수 728394 14 2 1 3 0 3 1 4 0 4
		// 리사 432942 8 3 0 2 1 4 0 4 0 2
		// 로제 942783 18 4 0 2 1 2 1 3 0 3
		// 전체화폐매수: 52 13 1 10 3 12 2 15 0 12
		// * (리터럴) : %d (정수), %f (실수), %s (문자열)

		// 성명, 간식비 지급액, 개인별 각 화폐매수, 마지막에 전체 화폐매수를 출력
		System.out.println("성명	출장비	오만원	만원	오천원	천원	오백원	백원	오십원	십원	오원	일원");
		int[] units = new int[10];
		for (Person person : people) {
			System.out.println(person);
			for (int index = 0; index < units.length; index++) {
				units[index] += person.units[index];
			}
		}
		System.out.print("전체화폐매수");
		for (int unit : units) {
			System.out.print("\t" + unit);
		}
	}
}
