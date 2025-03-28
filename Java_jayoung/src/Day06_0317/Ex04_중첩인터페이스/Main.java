package Day06_0317.Ex04_중첩인터페이스;

public class Main {

	// 중첩 인터페이스
	// 클래스 내부에 선언한 인터페이스
	//
	// static 이너 인터페이스만 존재
	// -> static 을 생략하면, 컴파일러가 자동으로 추가
	// 인터페이스 객체 생성 방법 : 인터페이스 타입 객체명 = new 구현 클래스
	// 이너 인터페이스 타입 : '아우터 클래스.이너 인터페이스'

	public static void main(String[] args) {

		// 중첩 인터페이스의 아우터 클래스 객체 생성
		I i = new I();

		// 구현 객체를 메소드를 통해 지정
		K k = new K();
		i.setInterface(k);
		i.method();
		System.out.println();

		I.J j = new K();
		j.methodA();
		j.methodB();
	}

}
