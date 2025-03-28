package Day06_0317.Ex03_중첩클래스;

public class NestedClass2 {
	public static void main(String[] args) {
		// X
		// - Y : 인스턴스 이너 클래스
		// - Z : static 이너 클래스
		// * method
		// - L : 로컬 클래스

		X x = new X();
		X.xStatic = 4;
		System.out.println(x.xInt);		// 클래스 변수
		System.out.println(X.xStatic);	// 클래스 static 변수
		System.out.println();

		// 인스턴스 이너 클래스 객체 생성
		X.Y y = x.new Y();
		y.yInt      = 10;	// InnerClass 변수
		X.Y.yStatic = 20;	// InnerClass static 변수
		y.method1();		// InnerClass 메소드
		X.Y.method2();		// InnerClass static 메소드
		System.out.println();

		// static 이너 클래스 객체 생성
		X.Z z = new X.Z();
		z.zInt      = 100;	// staticInnerClass 변수
		X.Z.zStatic = 200;	// staticInnerClass static 변수
		z.method1();		// staticInnerClass 메소드
		X.Y.method2();		// staticInnerClass static 메소드
		System.out.println();

		// 로컬 클래스 객체 생성을 위한 메소드 호출
		// 내부에서 L객체 생성
		x.method();
	}
}