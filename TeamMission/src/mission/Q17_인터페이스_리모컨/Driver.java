package mission.Q17_인터페이스_리모컨;

// - RemoteControl 인터페이스를 선언하시오.
// - RcCar 객체, Drone 객체를 생성하여, RemoteControl 인터페이스 변수에 대입하시오.
// - RcCar 객체와Drone 객체를 사용하는 프로그램을 자유롭게 완성하시오.
public class Driver {
	public static void main(String[] args) {
		RemoteControl drone = new Drone();
		RemoteControl rcCar = new RcCar();

		drone.on();
		System.out.println();
		rcCar.on();
		System.out.println();

		drone.setSpeed(Drone.MAX_SPEED + 1);
		drone.setSpeed(Drone.MIN_SPEED - 1);
		drone.setSpeed(50);
		System.out.println();

		rcCar.setSpeed(RcCar.MAX_SPEED + 1);
		rcCar.setSpeed(RcCar.MIN_SPEED - 1);
		rcCar.setSpeed(50);
		System.out.println();

		drone.changeBattery();
		rcCar.changeBattery();
		System.out.println();

		drone.off();
		rcCar.off();
	}
}
