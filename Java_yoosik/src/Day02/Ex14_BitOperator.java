package Day02;

public class Ex14_BitOperator {

	public static void main(String[] args) {
//		Integer.toBinaryString() : 십진수를 이진수 문자열로 변환하는 메소드
		//비트연산들은 이진수로 바꿔놓고 각 자리를 비교하여 연산....?
		// AND
		int result = 20 & 16;
		System.out.println("20 & 16 = " + result);
		System.out.println( Integer.toBinaryString(20));
		System.out.println( Integer.toBinaryString(16));
		System.out.println("---------------------------");
		System.out.println( Integer.toBinaryString(result));
		System.out.println();
		
		// OR
		int result2 = 20 | 16;
		System.out.println("20 | 16 = " + result2);
		System.out.println( Integer.toBinaryString(20));
		System.out.println( Integer.toBinaryString(16));
		System.out.println("---------------------------");
		System.out.println( Integer.toBinaryString(result2));
		System.out.println();
		
		// XOR
		// : 서로 값이 다르면 1(true), 같으면 0(false) 
		int result3 = 20 ^ 16;
		System.out.println("20 ^ 16 = " + result3);
		System.out.println( Integer.toBinaryString(20));
		System.out.println( Integer.toBinaryString(16));
		System.out.println("---------------------------");
		System.out.println( Integer.toBinaryString(result3));
		System.out.println();
		
		
		//시프트연산은 각 자리를 왼쪽이냐 오른쪽이냐에 따라 자리를 미루어 계산
		// 왼쪽 시프트 연산 (<<)
		int a = 5;
		int result4 = a << 1;
		System.out.println(result4);
		
		//오른쪽 시프트 연산 (>>)
		int b = 10;
		int result5 = b >> 2;
		System.out.println(result5);
	}

}
