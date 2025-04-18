package Day07_0318.Ex05_ClassCating;

public class Student extends Person {

	int    grade;
	String major;

	// 생성자
	public Student() {
		this("이름없음", 1, 1, "없음");
	}

	public Student(String name, int age, int grade, String major) {
		super(name, age);
		this.grade = grade;
		this.major = major;
	}

	// 메소드
	@Override
	public String work() {
		return "공부를 합니다.";
	}

	// getter, setter
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	// toString
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", major=" + major + "]";
	}
}
