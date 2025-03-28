package Day02;

public class Ex05_Long {
	public static void main(String[] args) {
		// int (4bytes : 32bits) : 2^32ro : 약 42억 개
		// int 수 표현 범위         : -21억xxx ~ 21억xxx
		
		//long (8bytes : 64bits) : 2^64 개
		long ln1 = 1000;
		long ln2 = 2100000000; // 이건 왜 되냐..-> 일단 숫자 기본은 int로 판단하니까 이건 일단은 됨
		long ln3 = 2200000000l; // long으로 변수 설정해도 뒤에 L문자 안붙이면 long으로 인식안해서 에러나는듯? 
		                        // 대문자 L 이든 소문자 l이든 상관은 없는듯.
		
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
		
	}
}
