package Day05_0314.TestClassCating;

public class Taxi extends Car {

	public String name;
	public String name2;

	public Taxi() {
		this.name  = "Taxi";
		this.name2 = "Taxi Car";
	}

	public Taxi(String str) {
		this.name  = "Taxi";
		this.name2 = "Taxi Car";
	}

	public void printString() {
		System.out.println("Taxi의 메소드\t\t: " + this.name);
		System.out.println("Taxi의 메소드\t\t: " + this.name2);
	}

	public String getName() {
		return this.name;
	}

	public String getName2() {
		return this.name2;
	}
}
