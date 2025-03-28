package Day05_0314.Ex03_메소드;

public class CarTest {

	public static void main(String[] args) {
		// 객체 생성
		Car car1 = new Car();
		car1.model = "제네시스";
		// car1.speed = 130;
		// private으로 지정한 변수는 외부에서 접근 불가
		car1.setSpeed(200);

		System.out.println("model : " + car1.model);
		// System.out.println("speed : " + car1.speed);
		System.out.println("speed : " + car1.getSpeed());

		car1.setSpeed(-50);
		System.out.println("speed : " + car1.getSpeed());
		car1.setSpeed(400);
		System.out.println("speed : " + car1.getSpeed());
		car1.setSpeed(130);
		System.out.println("speed : " + car1.getSpeed());
	}
}
