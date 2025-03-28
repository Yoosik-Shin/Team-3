package Day13_0326.Ex02_Lambda;

/**
 * 익명함수(람다식)을 메소드에서 반환할 수 있다.
 */
@FunctionalInterface
interface PrintString {
	void showString(String msg);
}

/**
 * 람다식 장점
 * 1. 함수를 쉽게 축약해서 작성할 수 있다.
 * 2. 함수를 메소드를 통해 전달 또는 반환할 수 있다.
 */
public class LanbdaReturn {

	public static void main(String[] args) {
		PrintString ps1 = returnLambda(1);
		PrintString ps2 = returnLambda(2);
		PrintString ps3 = returnLambda(3);
		PrintString ps4 = returnLambda(4);

		ps1.showString("안녕하세요. 1");
		System.out.println("========================");
		ps2.showString("안녕하세요. 2");
		System.out.println("========================");
		ps3.showString("안녕하세요. 3");
		System.out.println("========================");
		ps4.showString("안녕하세요. 4");
		System.out.println("========================");

	}

	private static PrintString returnLambda(int code) {
		switch (code) {
			case 1 :
				return msg -> System.out.println("메세지 : " + msg);
			case 2 :
				return msg -> {
					System.out.println("메세지 : ");
					System.out.println(msg);
				};
			case 3 :
				return msg -> System.out.println(msg);
			default :
				return msg -> System.out.println();
		}
	}
}
