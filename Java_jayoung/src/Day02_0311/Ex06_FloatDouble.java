package Day02_0311;

public class Ex06_FloatDouble {

	public static void main(String[] args) {

		// 실수 타입 변수 선언
		// float 타입 리터럴 : 실수F
		// double 타입 리터럴 : 실수D
		// double 타입 리터럴 D는 생략 가능

		double var1 = 3.14;
		double var2 = 3.14d;

		// float var3 = 3.14;
		float var4 = (float) 3.14;
		float var5 = 3.14f;

		// 실수형 정밀도
		// double : 16~17 자리 정도
		// float : 7~8 자리 정도
		double var6 = 0.123456789123456789D;
		float  var7 = 0.123456789123456789F;

		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		// System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
	}
}
