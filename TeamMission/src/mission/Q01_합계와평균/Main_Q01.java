package mission.Q01_합계와평균;

import java.util.Scanner;

// 학생의 영어, 수학, 자바 성적을 각각 정수형 변수 eng, math, java 로 선언하고,
// 순서대로 점수를 입력받아 성적의 총합계와 평균을 계산하여 출력하는 프로그램을 작성하시오.

// 입력
// 80 90 100

// 출력
// 영어점수: 80
// 수학점수: 90
// 자바점수: 100
// 총점: 270
// 평균: 90.0
public interface Main_Q01 {
	public static void main(String[] args) {
		// 정수형 변수 eng, math, java 로 선언
		int eng, math, java;

		// 순서대로 점수를 입력받아
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		System.out.print("자바 : ");
		java = sc.nextInt();

		sc.close();

		// 성적 출력
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		System.out.println("자바점수: " + java);

		// 성적의 총합계와 평균을 계산하여 출력
		int sum = eng + math + java;
		System.out.println("총점: " + sum);
		System.out.println("평균: " + (sum / 3.0));
	}
}
