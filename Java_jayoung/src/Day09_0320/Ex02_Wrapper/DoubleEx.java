package Day09_0320.Ex02_Wrapper;

public class DoubleEx {

	public static void main(String[] args) {
		// Double
		// double -> Double
		// : 실수타입인 double 기본타입을 객체화한 클래스
		Double d = 3.14;
		System.out.println(d.toString() + 0.06);				// 실수형 -> 문자열
		System.out.println(Double.parseDouble("3.14") + 0.06);	// 문자열 -> 실수형

		// null 참조 자료형이 참조하고 있는 인스턴스가 존재하지 않음
		// double a = null ;	// 기본타입은 null 지정 불가
		Double b = null;		// null은 참조 자료형에만 사용 가능
	}
}
