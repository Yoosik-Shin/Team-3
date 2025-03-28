package Day03_0312;

import java.util.Scanner;

public class Ex12_DoWhile2 {

	public static void main(String[] args) {

		Ex12_Menu[] menu = createMenu();
		printMenu(menu);

		// 메뉴판
		// * 변수 선언 : 메뉴번호, 메뉴이름
		int    menuNo   = 0;	// 메뉴번호
		String menuName = "";	// 메뉴이름
		int    menuSum  = 0;	// 주문한 메뉴 개수
		int    priceSum = 0;	// 주문한 메뉴의 합

		Scanner sc = new Scanner(System.in);

		// do ~ while문
		// 무조건 1회 실행 후, 조건을 검사하여 반복하는 문장
		do {

			System.out.print("메뉴 번호 : ");

			menuNo = sc.nextInt();

			// break : 제어문을 탈출하는 키워드
			// * 가장 가까운 제어문만 탈출한다.
			if (menuNo == 0) break;

			// 유효성 검사
			// - 메뉴 번호가 0 ~ 5번만 유효
			if (!(menuNo >= 0 && menuNo <= 5)) {
				System.out.println("(0 ~ 5)번 사이의 번호를 입력해주세요.");
				continue;
			}

			menuName = menu[menuNo - 1].getMenuName();
			System.out.println(menuName + "(을/를) 주문하였습니다.");
			priceSum += menu[menuNo - 1].getPrice();
			menuSum++;

			System.out.println();

		} while (menuNo != 0);

		sc.close();

		System.out.println(menuSum + "개의 메뉴를 주문하였습니다.");
		System.out.println("총 합계는 " + priceSum + "원 입니다.");
		System.out.println("메뉴판을 종료합니다.");

	}

	private static Ex12_Menu[] createMenu() {
		Ex12_Menu[] menu = new Ex12_Menu[5];

		menu[0] = new Ex12_Menu(1, "가츠동", "긴자료코", 8500);
		menu[1] = new Ex12_Menu(2, "마라탕", "춰밍당", 7000);
		menu[2] = new Ex12_Menu(3, "징거버거", "KFC", 5500);
		menu[3] = new Ex12_Menu(4, "돈까스덮밥", "김밥스토리", 8000);
		menu[4] = new Ex12_Menu(5, "닭가슴살볶음밥", "도시락", 10000);

		return menu;
	}

	private static void printMenu(Ex12_Menu[] menuAll) {
		System.out.println(":::::::::::: 메뉴판 ::::::::::::");
		for (Ex12_Menu menu : menuAll) {
			System.out.println(menu.muneNo + ". " + menu.menuName + " - " + menu.shopName);
		}
		System.out.println();
	}
}
