package Day03;

import java.util.Scanner;

public class Ex04_Nested {

	public static void main(String[] args) {
		// 정보처리기사 합격 기준
		// * 응시자격 : 대학교 4학년
		// * 점수 : 60점 이상
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년 : ");
		int year = sc.nextInt();
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		// 합격!
		// 불합격!
		// 응시자격이 없습니다.
		
		//내가 한것 문제점?? 고칠점?
		//4학년 입력했을때부터 4학년이 아니면 걍 거르고싶음
		//고민해볼것!
		if(year == 4 && score >= 60) System.out.println("합격!");
		else if(year != 4) System.out.println("응시자격이 없습니다.");
		else if(year == 4 && score < 60) System.out.println("불합격!");
		
		
		// ** 중첩 if문 권장하지 않습니다. 밑은 중첩if문 예제
		if(year == 4) {
			if (score >= 60) {
				System.out.println("합격!");
		} else {
			System.out.println("불합격");
		} 
	} else {
			System.out.println("응시자격이 없습니다.");
		}
		
		// 조건문 중첩하지 않고 조건을 작성 할 수 있다.
		// 방법
		if (year == 4 && score >= 60) {
			System.out.println("합격");
		} else if(year == 4) {
			System.out.println("불합격");
		} else {
			System.out.println("응시자격이 없습니다.");
		}
		
		// 방법2
		if (year != 4) {
			System.out.print("응시자격이 없습니다.");
		} else if(score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		// 응시 자격이 있는 경우에만 점수 입력받기
		int 학년 = sc.nextInt();
		
		if(학년 != 4) {
			System.out.println("응시자격이 없습니다.");
		} else {
			int 점수 = sc.nextInt();
			if (점수 >= 60) {
				System.out.println("합격!");
			} else {
				System.out.println("불합격!");
			}
		}
		
		sc.close();
	}

}
