package Day05_0314.TestClassCating;

public class Car {

	public String name;

	public Car() {
		this.name = "차";
	}

	public Car(String str) {
		this.name = "차";
	}

	public void printString() {
		System.out.println("차의 메소드\t\t: " + this.name);
	}

	public String getName() {
		return this.name;
	}
}
