package Day08_0319.Ex03_MultiCatch;

import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		char[] char1 = str1.toCharArray();	// String -> char[] 변환
		char[] char2 = str2.toCharArray();	// "10" -> [1][0]

		// 문자 배열 -> 문자열 배열로 변환
		// char1 -> ['1']['0']
		// input -> ["1"]["0"]
		String[] input1 = new String[char1.length];
		String[] input2 = new String[char2.length];

		for (int i = 0; i < char1.length; i++) {
			input1[i] = char1[i] + "";
		}

		for (int i = 0; i < char2.length; i++) {
			input2[i] = char2[i] + "";
		}

		// 멀티 catch
		// : 하나의 catch 블록에서 처리하고 싶은 예외를 | 기호로 연결하여 처리하는 것
		try {
			System.out.println(input1[0] + input1[1]);
			System.out.println(input2[0] + input2[1]);

			int value1 = Integer.parseInt(str1);
			int value2 = Integer.parseInt(str2);
			int result = value1 + value2;
			System.out.println(str1 + " + " + str2 + " = " + result);

		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {

			System.out.println("숫자로 변환 할 수 없는 값입니다. (문자를 입력한 경우)");
			System.out.println("접근 할 수 없는 배열 index 범위입니다. (한자리 자리수만 입력한 경우)");

		} catch (Exception e) {

			System.out.println("이 외의 알 수 없는 예외 발생");
		}
		sc.close();
	}
}
