package Day08.Ex01_TryCatch;

/**
 * 예외 처리
 * Number
 */
public class NumberFormat {
	public static void main(String[] args) {
		String strNum = "10";
		int num = 10;
		
		
//		(strNum + 20)
//		(String) + (int)
//		(String) + (String) = (String)
//		+ : 문자열 연결 연산자
		System.out.println("10 + 20 = " + (strNum + 20));
//		+ : 산술 연산자
		System.out.println("10 + 20 = " + (num + 20));
		
		String numberString = "10";
		String numberAndString = "A10";
//		Integer.parseInt("문자열숫자")
//		: 문자열 숫자를 int 타입의 숫자로 변환하는 메소드
		int num1 = Integer.parseInt(numberString);   // "10" --> 10
		System.out.println("numberString + 5 = " + (numberString + 5)); // 105
		
		int num2 = 0;
//		예외 메세지 : java.lang.NumberFormatException : For input string : "A10"
//		예외 상황 : 문자열 숫자가 아닌 문자열을 숫자로 변환할 수 없기 때문에 예외 발생
		try {
			num2 = Integer.parseInt(numberAndString);
		} catch (NumberFormatException e) {
			System.err.println("문자열숫자가 아닌 문자열을 숫자타입으로 변환할 수 없습니다.");
			// TODO: handle exception
		}
		
		System.out.println("num1 + 10 = " + (num1 + 10));
		System.out.println("num2 : " + num2);
		
	}

}
