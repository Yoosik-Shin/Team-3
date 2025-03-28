package Day11_0324.Ex01_Generics;

class X {}

class A extends X {}
class B extends A {}
class C extends A {}

class D<T extends A> {

	private T t;

	public T getT() {
		System.out.println("D : getT");
		return t;
	}

	public void setT(T t) {
		System.out.println("D : setT");
		this.t = t;
	}
}

// Number 클래스 타입 매개변수로 사용 가능하도록 제한
// Integer, Double 등 숫자타입 클래스만 사용 가능하도록 제한)
class E<T extends Number> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class LimitedTypeClass {

	public static void main(String[] args) {

		D<A> d1 = new D<A>();
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
		// D<X> d4 = new D<X>>();
		// D 클래스 타입 매개변수를 A 클래스로 제한하고 있기 때문에,
		// X 클래스 타입 매개변소 지정 불가
		// A, B, C 클래스로 타입 매개변수 지정 가능

		d1.setT(new A());
		d2.setT(new B());
		d3.setT(new C());

		// 업캐스팅
		d1.setT(new B());	// B의 부모 클래스인 A클래스로 업캐스팅
		d1.setT(new C());	// C의 부모 클래스인 A클래스로 업캐스팅

		// 다운캐스팅 불가 : 다운 캐스팅의 전제조건인 업캐스팅이 존재하지 않으므로
		// d2.setT(new A());
		// d3.setT(new A());
		// d2.setT((B) new B());
		// d3.setT((C) new A());

		A a = new B();
		d2.setT((B) a);

		// E<T extends Number>
		// * Number 클래스로 제한하므로 숫자 타입인 클래스만 타입지정 가능
		E<Integer> e1 = new E<Integer>();
		E<Double>  e2 = new E<Double>();
		E<Byte>    e3 = new E<Byte>();

		// 에러 : 숫자타입 아님
		// E<Boolean> e5 = new E<Boolean>();

		e1.setT(100);
		System.out.println(e1.getT());
		e2.setT(12.34);
		System.out.println(e1.getT());
		// 그냥 쓴 정수는 byte 범위 안에 있어도 리터럴이 int 타입으로 인식
		// e3 객체에 지정한 타입은 Byte(byte) -> 1byte이기 때문에 강제 형변환이 필요한다.
		e3.setT((byte) 127);
		System.out.println(e1.getT());
	}
}
