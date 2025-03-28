package Day07.Ex03_ClassCasting;

public class Person {
	String name;
	int age;
	
	public Person() {
		this("이름없음", 1);
	}
	
//	생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String work() {
		return "일을 합니다.";
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public Student getObject() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setObject(Student student) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}	
	







	
	

