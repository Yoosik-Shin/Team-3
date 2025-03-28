package Day04_0313;

public class Ex04_Foreach {

	public static void main(String[] args) {
		String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};

		// foreach
		// - for (자료형 반복요소명 : 배열) { }
		// : 배열 또는 컬렉션의 모든 요소를 순서대로 전부 반복하는 반복문
		for (String day : week) {
			System.out.print(day + "\t");
		}
		System.out.println();

		// 기본 for문
		for (int day = 0; day < week.length; day++) {
			System.out.print(week[day] + "\t");
		}
		System.out.println();
	}
}
