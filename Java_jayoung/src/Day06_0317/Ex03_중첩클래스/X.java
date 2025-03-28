package Day06_0317.Ex03_중첩클래스;

public class X {

	int        xInt    = 1;
	static int xStatic = 2;

	X() {
		System.out.println("X 객체 생성");
	}

	// 인스턴스 이너 클래스
	class Y {
		int        yInt    = 100;
		static int yStatic = 200;

		Y() {
			System.out.println("------------------------------");
			System.out.println("X의 Y 객체 생성");
			System.out.println("------------------------------");
			System.out.println("X의 변수 접근\t: " + xInt);
			System.out.println("X의 static 변수 접근 : " + xStatic);
			System.out.println("Y의 변수\t\t: " + yInt);
			System.out.println("Y의 static 변수\t: " + yStatic);
		}

		void method1() {
			System.out.println("------------------------------");
			System.out.println("Y의 메소드");
			System.out.println("------------------------------");
			System.out.println("X의 변수 접근\t: " + xInt);
			System.out.println("X의 static 변수 접근 : " + xStatic);
			System.out.println("Y의 변수\t\t: " + yInt);
			System.out.println("Y의 static 변수\t: " + yStatic);
		}

		static void method2() {
			System.out.println("------------------------------");
			System.out.println("Y의 static 메소드");
			System.out.println("------------------------------");
			// (에러) System.out.println("X의 변수 접근\t: " + xInt);
			System.out.println("X의 static 변수 접근 : " + xStatic);
			// (에러) System.out.println("Y의 변수\t\t: " + yInt);
			System.out.println("Y의 static 변수\t: " + yStatic);
		}
	}

	// static 이너 클래스
	// * static 이너 클래스에서는 static 멤버 사용가능
	static class Z {
		int        zInt    = 1000;
		static int zStatic = 2000;

		Z() {
			System.out.println("X의 Z 객체 생성");
			// (에러) System.out.println("X의 변수 접근\t: " + xInt);
			System.out.println("X의 static 변수 접근 : " + xStatic);
			System.out.println("Z의 변수\t\t: " + zInt);
			System.out.println("Z의 static 변수\t: " + zStatic);
		}

		void method1() {
			System.out.println("------------------------------");
			System.out.println("Z의 메소드");
			System.out.println("------------------------------");
			System.out.println("Z의 변수\t\t: " + zInt);
			System.out.println("Z의 static 변수\t: " + zStatic);
			// System.out.println("X클래스의 변수 접근 : " + xInt);
			System.out.println("X클래스의 static 변수 접근 : " + xStatic);
		}

		static void method2() {
			System.out.println("------------------------------");
			System.out.println("Z의 static 메소드");
			System.out.println("------------------------------");
			// System.out.println("Z의 변수\t\t: " + zInt);
			System.out.println("Z의 static 변수\t: " + zStatic);
			// System.out.println("X클래스의 변수 접근 : " + xInt);
			System.out.println("X클래스의 static 변수 접근 : " + xStatic);
		}
	}

	// 로컬 클래스
	// : 메소드 안에 정의한 클래스
	// - 메소드가 실행될 때만 사용되는 이너 클래스
	void method() {
		class L {

			int        lInt    = 10000;
			static int lStatic = 20000;

			L() {
				System.out.println("X의 L 객체 생성");
			}

			void method1() {
				System.out.println("------------------------------");
				System.out.println("L의 메소드");
				System.out.println("------------------------------");
				System.out.println("L의 변수\t\t: " + lInt);
				System.out.println("L의 static 변수\t: " + lStatic);
				System.out.println("X클래스의 변수 접근 : " + xInt);
				System.out.println("X클래스의 static 변수 접근 : " + xStatic);
			}

			static void method2() {
				System.out.println("------------------------------");
				System.out.println("L의 static 메소드");
				System.out.println("------------------------------");
				// System.out.println("L의 변수\t\t: " + lInt);
				System.out.println("L의 static 변수\t: " + lStatic);
				// System.out.println("X클래스의 변수 접근 : " + xInt);
				System.out.println("X클래스의 static 변수 접근 : " + xStatic);
			}
		}
		L l = new L();
		l.method1();
		L.method2();
	}
}
