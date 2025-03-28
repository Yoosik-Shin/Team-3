package Day05.Ex03_메소드;

public class Car {
    // 모델명, 속도
    private String model;
    private int speed;

    // 기본 생성자
    public Car() {
        this("모델명없음", 0);
    }

    // model 매개변수 생성자
    public Car(String model) {
        this(model, 0);
    }

    // 전체 매개변수 생성자
    public Car(String model, int speed) {
        this.model = model;
        setSpeed(speed); // 속도 초기화 시 유효성 검사 적용
    }

    // Getter & Setter
    // Getter: 변수의 값을 가져오는 메소드
    // Setter: 변수의 값을 지정하는 메소드
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
            System.err.println("속도는 음수가 될 수 없습니다. 속도가 0으로 설정됩니다.");
        }
        if (speed > 300) {
            speed = 300;
            System.err.println("속도는 300km/h를 초과할 수 없습니다. 최대 속도로 설정됩니다.");
        }
        this.speed = speed;
    }
}
