package mission.Q10_클래스_도형의넓이;

public class Trapezoid {

	private double top;
	private double bottom;
	private double height;

	// 생성자
	public Trapezoid() {
	}

	public Trapezoid(double top, double bottom, double height) {
		this.top    = top;
		this.bottom = bottom;
		this.height = height;
	}

	// 넓이 구하는 공식
	public String getArea() {
		// (윗변 + 아랫변) × 높이 ÷ 2
		double result = ((this.top + this.bottom) * this.height) / 2.0;
		return String.valueOf(result);
	}

	@Override
	public String toString() {
		return "Trapezoid [top=" + top + ", bottom=" + bottom + ", height=" + height + "]";
	}
}
