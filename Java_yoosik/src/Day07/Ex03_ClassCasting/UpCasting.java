package Day07.Ex03_ClassCasting;

public class UpCasting {

	public static void main(String[] args) {
		// * 업캐스팅 (자동 타입 변환)
		// (부모 클래스) = (자식 클래스)
		// : 자식 객체를 부모 클래스타입으로 변환하는 것
		Person person = new Student("김조은", 20, 1, "게임미디어학과");
		
		// Person		: name, age
		// Student		: name, age, grade, major
		System.out.println("name : " + person.name);
		System.out.println("age : " + person.age);

		// Person 객체에서는 자식 클래스의 변수인 grade, major에는 접근 할 수 없다.
//에러		System.out.println("grade : " + person.grade);
//에러		System.out.println("major : " + person.major);
		
		// 클래스를 업캐스팅 하면
		// 변수는 부모 클래스의 변수만 접근 가능하고
		// 메소드는 자식 클래스의 메소드가 우선하여 실행된다.
		System.out.println(person);
		System.out.println(person.work());
		
		// 이유 : 변수는 정적 바인딩, 메소드는 동적 바인딩
		// *바인딩 (Binding)
		// : 프로그램에서 사용되는 요소에 실제 값을 결정짓는 행위
		
		// - 정적 바인딩 : 컴파일 시간에 결정  --> 변수
		// - 동적 바인딩 : 실행 시간에 결정  --> 메소드
	}
	
}
