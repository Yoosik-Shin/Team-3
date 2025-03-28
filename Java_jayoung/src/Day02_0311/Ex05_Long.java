package Day02_0311;

public class Ex05_Long {

	public static void main(String[] args) {

		// int (4byte : 32bit) : 2 ^ 32개 : 약 42억개
		// int 수 표현 범위 : -21억xx ~ 21억xx

		// long (8byte : 64bit) : 2 ^ 64개 :
		long ln1 = 1000;
		long ln2 = 2100000000;
		long ln3 = 2200000000L;
		long ln4 = 9223000000000000000L;
		// 1.24702982

		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
		System.out.println("ln4 : " + ln4);
	}
}
