package Day04_0313;

public class Ex09_String {

	public static void main(String[] args) {
		// String은 참조 자료형
		// - 문자열 한 글자씩 그 자체를 비교 할 때는 equals()를 사용

		// 문자열 사용 방법
		// 1. 문자열 리터럴("")로 지정
		// 2. 문자열 객체 생성

		// 문자열 리터럴
		String a = "Hello";
		String b = "Java";
		String c = "Hello";

		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");

		System.out.println("a == c : " + (a == c));			// true
		System.out.println("a == d : " + (a == d));			// false
		System.out.println("문자열 비교 : " + (a.equals(d)));	// true

		System.out.println("e == f : " + (e == f));			// false
		System.out.println("문자열 비교 : " + (e.equals(f)));	// true

		testCode();

	}

	private static void testCode() {
		System.out.println();
		System.out.println("연습코드");
		String a = "Aloha";
		String b = "Aloha";

		String c = new String("Aloha");
		String d = new String("Aloha");

		System.out.println("a == b : " + (a == b));
		System.out.println("c == d : " + (c == d));

		System.out.println("a.equals(b) : " + (a.equals(b)));
		System.out.println("c.equals(d) : " + (c.equals(d)));

		System.out.println("a : " + System.identityHashCode(a));
		System.out.println("b : " + System.identityHashCode(b));
		System.out.println("c : " + System.identityHashCode(c));
		System.out.println("d : " + System.identityHashCode(d));
	}
}
