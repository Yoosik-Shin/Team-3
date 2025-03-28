package Day06.Review;

import java.util.Scanner;

/**
 * 우리 학원에서 고건우님께서 거액의 예산을 주고
 * 전자렌지를 구매하라고 지시하였다.
 * 이 때 전자렌지 구매비는 다음과 같이 현금으로 지급한다.
 * 구매비			: 657,862 원 
 * 50000원 권		: 13개
 * 10000원 권		: 0개
 * 5000원 권		: 1개
 * 1000원 권		: 2개
 * 500원			: 1개
 * 100원 		: 3개
 * 50원			: 1개
 * 10원			: 1개
 * 5원			: 0개
 * 1원			: 2개
 * 위와 같이 입력하면,
 * 큰 화폐단위부터 계산하여, 화폐단위별로 화폐매수를 출력하는 프로그램을 작성하시오.
 */

public class Ex03_화폐매수 {
	
	public static void main(String[] args) {
		/**
		 * 순서도
		 * 1. 필요한 변수 선언
		 * 	 - (입력금액), (화폐매수), (화폐단위)
		 * 2. 구매비 입력
		 * 3. 화폐매수 계산
		 * 	3-1. 화폐매수 계산
		 * 		(화폐매수) = (입력금액) / (화폐단위)
		 * 	3-2. 잔액 계산
		 * 		657862 - (50000 * 13) = 7862
		 * 		i) (잔액) = (입력금액) - (화폐단위 * 화폐매수)
		 * 		657862 % 50000 = 7862
		 * 		ii)(잔액) = (입력금액) % (화폐단위) 
		 * 	3-3. 화폐 단위 변환
		 * 		50000 / 5 = 10000
		 * 		10000 / 2 = 5000
		 * 		5000 / 5 = 1000
		 * 		1000 / 2 = 500
		 * 		500 / 5 = 100
		 * 		100 / 2 = 50
		 * 		50 / 5 = 10
		 * 		10 / 2 = 5
		 * 		5 / 5 = 1
		 * 		번갈아 가면서, /5, /2 연산을 반복
		 * 		(화폐단위) = (화폐단위) / 5
		 * 		(화폐단위) = (화폐단위) / 2
		 * 4. 3번 과정을 반복
		 * 		* 조건 : 화폐단위가 1원이 될 때까지
		 */
		// 1. 필요한 변수 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("비용을 입력하세요 : ");
		int price = sc.nextInt();
		int count;
		int money = 50000;
		
//내가 하다만거.
//		boolean sw = true;
//		while(money == 1) {  //조건틀렸따 money >= 1임
//			count = price / money;
//			change = price - (money * count);
//			sw = !sw;
//		}
//		if(sw)
//			money = money / 5;
//		if(!sw)	
//			money = money / 2;
		
		
		boolean sw = true;
		while (money >= 1) {
			// (화폐매수) = (입력금액) / (화폐단위)
			count = price / money;
			System.out.println(money + "\t : " + count + "개");
			// i) (잔액) = (입력금액) - (화폐단위 * 화폐매수)
//			price = price - (money * count);
			// ii)(잔액) = (입력금액) % (화폐단위) 
			price = price % money;
			
			if(sw)
			// 화폐단위 = 화폐단위 / 5
			money = money / 5;
			else
			// 화폐단위 = 화폐단위 / 2
			money = money / 2;
			
			sw = !sw;
			
		}
		
		
		sc.close();
	}
}
