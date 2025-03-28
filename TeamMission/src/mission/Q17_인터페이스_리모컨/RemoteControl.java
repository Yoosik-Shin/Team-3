package mission.Q17_인터페이스_리모컨;

//- 최저속력과최고속력상수를선언하시오.- 아래의기능이구현될추상메소드를정의하시오.
//* 전원 ON	: on( )
//* 전원 OFF 	: off( )
//* 속도설정	: setSpeed( int speed )
//* 배터리교체	: changeBattery( )
public interface RemoteControl {
	final int MAX_SPEED = 200;
	final int MIN_SPEED = 0;
	public void on();
	public void off();
	void setSpeed(int speed);
	void changeBattery();
}
