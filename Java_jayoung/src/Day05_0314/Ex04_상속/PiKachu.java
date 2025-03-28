package Day05_0314.Ex04_상속;

public class PiKachu {

	// 클래스 : 객체를 정의하는 설계도
	// 멤버 : 변수, 메소드
	// 생성자
	// : 객체가 생성 될 때, 실행되는 메소드
	// - 객체의 변수를 초기화 하는 역할
	// - 생성자의 이름은 클래스의 이름과 같아야 한다.
	// [생성자 정의] - 접근지정자 생성자명 (매개변수) { }
	// [메소드 정의] - 접근지정자 반환타입 메소드명 (매개변수) { }

	// 변수
	public int    energy;
	public String type;

	// 생성자
	public PiKachu() {
		// this.energy = 100;
		// this.type = "전기";
		this(100, "전기");
	}

	public PiKachu(int energy) {
		// this.energy = energy;
		this(energy, "전기");
	}

	public PiKachu(int energy, String type) {
		this.energy = energy;
		this.type   = type;
	}

	// 메소드
	public String aAttack() {
		return "십만볼트";

	}

	public String bAttack() {
		return "전광석화";
	}

	/**
	 * toString()
	 * : 변환하는 문자열을 객체의 출력으로 대체해 주는 메소드
	 */
	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + "]";
	}
}
