package Day05.Ex02_생성자;

/**
 * 학생
 * - 변수 : 이름, 나이, 학번, 전공
 * -메소드 : 공부하기, 성적 평균 구하기
 */
public class Student {
	public void study(String subject) {
		
		System.out.println(subject + "(을/를) 공부합니다.");
	}

//	변수
	String name;
	int age;
	String stdNo;
	String major;
	
//	생성자
//	TODO : 기본 생성자
//	TODO : 매개변수가 있는 생성자
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}
	
	public Student(String name) {
		this.name = name;
	}

	public Student() {
		this("이름없음", 0);
	
//	메소드
//	* 접근지정자 반환타입 메소드명(매개변수) {  }
//	- 공부하기
//	*void : 반환타입 없음 (return 생략가능)
//	- void 로 지정해도 return을 메소드를 종료시키는 용도로 사용할 수 있다.
	
//	- 성적 평균 구하기
//	double getAverage(int score1, int score2) {
//		// TODO : 평균을 구하여 반환해보세요.
//		
//		return 0.0;
//
//	}

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public double getAverage(int score1, int score2) {
		// TODO Auto-generated method stub
		return 0.0;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	
	public void setAge(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setMajor(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setStdNo(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAge() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMajor() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStdNo() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAverage(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAverage(int[] scores3) {
		// TODO Auto-generated method stub
		return null;
	}

	
}







