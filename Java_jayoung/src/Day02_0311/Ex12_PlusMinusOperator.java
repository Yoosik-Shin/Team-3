package Day02_0311;

public class Ex12_PlusMinusOperator {

	public static void main(String[] args) {

		int a = 10, b = 20, c;
		int x = 10, y = 20, z;

		// 증감연산자
		// ++a, a++ : a를 1증가
		// --a, a-- : a를 1감소

		// 전위연산자 : 연산자 운선 순위가 가장 높다. (++a, --a)
		c = ++a + b;
		System.out.println("a = " + a);
		System.out.println("c = " + c);

		// 후의연산자 : 연산자 우선 순위가 가장 낮다. (a++, a--)
		z = x++ + y;
		System.out.println("x = " + x);
		System.out.println("z = " + z);

	}
}