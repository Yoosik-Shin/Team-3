package mission.Q17_인터페이스_리모컨;

// - 최저 속력과 최고 속력 상수를 선언하시오.
// - 아래의 기능이 구현될 추상 메소드를 정의하시오.
// 전원 ON	: on( )
// 전원 OFF	: off( )
// 속도설정	: setSpeed( int speed )
// 배터리교체	: changeBattery( )
public interface RemoteControl {
	public void on();
	public void off();
	public void setSpeed(int speed);
	public void changeBattery();
}
