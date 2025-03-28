package Day07_0318.Ex05_ClassCating;

public class DownCating {
	public static void main(String[] args) {
		// * 다운 캐스팅 ( 강제 형 변환 )
		// * 전제 조건		: 업캐스팅
		// - 다운 캐스팅은 업캐스팅된 부모 객체를 자식 객체로 변환하는 것
		// - 업 캐스팅		: (부모 클래스) <- (자식 클래스)
		// - 다운 캐스팅	: (자식 클래스) <- (부모 클래스)

		// 업 캐스팅
		Person person = new Student("김조은", 20, 1, "문예창작과");
		System.out.println(person);
		System.out.println(person.work());
		System.out.println();

		// 다운 캐스팅
		Student student = (Student) person;
		System.out.println(student);
		System.out.println(student.work());
		System.out.println("name\t: " + student.name);
		System.out.println("age\t: " + student.age);
		System.out.println("grade\t: " + student.grade);
		System.out.println("major\t: " + student.major);
	}
}
