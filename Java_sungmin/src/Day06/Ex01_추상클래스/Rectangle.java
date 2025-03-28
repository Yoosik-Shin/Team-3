package Day06.Ex01_추상클래스;


//    * 추상 클래스의 추상 메소드를 구현 클래스에서 반드시 오버라이딩 해야한다.
public class Rectangle extends Shape {
	
	double width, height;
	
	public Rectangle() {
		this(0.0, 0.0);
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
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
	
//	getter, setter
	
	

}
