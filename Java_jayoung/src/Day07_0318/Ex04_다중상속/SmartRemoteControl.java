package Day07_0318.Ex04_다중상속;

// 인터페이스 다중 상속
// public interface 인터페이스명 extends 인터페이스A, 인터페이스A ... { }
public interface SmartRemoteControl extends Microphone, RemoteControl {

	// 터치패드 기능
	// - x, y 좌표 위치에 터치패드 클릭
	void touch(int x, int y);

}
