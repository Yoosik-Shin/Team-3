package Day06.Ex01_추상클래스;

public class Circle extends Shape{
	
	double radius; // 반지름

	
	public Circle() {
		this(0);
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}



	@Override
	double area() {
		// 원의 넓이 = (원주율) x (반지름) x (반지름)
		return Math.PI * Math.pow(radius,  2);
	}
//	getter, setter
	
	

	@Override
	double round() {
		// 원의 둘레 = 2 x (원주율) ㅌ (반지름)
		return 2 * Math.PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
