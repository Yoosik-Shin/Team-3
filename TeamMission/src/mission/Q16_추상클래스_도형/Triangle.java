package mission.Q16_추상클래스_도형;

public class Triangle extends Shape {

	double width;	// 가로
	double height;	// 높이

	// 생성자
//	public Triangle() {
//	}

	public Triangle(double width, double height) {
		this.width  = width;
		this.height = height;
	}

	@Override
	double area() {
		return (this.width * this.height) / 2;
	}

	@Override
	double round() {
		return 3 * this.width;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

}
