package mission.Q17_인터페이스_리모컨;

//- RemoteControl 인터페이스를 구현하시오.
//- 멤버변수 "배터리, 속력"을 선언하시오.
public class Drone implements RemoteControl {
	public static final int MAX_SPEED = 200;
	public static final int MIN_SPEED = 0;	
	double battery;		// 배터리
	double speed;		// 속력

	@Override
	public void on() {
		System.out.println("드론의 전원을 켭니다.");
		setSpeed(10);
	}

	@Override
	public void off() {
		System.out.println("드론의 전원을 끕니다.");
		setSpeed(0);
	}

	@Override
	public void setSpeed(int speed) {
		System.out.println("지정 속도 : " + speed);
		if (speed > MAX_SPEED) {
			System.err.println("최고 속도를 초과해 속도를 조절 할 수 없습니다.");
			return;
		} else if (MIN_SPEED > speed) {
			System.err.println("최저 속도 이하로 속도를 조절 할 수 없습니다.");
			return;
		}
		System.out.println("드론의 속도를 조절합니다.");
		System.out.println("현재 속도 : " + speed);
	}

	@Override
	public void changeBattery() {
		System.out.println("드론의 배터리를 교환합니다.");
	}
}
