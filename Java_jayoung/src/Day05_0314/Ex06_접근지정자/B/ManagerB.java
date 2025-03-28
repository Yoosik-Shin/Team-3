package Day05_0314.Ex06_접근지정자.B;

import Day05_0314.Ex06_접근지정자.A.Person;

public class ManagerB {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println("name	: " + person.name);				// public		모든 곳에서 접근 가능
		System.out.println("age	: " + person.getAge());             // protected	같은 패키지 || 상속에서 접근 가능
		System.out.println("height	: " + person.getHeight());      // default		같은 패키지에서 접근 가능
		System.out.println("weight	: " + person.getWeight());      // private		해당 클래스에서 접근 가능
		System.out.println();

		Student student = new Student();
		student.defaultSetting();
		System.out.println("name	: " + student.name);			// public		모든 곳에서 접근 가능
		// * 접근 지정자는 선언한 클래스를 기준으로 적용된다.
		// Manager와 Student는 같은 패키지 안에 존재하지만,
		// age가 선언된 클래스는 Person 다른 패키지 안에 존재한다.
		// System.out.println("age : " + student.age);
		System.out.println("age	: " + student.getAge());            // protected	같은 패키지 || 상속에서 접근 가능
		System.out.println("height	: " + student.getHeight());     // default		같은 패키지에서 접근 가능
		System.out.println("weight	: " + student.getWeight());     // private		해당 클래스에서 접근 가능
		System.out.println();
	}
}
