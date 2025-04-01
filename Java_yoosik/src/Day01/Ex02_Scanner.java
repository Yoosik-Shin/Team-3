package Day01;

import java.util.Scanner;

// import : 외부 클래스를 포함시키기
// import 패키지명.클래스명; 
// 일반적으로 패키지이름은 소문자로 작성, 클래스 이름은 대문자로 시작

public class Ex02_Scanner {
	
	// main -> ctrl + space
	public static void main(String[] args) {
		// 객체 생성 키워드 : new
		// 클래스타입 객체명 = new 클래스명();
		// Scanner : 표준 입력 객체
		Scanner sc = new Scanner(System.in);
		// 앞의 Scanner는 뭐고 뒤에 new Scanner는 뭐지.. 무슨차이지??
		
		// (에러) : 빨간색 밑줄로 표시
		//       - 에러가 발생하면, 프로그램 실행 불가
		// (경고) : 노란색 밑줄로 표시
		//       - 경고가 발생해도, 프로그램 실행 가능
		
		System.out.print("a: ");
		int a = sc.nextInt(); // nextInt() : 정수 하나를 입력받는 메소드
		System.out.println("a : " + a);
		
		// close() : Scanner 객체를 메모리에서 해제하는 메소드
		sc.close();
		
		//sc.nextInt();
		// Scanner 객체를 해제한 후에는 더 이상 입력을 받을 수 없다.
		// 에러. 스캐너 해제 후에 다시 입력받으려고 해서? 
		// ↑ 이게 맞는듯 스캐너는 이미 해제 됐으니 사용불가
		// 입력받을 변수를 지정안해서? 할당될 변수 없이 그냥 입력메소드만 작성해서?
	}
	
}
