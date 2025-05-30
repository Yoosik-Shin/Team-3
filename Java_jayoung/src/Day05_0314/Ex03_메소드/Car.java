package Day05_0314.Ex03_메소드;

public class Car {

	// 모델명, 속도
	String      model;
	private int speed;

	// 생성자
	// * alt + shift + S : O
	// - 기본생성자
	public Car() {
		this("모델명 없음", 0);
	}

	// - model 매개 변수 생성자
	public Car(String model) {
		this.model = model;
	}

	// - 전체 매개 변수 생성자
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	// getter & setter
	// - getter : 변수의 값을 가져오는 메소드
	// - setter : 변수의 값을 지정하는 메소드
	// getter & setter 이름 : getXXX(), setXXX()
	// * alt + shift + S : R
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			speed = 0;
			System.err.println("속도는 음수가 될 수 없습니다.");
		}
		if (speed >= 300) {
			speed = 300;
			System.err.println("최대 속도는 300km/h 입니다.");
		}
		this.speed = speed;
	}
}
