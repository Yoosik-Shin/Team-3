package Day05.Ex09_final;

public final class FinalClass {
	
	public void method() {
		System.out.println("메소드!");
	}
	
}

class SubClass extends SuperClass {

//	*final 로 지정된 것을 오버라이드 할 수 없다.
//	@Override
//	public String toString() {
//		return "SubClass [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
//				+ "]";
//	}
	
}


// final 로 지정한 클래스는 상속을 할 수 없다.
//class subClass extends FinalClass {
//	
//}
