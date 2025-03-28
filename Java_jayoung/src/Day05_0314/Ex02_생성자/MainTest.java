package Day05_0314.Ex02_생성자;

public class MainTest {

	public static void main(String[] args) {

		// Student 객체 생성
		Student student = new Student();
		student.name  = "김조은";
		student.age   = 22;
		student.magor = "컴퓨터공학과";
		student.stdNo = "20250001";

		student.printInfo("학생1");

		student.study("임베디드 시스템");
		System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(100, 95));
		System.out.println();

		// Student 객체 생성 - 기본 생성자
		Student student2 = new Student();
		student2.printInfo("학생2");

		// Student 객체 생성 - 매개변수가 있는 생성자
		Student student3 = new Student("김햇님", 28, "체육교육과", "20190001");
		student3.printInfo("학생3");

		// Student 객체 생성 - 매개변수가 있는 생성자
		Student student4 = new Student("김별님", 25);
		student4.printInfo("학생4");

		int scores4[] = {100, 80, 70, 65, 95};
		System.out.println("학생4 - 중간고사 점수 : " + student.getAverage(100, 90, 70));
		System.out.println("학생4 - 중간고사 점수 : " + student.getAverage(scores4));
	}
}
