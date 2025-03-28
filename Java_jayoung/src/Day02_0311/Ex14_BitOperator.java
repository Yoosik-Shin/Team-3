package Day02_0311;

public class Ex14_BitOperator {

	public static void main(String[] args) {
		// Integer.toBinaryString() 10진수를 2진수 문자열로 변환하는 메소드
		System.out.println();

		// AND
		// : 둘다 1이면 true
		int result1 = 20 & 16;
		System.out.println("20 & 16	: " + result1);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-----------------------------");
		System.out.println(Integer.toBinaryString(result1));
		System.out.println();

		// OR
		// : 둘 중 하나라도 1이면 true
		int result2 = 20 | 16;
		System.out.println("20 | 16	: " + result2);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-----------------------------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();

		// XOR
		// 서로 값이 다르면 1(true), 같으면0(false)
		int result3 = 20 ^ 16;
		System.out.println("20 ^ 16	: " + result3);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-----------------------------");
		System.out.println(Integer.toBinaryString(result3));
		System.out.println();

		// 왼쪽 시프트 연산 (<<)
		int a       = 5;
		int result4 = a << 1;
		System.out.println(a + " << 1	: " + result4);

		// 오른쪽 시프트 연산 (>>)
		int b       = 10;
		int result5 = b >> 2;
		System.out.println(b + " >> 2	: " + result5);

	}
}
