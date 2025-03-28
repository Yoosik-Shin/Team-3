package Day13_0326.Ex02_Lambda;

/**
 * 익명 객체
 * - 익명 자식 객체
 * - 익명 구현 객체
 * 
 * 익명 함수
 */

// 익명 자식 객체의 부모 클래스 정의
class Television {
	void volumnUp() {
		System.out.println("UP");
	}

	void volumnDown() {
		System.out.println("DOWN");
	}
}

// 익명 구현 객체의 인터페이스 정의
interface RemoteControl {
	void volumnUp();

	void volumnDown();
}

// 익명 함수를 위한 함수형 인터페이스 정의
@FunctionalInterface
interface Calculator {
	int clac(int a, int b);
}

public class LambdaTest {

	public static void main(String[] args) {
		// 익명 자식 객체
		Television tv = new Television() {
			@Override
			void volumnUp() {
				System.out.println("Television UP");
			}

			@Override
			void volumnDown() {
				System.out.println("Television UP");
			}
		};

		// 익명 구현 객체
		RemoteControl rc = new RemoteControl() {
			@Override
			public void volumnUp() {
				System.out.println("RemoteControl UP");
			}

			@Override
			public void volumnDown() {
				System.out.println("RemoteControl UP");
			}
		};

		// 익명 구현 객체2
		Calculator cal2 = new Calculator() {
			@Override
			public int clac(int a, int b) {
				return a + b;
			}
		};

		// 익명 함수
		Calculator cal = (a, b) -> a + b;

		tv.volumnUp();
		tv.volumnDown();
		rc.volumnUp();
		rc.volumnDown();
		System.out.println("익명 함수 : " + cal.clac(202, 202));
		System.out.println("익명 구현 객체2 : " + cal2.clac(202, 202));
	}
}
