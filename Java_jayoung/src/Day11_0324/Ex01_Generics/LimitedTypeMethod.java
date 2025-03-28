package Day11_0324.Ex01_Generics;

class LimitedType {

	// 제네릭 메소드 타입 제한
	// Number : 자식 클래스 (Integer, Double 등 숫자관련 클래스)
	public <T extends Number> void method(T t) {

		System.out.println(t.intValue());
		System.out.println(t.doubleValue());
	}
}

public class LimitedTypeMethod {

	public static void main(String[] args) {
		LimitedType ltm = new LimitedType();
		ltm.<Integer>method(1234);
		ltm.<Double>method(12.34);

		// (에러)
		// 문자열은 Number 클래스의 자식 클래스가 아니므로 에러 발생
		// ltm.<String>method("12.34");
	}
}
