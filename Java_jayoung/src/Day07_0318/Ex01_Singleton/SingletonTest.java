package Day07_0318.Ex01_Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// new 로 생성 불가
		// ( 에러 ) Singleton singleton = new Singleton();
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		System.out.print("s01과 s02가 같은지 여부 : ");
		System.out.println(singleton1 == singleton2);
	}
}
