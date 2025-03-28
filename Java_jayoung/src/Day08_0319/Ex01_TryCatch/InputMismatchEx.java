package Day08_0319.Ex01_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchEx {

	public static void main(String[] args) {
		System.out.println("1. Java");
		System.out.println("2. HTML CSS JS");
		System.out.println("3. MySql DB");
		System.out.println("4. Servlet/JSP");
		System.out.println("5. Spring Framework");
		System.out.println("6. React");
		System.out.println("7. Python");
		System.out.println("8. dJang");
		System.out.println("9. Node.js");
		System.out.println("10. Express");
		System.out.println("11. Flutter");
		System.out.println("0. 종료");

		Scanner sc = new Scanner(System.in);

		int    menuNo   = 0;
		String menuName = "";

		do {
			System.out.print("입력 : ");

			// 예외 메세지	: java.util.InputMismatchException
			// 예외 상황	: 숫자 입력 메소드에 문자를 입력 한 경우
			try {
				menuNo = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next(); // 입력 스트림 비우기
				System.err.println(e.getMessage());
				System.err.println("(0 ~ 11) 사이의 숫자를 입력해 주세요.");
				continue;
			}

			// 종료 조건
			if (menuNo == 0) {
				System.out.print("종료");
				break;
			}

			switch (menuNo) {
				case 1:	menuName = "Java";				break;
				case 2:	menuName = "HTML CSS JS";		break;
				case 3:	menuName = "MySql DB";			break;
				case 4:	menuName = "Servlet/JSP";		break;
				case 5:	menuName = "Spring Framework";	break;
				case 6:	menuName = "React";				break;
				case 7:	menuName = "Python";			break;
				case 8:	menuName = "dJang";				break;
				case 9:	menuName = "Node.js";			break;
				case 10:menuName = "Express";			break;
				case 11:menuName = "Flutter";			break;
			}
			System.out.println(menuName + "(을/를) 공부를 합니다.");

		} while (true);
		sc.close();
	}
}
