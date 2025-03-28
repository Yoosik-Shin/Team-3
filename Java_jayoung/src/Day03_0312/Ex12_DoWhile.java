package Day03_0312;

import java.util.Scanner;

public class Ex12_DoWhile {

	public static void main(String[] args) {

		System.out.println(":::::::::::: 메뉴판 ::::::::::::");
		System.out.println("1. 가츠동 - 긴자료코");
		System.out.println("2. 마라탕 - 춰밍당");
		System.out.println("3. 징거버거 - KFC");
		System.out.println("4. 돈까스덮밥 - 김밥스토리");
		System.out.println("5. 닭가슴살볶음밥 - 도시락");
		System.out.println("0. 종료");
		System.out.println();

		// 메뉴판
		// * 변수 선언 : 메뉴번호, 메뉴이름
		int    menuNo   = 0;	// 메뉴번호
		String menuName = "";	// 메뉴이름
		int    menuSum  = 0;	// 주문한 메뉴 개수

		Scanner sc = new Scanner(System.in);

		// do ~ while문
		// 무조건 1회 실행 후, 조건을 검사하여 반복하는 문장
		do {

			System.out.print("메뉴 번호 : ");
			menuNo = sc.nextInt();

			// break : 제어문을 탈출하는 키워드
			// * 가장 가까운 제어문만 탈출한다.
			if (menuNo == 0) break;

			switch (menuNo) {
				case 1 :	menuName = "가츠동";			break;
				case 2 :	menuName = "마라탕";			break;
				case 3 :	menuName = "징거버거";			break;
				case 4 :	menuName = "돈까스덮밥";		break;
				case 5 :	menuName = "닭가슴살볶음밥";		break;
				default :								break;
			}

			// 유효성 검사
			// - 메뉴 번호가 0 ~ 5번만 유효
			if (menuNo >= 0 && menuNo <= 5) {
				System.out.println(menuName + "(을/를) 주문하였습니다.");
				menuSum++;
			} else {
				System.out.println("(0 ~ 5)번 사이의 번호를 입력해주세요.");
			}

			System.out.println();

		} while (menuNo != 0);

		sc.close();

		System.out.println(menuSum + "개의 메뉴를 주문하였습니다.");
		System.out.println("메뉴판을 종료합니다.");
	}
}
