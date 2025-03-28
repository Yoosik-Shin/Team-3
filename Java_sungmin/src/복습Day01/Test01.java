package 복습Day01;

class Person {
String name;
int age = 10;

void work() {
	System.out.println("일을 합니다.");
	}
}

class Student extends Person {
	String major;
	int age = 20;
	
	void work() {
		System.out.println("공부를 합니다.");
	}
}
public class Test01 {
		
	public static void main(String[] args) {
		
Person person = new Student();
Student student = (Student) person;
System.out.println( person.age );
person.work();

	}
}

