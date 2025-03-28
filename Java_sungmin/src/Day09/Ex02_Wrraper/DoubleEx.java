package Day09.Ex02_Wrraper;


public class DoubleEx {
	
	public static void main(String[] args) {
		// Double
		// double -> Double
		// : 실수타입인 double 기본타입을 객체화한 클래스
		Double d = 3.14;
		System.out.println( d.toString() + 0.06 );				// 실수형 -> 문자열
		System.out.println( Double.parseDouble("3.14") + 0.06 );// 문자열 -> 실수형
		
//		double a = null; - 기본 타입은 null 지정 불가 (참조자료형이 아니므로 참조할수 없어 null을 할수 없다)
		Double b = null;  // null 은 참조자료형에만 사용 가능
		
	}

}
