package Day14.Serialization;

import java.io.Serializable;

// 직렬화
// * Serializable 인터페이스를 구현해야 직렬화 객체를 정의할 수 있다.
public class Person implements Serializable {

	
	private String name;
	private int age;
	
	public Person() {
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	
	
	
}
