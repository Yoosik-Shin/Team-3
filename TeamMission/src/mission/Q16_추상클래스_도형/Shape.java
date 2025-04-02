package mission.Q16_추상클래스_도형;

public abstract class Shape {
	Point point;

	/**
	 * 넓이를 구하는 메소드
	 * @return
	 */
	abstract double area();

	/**
	 * 둘레를 구하는 메소드
	 * @return
	 */
	abstract double round();

	// getter, setter
	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
}
