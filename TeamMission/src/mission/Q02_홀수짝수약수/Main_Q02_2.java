package mission.Q02_홀수짝수약수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// 정수 하나를 입력받아, 정수형 변수N에 초기화시키고,
// 정수 1부터 N까지 홀수의 합계와 짝수의 합계
// 그리고 정수N의 약수를 구하여
// 예시<출력>과 같이 출력하는 프로그램을 작성하시오. ( 1 ≤ N ≤ 100 )
// (설명)
// 10을 입력받아서,
// 1번 줄에는 1 ~ N에 대한 홀수의 수식 및 합계,
// 2번 줄에는 1 ~ N에 대한 짝수의 수식 및 합계,
// 3번 줄에는 N의 약수를 출력하시오.

// 입력
// 10

// 출력
// 1+3+5+7+9=25
// 2+4+6+8+10=30
// 1 2 5 10
public class Main_Q02_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 사용자로부터 입력 받을 숫자
		int input = 0;

		while (true) {
			System.out.print("1 ≤ N ≤ 100까지의 정수 : ");
			input = scanner.nextInt();

			if (!(input >= 1 && input <= 100)) {
				System.out.println("범위 내의 숫자를 입력하세요.");
			} else {
				break;
			}
		}

		scanner.close();

		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int number = 1; number <= input; number++) {
			numList.add(number);
		}

		// 가져오기
		final int temp = input;

		List<Integer> addList    = numList.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		List<Integer> evenList   = numList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		String        divisorStr = numList.stream().filter(num -> temp % num == 0).map(String::valueOf)
				.collect(Collectors.joining(" "));

		int    addSum = addList.stream().mapToInt(Integer::intValue).sum();
		String addStr = addList.stream().map(String::valueOf).collect(Collectors.joining("+"));
		System.out.println(addStr + "=" + addSum);

		// 짝수 가져오기
		int    evenSum = evenList.stream().mapToInt(Integer::intValue).sum();
		String evenStr = evenList.stream().map(String::valueOf).collect(Collectors.joining("+"));
		System.out.println(evenStr + "=" + evenSum);

		// 약수
		System.out.println(divisorStr);
	}
}
