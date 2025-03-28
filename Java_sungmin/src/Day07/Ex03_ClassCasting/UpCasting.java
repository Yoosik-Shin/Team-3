package Day07.Ex03_ClassCasting;

public class UpCasting {
	public static void main(String[] args) {
//		* 업케스팅 (자동 타입 변환)
//		(부모 클래스) = (자식 클래스)
//		: 자식 객체를 부모 클래스타입으로 변환하는 것
		
		Person person = new Student("김조은", 20,1, "게임미디어학과");
		
		System.out.println("name : " + person.name);
		System.out.println("age : " + person.age);
//		Person 객체에서는 자식 클래스의 변수인 grade, major 에는 접근할수 없다.
//		System.out.println("grade : " + person.grade);
//		System.out.println("major : " + person.major);
		
		System.out.println( person );
		System.out.println( person.work());
	}

}
