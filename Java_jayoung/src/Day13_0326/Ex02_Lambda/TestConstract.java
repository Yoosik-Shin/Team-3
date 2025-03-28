package Day13_0326.Ex02_Lambda;

import java.util.function.Function;

public class TestConstract {
	public static void main(String[] args) {
		// Parson의 매개변수 2개 생성자 호출

		// 기본 람다식
		Function<String, Person> lambda1 = (name) -> { return new Person("aloha"); };

		Function<String, Person> lambda2 = (name) -> new Person(name);

		Person p1 = lambda1.apply("aloha");          // 람다식을 통한 객체 생성
		System.out.println(p1.getName());

		Person p2 = lambda2.apply("aloha");          // 람다식을 통한 객체 생성
		System.out.println(p2.getName());

		// 생성자 참조
		Function<String, Person> constructorRef = Person::new;

		Person p3 = constructorRef.apply("aloha");   // 생성자 참조를 통한 객체 생성
		System.out.println(p3.getName());
	}
}

class Person {
	String name;
	int    age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age  = age;
	}

	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}