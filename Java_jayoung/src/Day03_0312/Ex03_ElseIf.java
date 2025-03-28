package Day03_0312;

import java.util.Scanner;

public class Ex03_ElseIf {

	public static void main(String[] args) {

		// 성적을 입력 받아서, 성적에 따른 학점 A~F를 출력하시오.
		Scanner sc = new Scanner(System.in);

		System.out.print("성적 : ");
		int score = sc.nextInt();

		sc.close();

		char grade = 'F';

		// if 
		// 90점 이상, A
		// 80점 이상, B
		// 70점 이상, C
		// 60점 이상, D
		// 60점 미만, F

		if (score >= 90 && score <= 100)	grade = 'A';
		if (score >= 80 && score < 90)		grade = 'B';
		if (score >= 70 && score < 80)		grade = 'C';
		if (score >= 60 && score < 70)		grade = 'D';
		if (score >= 0 && score < 60)		grade = 'F';
		System.out.println(grade + " 학점입니다.");
		System.out.println();

		grade = 'F';
		if (score >= 90 && score <= 100 )	grade = 'A';
		else if (score >= 80)				grade = 'B';
		else if (score >= 70)				grade = 'C';
		else if (score >= 60)				grade = 'D';
		else								grade = 'F';
		System.out.println(grade + " 학점입니다.");
		System.out.println();

		grade = 'F';
		if (score > 100)					grade = ' ';
		else if (score >= 90)				grade = 'A';
		else if (score >= 80)				grade = 'B';
		else if (score >= 70)				grade = 'C';
		else if (score >= 60)				grade = 'D';
		else if (score >= 0)				grade = 'F';
		else								grade = ' ';
		System.out.println(grade + " 학점입니다.");
		System.out.println();

	}
}
