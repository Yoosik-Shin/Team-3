package Day06_0317.Ex01_추상클래스;

import java.math.BigDecimal;

public class Triangle extends Shape {

	double width, height;

	public Triangle() {
		this(0.0, 0.0);
	}

	public Triangle(double width, double height) {
		this.width  = width;
		this.height = height;
	}

	@Override
	double area() {
		// 삼각형의 넓이 = (가로) * (세로) / 2
		BigDecimal a = (BigDecimal.valueOf(width).multiply(BigDecimal.valueOf(height)));
		return (a.doubleValue() / 2);
	}

	@Override
	double round() {
		// 정삼각형
		// 정삼각형의 둘레 = 3 * width
		return 3 * width;
	}

	// getter, setter
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

	// toString
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

}
