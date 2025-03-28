package Day05_0314.Ex02_생성자;

// 학생
// - 변수 : 이름, 나이, 학번, 전공
// - 메소드 : 공부하기, 성적 평균 구하기
public class Student {

	// 변수
	String name;	// 이름
	int    age;		// 나이
	String stdNo;	// 학번
	String magor;	// 전공

	// 생성자
	// 기본 생성자 alt + shift + S -> 0
	public Student() {
		// this.name = "이름없음";
		// this.age = 0;
		// this.stdNo = "00000000";
		// this.magor = "전공없음";
		// this("이름없음", 0, "00000000", "전공없음");
		this("이름없음", 0);

	}

	public Student(String name, int age) {
		// this.name = name;
		// this.age = age;
		// this.magor = "전공없음";
		// this.stdNo = "00000000";
		this(name, age, "00000000", "전공없음");
	}

	// 매개 변수가 있는 생성자
	public Student(String name, int age, String stdNo, String magor) {
		this.name  = name;
		this.age   = age;
		this.stdNo = stdNo;
		this.magor = magor;
	}

	// 메소드
	// * 접근지정자 반환타입 메소드명(매개변수) {}
	// - 공부하기
	// * void : 반환타입 없음 (return 생략가능)
	// - void로 지정해도 return을 메소드를 종료 시키는 용도로 사용 할 수 있다.
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
	}

	// - 성적 평균 구하기
	public double getAverage(int score1, int score2) {
		// 평균을 구하여 반환하시오.
		double avg = (score1 + score2) / 2.0;
		return avg;
	}

	public double getAverage(int score1, int score2, int score3) {
		double avg = (score1 + score2 + score3) / 3.0;
		return avg;
	}

	public double getAverage(int[] score) {
		int sum = 0;
		for (int i : score) {
			sum += i;
		}
		return (double) sum / score.length;
	}

	public void printInfo(String stuNum) {
		System.out.println("::::::::::::::: " + stuNum + " :::::::::::::::");
		System.out.println(stuNum + " - 이름 : " + this.name);
		System.out.println(stuNum + " - 나이 : " + this.age);
		System.out.println(stuNum + " - 전공 : " + this.magor);
		System.out.println(stuNum + " - 학번 : " + this.stdNo);
		System.out.println();
	}
}
