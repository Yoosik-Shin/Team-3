package Day06_0317.Ex02_인터페이스;

// 클래스를 상속하는 키워드 : extends
// 인터페이스를 상속하는 키워드 : implements
public class RcCar implements RemoteControl {

	int speed;

	@Override
	public void turnOn() {
		this.speed = 0;
		System.out.println("RC카 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("RC카 전원을 끕니다.");
	}

	@Override
	public void setSpeed(int speed) {
		if (speed > RemoteControl.MAX_SPEED) {
			// 최대 속력을 초과하지 못하게 지정
			this.speed = RemoteControl.MAX_SPEED;
			System.out.println("최대 속력입니다!");

		} else if (speed < RemoteControl.MIN_SPEED) {
			// 최저 속력 미만이 되지 않도록 지정
			this.speed = RemoteControl.MIN_SPEED;
			System.out.println("최저 속력입니다!");

		} else {
			this.speed = speed;
			System.out.println("RC카 속도를 변경합니다.");
		}

		System.out.println("현재 속도 : " + this.speed);
	}

}
