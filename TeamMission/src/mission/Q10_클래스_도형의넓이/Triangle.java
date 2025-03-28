package mission.Q10_클래스_도형의넓이;

public class Triangle {

	private double width;
	private double height;

	// 생성자
	public Triangle() {
	}

	public Triangle(double width, double height) {
		this.width  = width;
		this.height = height;
	}

	// 넓이 구하는 공식
	public String getArea() {
		double result = (this.width * this.height) / 2.0;
		return String.valueOf(result);
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
}
