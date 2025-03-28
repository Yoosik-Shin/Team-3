package Day09.Ex02_Wrapper;


import java.util.Scanner;

public class BooleanEx {

	public static void main(String[] args) {
		// Boolean
		// boolean -> Boolean
		// : 불타입인 boolean 기본타입을 객체화한 클래스
		Integer i = 100;
		Boolean b = (i < 40);
		// 불 타입을 문자열로 치환
		System.out.println( Boolean.toString(b) + "입니다.");		// false 	->	"false"
		// 문자열을 불 타입으로 치환
		System.out.println( Boolean.parseBoolean("false"));		// "false" 	-> 	false
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		boolean check = Boolean.parseBoolean( sc.nextLine() ); // 대소문자 구분없이 true 인식
		if( check ) {
			System.out.println("\"true\" 를 입력하였습니다.");
		}
		else {
			System.out.println("\"true\" 가 아닙니다.");
		}
		sc.close();
	}
}

//  \"true\"  ->  \" 는 큰 따옴표를 문자로 인식해서 표현해줌



