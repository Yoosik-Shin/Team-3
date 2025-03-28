package Day06_0317.Ex03_중첩클래스;

/**
 * 중첩 클래스
 * 
 * - 멤버 클래스
 *   - 인스턴스 이너 클래스
 * 		A 객체를 생성해야만 사용 할 수 있는 B이너 클래스
 * 		class A {
 * 			class B {}
 * 		}
 * 		A a = new A();
 * 		A.B b = a.new B();
 *   - static 이너 클래스
 *   	A 클래스로 바로 접근 할 수 있는 B이너 클래스
 * 		class A {
 * 			static class B {}
 * 		}
 * 		A.B b = new A.B();
 * - 로컬 클래스
 * : 메소드 내 클래스 정의, 메소드가 실행 될 때만 사용되는 이너 클래스
 * 		class A {
 * 			void method() {
 * 				class B {}
 * 			}
 * 		}		
 */
public class NestedClass {

	public static void main(String[] args) {
		// 아우터 클래스인 A객체 생성
		A a = new A();
		a.a = 10;
		a.b = 20;

		System.out.println("A의 a : " + a.a);
		System.out.println("A의 b : " + a.b);
		a.aMethod();
		System.out.println();

		// 이너 클래스인 B 객체 생성
		// 아우터 객체를 통해서 객체를 생성할 수 있다.
		A.B b = a.new B();
		b.x = 30;
		b.y = 40;
		System.out.println("B의 x : " + b.x);
		System.out.println("B의 y : " + b.y);
		b.bMethod();
		// (에러) System.out.println("B의 x : " + b.a);
		// (에러) System.out.println("B의 y : " + b.b);
	}
}
