package mission.Q10_클래스_도형의넓이;

public class Rectangle {

	private double width;
	private double height;

	// 생성자
	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width  = width;
		this.height = height;
	}

	// 넓이 구하는 공식
	public String getArea() {
		double result = this.width * this.height;
		return String.valueOf(result);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
}
