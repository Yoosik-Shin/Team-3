package Day05.Ex02_생성자;

// 학생
// - 변수		: 이름, 나이, 학번, 전공
// - 메소드	: 공부하기, 성적 평균 구하기
public class Student {

	// 변수
	String name;
	int age;
	String stdNo;
	String major;
	
	
	// 생성자
	// * 단축키 alt + shift + s -> o
	// TODO: 기본생성자
	public Student() {
		this("이름없음", 0, "00000000", "전공없음");
//		name = "이름없음";
//		age = 0;
//		stdNo = "00000000";
//		major = "전공없음";
	}
	
	
		//this - name이라는 이름이 같은 객체의 변수와 매개변수를 구분하기위해 객체의변수를 표시하는 방법
	public Student(String name) {
		name = name;
	}



	public Student(String name, int age) {
		this(name, age, "00000000", "전공없음");
//		this.name = name;
//		this.age = age;
//		stdNo = "00000000";
//		major = "전공없음";
	}


	// TODO: 매개변수가 있는 생성자
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}
	
	
	// 메소드
	// * 접근지정자 반환타입 메소드명 (매개변수) { }
	// - 공부하기
	// * void : 반환타입 없음 (return 생략가능)
	// - void로 지정해도 return을 메소드를 종료시키는 용도로 사용할 수 있다.
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
	}
	

	// - 성적 평균 구하기
	public double getAverage(int score1, int score2) {
		// TODO: 평균을 구하여 반환해 보세요.
		double avg = 0.0;
		avg = (double) (score1 + score2) / 2; // 큰 자료형과 작은자료형이 연산이 되어야 큰 자료형으로 결과가나옴
		return avg;
	}
	
	public double getAverage(int score1, int score2, int score3) {
		double avg = 0.0;
		avg = (double) (score1 + score2 + score3) / 3; // 큰 자료형과 작은자료형이 연산이 되어야 큰 자료형으로 결과가나옴
		return avg;
	}
	
	
	public double getAverage(int[] scores) {
		double avg = 0.0;
		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum+=scores[i];
//		}

		for (int score : scores) {
			sum += score;
		}
		avg = (double) sum / scores.length;
		return avg;
	}
}
