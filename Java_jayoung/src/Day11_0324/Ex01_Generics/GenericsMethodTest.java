package Day11_0324.Ex01_Generics;

class Generic_01 {
	public <T> T testMethod() {
		return null;
	}
}

class Generic_02 {
	public <T extends Number> T testMethod() {
		Integer result1 = Integer.valueOf("10");
		Number  result2 = Integer.valueOf(10);
		// reutrn result1;
		// reutrn result2;
		return null;
	}
}

class Generic_03<T> {
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public <T> T testMethod() {
		// return t;
		return null;
	}
}

public class GenericsMethodTest {

	public static void main(String[] args) {

		Generic_01         gm = new Generic_01();
		Generic_02         gl = new Generic_02();
		Generic_03<Number> gc = new Generic_03<Number>();

		String  gmResult1 = gm.<String>testMethod();
		Integer gmResult2 = gl.<Integer>testMethod();
		String  gmResult3 = gc.<String>testMethod();

		System.out.println("gmResult1 : " + gmResult1);
		System.out.println("gmResult2 : " + gmResult2);
		System.out.println("gmResult3 : " + gmResult3);
	}
}