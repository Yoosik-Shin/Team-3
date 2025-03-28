package Day03;

import java.util.Scanner;

public class Ex06_Grade {

	public static void main(String[] args) {
		// 학점을 입력받아, 점수 구간을 출력하시오.
		// A : 90~100점입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("학점 : ");
		
		// String(문자열) 참조 자료형
		String grade = sc.next();
		
		// * 문자, 정수, 문자열은 switch 문의 조건값으로 가능하다.
		// * 실수(float, double)는 조건값으로 불가능하다.
		switch (grade) {
		case "A": System.out.println("90~100점 입니다."); break;
		case "B": System.out.println("80~90점 입니다."); break;
		case "C": System.out.println("70~80점 입니다."); break;
		case "D": System.out.println("60~70점 입니다."); break;
		case "F": System.out.println("60점 미만 입니다."); break;
		default:  System.out.println("A~F사이의 문자를 입력해주세요.");	break;
		}
		
		sc.close();
	}

}
