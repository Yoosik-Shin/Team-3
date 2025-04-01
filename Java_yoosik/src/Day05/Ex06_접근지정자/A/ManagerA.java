package Day05.Ex06_접근지정자.A;

import Day05.Ex06_접근지정자.B.Student;

public class ManagerA {
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println("name	: " + person.name);
		// protected 같은 패키지 || 상속에서 접근 가능
		// Manager와 Person 는 상속 X, Person, ManagerA 같은 패키지 O
		System.out.println("age	: " + person.age);
		// default 같은 패키지에서 접근 가능
		System.out.println("height	: " + person.height);
		System.out.println("weight	: " + person.getWeight());
		System.out.println();

		Student student = new Student();
		student.defaultSetting();
		System.out.println("name	: " + student.name); 
		// Manager와 Student 는 상속 X, Person, ManagerA 같은 패키지 O
		System.out.println("age	: " + student.age);
		// default 같은 패키지에서 접근 가능
		// Person, ManagerA 같은 패키지 O
		// student가 가지는 height변수는 Person에서 default 패키지에서 선언
		// System.out.println("height	: " + person.height);
		System.out.println("height	: " + student.getHeight());
		System.out.println("weight	: " + student.getWeight()); 
		System.out.println();
	}
}
