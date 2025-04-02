package mission.Q16_추상클래스_도형;

public class Rectangle extends Shape {

	double width;	// 가로
	double height;	// 높이

	public Rectangle(double width, double height) {
		this.width  = width;
		this.height = height;
	}

	@Override
	double area() {
		return this.width * this.height;
	}

	@Override
	double round() {
		return (this.width + this.height) * 2;
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
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
}
