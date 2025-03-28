package 복습Day01;

public class Main2 {

	public static void main(String[] args) {
		Person2 person = new Student2();  // 업 캐스팅
//		System.out.println(person.major);
		
		person.work();
		
		System.out.println(person.age);
		Student2 student = (Student2) person; // 다운 캐스팅
		
		// 에러 : Student student2 = new Person();
		// * 엉캐스팅을 전제하지 않으면 에러가 발생한다.
		
		System.out.println(student.age);
		student.work();
	}
}
