package Day13_0326.Ex02_Lambda;

/**
 * 람다식 사용하기
 * 1. 함수형 인터페이스 저으이
 * * @FunctionalInterface 어노테이션 지정
 * * 추상 메소드 1개만 정의
 *
 * 2. 람다식 익명 함수를 정의하여 인터페이스에 선언
 * 3. 람다식 호출
 */
// 컴파일러에 함수형 인터페이스임을 명시적으로 알림
@FunctionalInterface
interface FuncInterfase1 {
	// @FunctionalInterface 지정 시, 추상메서드가 없거나 2개 이상이면 에러 발생
	void method();
	// void method2();
}

@FunctionalInterface
interface FuncInterfase2 {
	void method(String a, String b);
}

@FunctionalInterface
interface FuncInterfase3 {
	String method();
}

@FunctionalInterface
interface FuncInterfase4 {
	String method(String a, String b);
}

public class LambdaFormat {

	public static void main(String[] args) {

		// 매개변수 X, 반환타입 X
		// () -> { System.out.println("") ; }
		// () -> System.out.println("") ; * 실행문이 한 문장이면 중괄호 생략 가능
		FuncInterfase1 fi1 = () -> System.out.println("자바 람다식1");
		fi1.method();

		// 매개변수 O, 반환타입 X
		// (a, b) -> { System.out.println(a + b) ; }
		FuncInterfase2 fi2 = (a, b) -> {
			String result = a + b;
			System.out.println(result);
		};
		fi2.method("자바 ", "람다식2");

		// 매개변수 X, 반환타입 O
		// () -> { return 1 + 2 ; }
		// () -> 1 + 2 ;
		FuncInterfase3 fi3 = () -> {
			String a = "자바 ";
			String b = "람다식3";
			return a + b;
		};
		System.out.println(fi3.method());

		// 매개변수 O, 반환타입 O
		// 실행문이 1줄인 경우 { } 생략 가능
		// 반환값이 있는 경우, return / { } 동시 생략
		FuncInterfase4 fi4 = (a, b) -> { return a + b; };
		FuncInterfase4 fi5 = (a, b) -> a + b;
		System.out.println(fi4.method("자바 ", "람다식4"));
		System.out.println(fi5.method("자바 ", "람다식5"));
	}
}
