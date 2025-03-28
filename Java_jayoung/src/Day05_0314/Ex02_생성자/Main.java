package Day05_0314.Ex02_생성자;

public class Main {

	public static void main(String[] args) {

		// Student 객체 생성
		Student student = new Student();
		student.name  = "김조은";
		student.age   = 22;
		student.magor = "컴퓨터공학과";
		student.stdNo = "20250001";

		System.out.println("::::::::::::::: 학생1 :::::::::::::::");
		System.out.println("학생1 - 이름 : " + student.name);
		System.out.println("학생1 - 나이 : " + student.age);
		System.out.println("학생1 - 전공 : " + student.magor);
		System.out.println("학생1 - 학번 : " + student.stdNo);
		System.out.println();

		student.study("임베디드 시스템");
		System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(100, 95));
		System.out.println();

		// Student 객체 생성 - 기본 생성자
		Student student2 = new Student();
		System.out.println("::::::::::::::: 학생2 :::::::::::::::");
		System.out.println("학생2 - 이름 : " + student2.name);
		System.out.println("학생2 - 나이 : " + student2.age);
		System.out.println("학생2 - 전공 : " + student2.magor);
		System.out.println("학생2 - 학번 : " + student2.stdNo);
		System.out.println();

		// Student 객체 생성 - 매개변수가 있는 생성자
		Student student3 = new Student("김햇님", 28, "체육교육과", "20190001");
		System.out.println("::::::::::::::: 학생3 :::::::::::::::");
		System.out.println("학생3 - 이름 : " + student3.name);
		System.out.println("학생3 - 나이 : " + student3.age);
		System.out.println("학생3 - 전공 : " + student3.magor);
		System.out.println("학생3 - 학번 : " + student3.stdNo);
		System.out.println();

		// Student 객체 생성 - 매개변수가 있는 생성자
		Student student4 = new Student("김별님", 25);
		System.out.println("::::::::::::::: 학생4 :::::::::::::::");
		System.out.println("학생4 - 이름 : " + student4.name);
		System.out.println("학생4 - 나이 : " + student4.age);
		System.out.println("학생4 - 전공 : " + student4.magor);
		System.out.println("학생4 - 학번 : " + student4.stdNo);

		int scores4[] = {100, 80, 70, 65, 95};
		System.out.println("학생4 - 중간고사 점수 : " + student4.getAverage(100, 90, 70));
		System.out.println("학생4 - 중간고사 점수 : " + student4.getAverage(scores4));
	}
}
