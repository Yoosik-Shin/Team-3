package Day06_0317.Ex04_중첩인터페이스;

public class I {

	// 중첩 인터페이스 정의
	// * 중첩 인터페이스에 static 생략하면, 컴파일러가 자동으로 추가한다.
	static interface J {
		void methodA();
		void methodB();
	}

	J j;

	public void setInterface(J j) {
		this.j = j;
	}

	void method() {
		j.methodA();
		j.methodB();
	}
}
