package mission.Q10_클래스_도형의넓이;

public class Circle {

	// PI = 3.14;
	private final double PI = 3.141592;
	private double       radius;

	// 생성자
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	// 넓이 구하는 공식
	public String getArea() {
		double result = PI * radius * radius;
		return String.valueOf(result);
	}

	@Override
	public String toString() {
		return "Circle [PI=" + PI + ", radius=" + radius + "]";
	}
}
