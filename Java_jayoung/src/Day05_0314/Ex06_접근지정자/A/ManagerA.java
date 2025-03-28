package Day05_0314.Ex06_접근지정자.A;

import Day05_0314.Ex06_접근지정자.B.Student;

public class ManagerA {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println("name	: " + person.name);			// public		모든 곳에서 접근 가능
		System.out.println("age	: " + person.age);				// protected	같은 패키지 || 상속에서 접근 가능
		System.out.println("height	: " + person.height);		// default		같은 패키지에서 접근 가능
		System.out.println("weight	: " + person.getWeight());	// private		해당 클래스에서 접근 가능
		System.out.println();

		Student student = new Student();
		student.defaultSetting();
		System.out.println("name	: " + student.name);		// public		모든 곳에서 접근 가능
		System.out.println("age	: " + student.age);				// protected	같은 패키지 || 상속에서 접근 가능
		System.out.println("height	: " + student.getHeight());	// default		같은 패키지에서 접근 가능
		System.out.println("weight	: " + student.getWeight());	// private		해당 클래스에서 접근 가능
		System.out.println();
	}
}
