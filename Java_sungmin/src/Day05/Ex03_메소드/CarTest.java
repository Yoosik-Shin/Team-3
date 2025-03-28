package Day05.Ex03_메소드;

public class CarTest {
    public static void main(String[] args) {
        
        // 객체 생성
        Car car = new Car();
        car.setModel("제네시스"); // model 필드 값 설정 (setter 사용)
        car.setSpeed(200); // speed 필드 값 설정 (setter 사용)
        
        System.out.println("model: " + car.getModel()); // model 값 출력 (getter 사용)
        System.out.println("speed: " + car.getSpeed()); // speed 값 출력 (getter 사용)
        
        car.setSpeed(-50); // 속도 음수값 테스트
        System.out.println("speed: " + car.getSpeed());
        
        car.setSpeed(400); // 속도 초과값 테스트
        System.out.println("speed: " + car.getSpeed());
        
        car.setSpeed(130); // 정상 속도 설정
        System.out.println("speed: " + car.getSpeed());
    }
}
