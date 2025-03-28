package Day02;

public class Ex06_FloatDouble {
	public static void main(String[] args) {
		
		// 실수 타입 변수 선언
		// float 타입 리터럴        : 실수F
		// double 타입 리터럴       : 실수D
		// √ double 타입 리터럴 D는 생략 가능(실수 기본인식값이 더블이라서)
		
		double var1 = 3.14; // D 생략 가능
		double var2 = 3.14D; // D 붙여도 됨
		
		float var3 = 3.14f;    // f안붙여서 에러났나?
		                      // 3.14는 기본이 double 그러므로 더블은 8byte
		                      // float는 4byte, 그래서 큰게 작은거에 안들어가서 에러남
		                      // 강제형변환( 앞에 (float) 붙여주던가) 아니면 뒤에 F붙여줘야 함
		
		// 실수형 정밀도
		// double : 16~17 자리 정도
		// float  : 7~8 자리 정도
		double var4 = 0.123456789123456789D;
		float var5 = 0.123456789123456789F;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
	}
}
