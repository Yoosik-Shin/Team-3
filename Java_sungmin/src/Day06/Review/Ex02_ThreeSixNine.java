package Day06.Review;


public class Ex02_ThreeSixNine {
	public static void main(String[] args) {
		
	
	
//	정수 1~100 까지 수를 반복하여 출력하면서,
//	해당 수가 3 또는 6 또는 9가 될 때는
//	자리수마다 369가 되는 개수 만큼 정수 대한
//	"*" 을 출력하는 프로그램을 작성하시오.
//	ex)
//	13 : *
//	66 : **
	
	
//	순서도
//	1. 정수를 1~100 까지 출력
//	2. 해당 수의 369가 몇 개인지 판단
//	  2 - 1. 십의 자리수가 369인지 여부 판단 (A)
//	  2 - 1. 일의 자리수가 369인지 여부 판단 (B)
//	3. 369 개수에 따라 출력
//		 A and B --> **
//		 A or B --> *
//		 그 외 --> 정수
		
		for (int i = 1; i <= 100; i++) {
			
			if( i == 3 || i == 6 || i == 9);
			
			System.out.println(i);
			int A;
			int B;
		}
	}

}
