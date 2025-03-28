package Day09_0320.Ex05_AutoImport;

public class Cloth extends Product {

	String color;	// 색상
	String size;	// 사이즈 S M L

	// getter, setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	// toString
	@Override
	public String toString() {
		return "Cloth [color=" + color + ", size=" + size + "]";
	}
}
