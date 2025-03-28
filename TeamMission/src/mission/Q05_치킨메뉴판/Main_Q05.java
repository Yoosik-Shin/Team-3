package mission.Q05_치킨메뉴판;

import java.util.Scanner;

// 다음과 같이, 치킨 메뉴판을 출력하고, 메뉴번호를 입력하면,
// 다음 <실행결과>와 같이 출력되는 프로그램을 작성하시오.
// • (조건)
// - do~while 문, switch 문, static 메소드 정의 및 호출을 반드시 사용하시오.
// - 정수 1~3 입력시, 해당 메뉴 이름과 주문 안내 문구를 출력하시오.
// - 정수 0~3 이외의 번호를 입력하면, 0~3 사이의 번호를 입력하도록 요청하는 안내 문구를 출력하시오.
// - 정수 0 입력시, 주문한 메뉴 개수와 주문완료 메시지를 출력하시오.
// ********** 치킨메뉴판**********
// 1.황금올리브반반한치킨
// 2.뿌잉클치킨
// 3.처갓집에서호식이가만든치킨
// 0. 종료
// ********** 번호: 2
// ‘뿌잉클치킨’이(/가) 주문되었습니다.
// ********** 치킨메뉴판**********
// 1.황금올리브반반한치킨
// 2.뿌잉클치킨
// 3.처갓집에서호식이가만든치킨
// 0. 종료
// ********** 번호: 5
// (0~3) 사이의번호를입력해주세요.
// ********** 치킨메뉴판**********
// 1.황금올리브반반한치킨
// 2.뿌잉클치킨
// 3.처갓집에서호식이가만든치킨
// 0. 종료
// ********** 번호: 0
// 총5 개의상품이주문되었습니다.

public class Main_Q05 {

	public static void main(String[] args) {
		int count = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {

			printMenu();
			System.out.print("********** 번호 : ");
			int input = sc.nextInt();
			System.out.println();

			if (input == 0) break;
			else if (input < 0 || input > 3) {
				System.out.println("(0~3) 사이의 번호를 입력해주세요.");
				continue;
			}

			String menu;
			switch (input) {
				case 1 :
					menu = "황금올리브 반반한 치킨";
					break;
				case 2 :
					menu = "뿌잉클 치킨";
					break;
				case 3 :
					menu = "처갓집에서 호식이가 만든 치킨";
					break;
				default :
					menu = "";
			}
			System.out.println("'" + menu + "'이(/가) 주문되었습니다.");
			System.out.println();

			count++;
		}

		System.out.println("총 " + count + "개의 상품이 주문되었습니다.");
		sc.close();
	}

	public static void printMenu() {
		System.out.println("********** 치킨메뉴판**********");
		System.out.println("1.황금올리브 반반한 치킨");
		System.out.println("2.뿌잉클 치킨");
		System.out.println("3.처갓집에서 호식이가 만든 치킨");
		System.out.println("0.종료");
	}
}
