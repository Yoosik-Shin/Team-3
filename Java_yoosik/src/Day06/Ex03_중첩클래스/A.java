package Day06.Ex03_중첩클래스;

/**
 * 중첩 클래스
 */
// 아우터 클래스
public class A {

	int a, b;
	
	// 이너 클래스
	class B {
		int x, y;
		
		public void bMethod() {
			System.out.println("이너 클래스에서 아우터 클래스의 멤버 접근 가능");
			System.out.println("A 의 a : " + a);
			System.out.println("A 의 b : " + b);
		}
	}
	
	public void aMethod() {
		System.out.println("아우터 클래스에서 이너 클래스의 멤버 접근 불가");
		// (에러) System.out.println("B 의 x : " + x);
		// (에러) System.out.println("B 의 y : " + y);
	}
}
