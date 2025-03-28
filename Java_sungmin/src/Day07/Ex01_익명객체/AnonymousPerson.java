package Day07.Ex01_익명객체;

public class AnonymousPerson {
	
	Person person2 = new Person() {

		@Override
		void work() {
			// TODO Auto-generated method stub
			super.work();
		}
		
	};

	public void method() {
		// TODO Auto-generated method stub
		
	}

//	익명 자식 객체 생성
	
//	- 부모 클래스 객체명 = new 부모클래스() { 익명객체 정의 }
//		이 영역은 마치 자식 클래스 영역과 같다.
	
		
}
