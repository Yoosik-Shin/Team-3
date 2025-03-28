package Day07.Ex03_ClassCasting;

public class DownCasting {
	public static void main(String[] args) {
		
		
		Person person = new Student("김조은", 20, 1, "컴퓨터공학과");
				System.out.println( person );
				System.out.println( person.work());
				
				Student student = (Student) person;
				System.out.println( student );
				System.out.println( student.work());
				System.out.println("grade : " + student.grade);
				System.out.println("major : " + student.major);
	}

}
