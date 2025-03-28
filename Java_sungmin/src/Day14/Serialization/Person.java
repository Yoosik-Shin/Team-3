package Day14.Serialization;

import java.io.Serializable;

// 직렬화
// Seriallization 인터페이스 구현
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
