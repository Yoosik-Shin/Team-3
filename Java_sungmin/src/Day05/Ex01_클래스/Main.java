package Day05.Ex01_클래스;

public class Main {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.name = "김조은";
		person.age = 20;
		
		System.out.println("이름 :" + person.name);
		System.out.println("나이 :" + person.age);
		person.eat("보끔당");
		person.work("코딩", 12);
		
		
	}

}
