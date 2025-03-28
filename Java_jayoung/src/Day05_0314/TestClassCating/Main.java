package Day05_0314.TestClassCating;

public class Main {

	public static void main(String[] args) {

		String createClass = "Car car = new Car()";
		printClassName(createClass);

		Car car = new Car();
		System.out.println("클래스 변수 name\t\t: " + car.name);
		car.printString();

		createClass = "Taxi taxi = new Taxi()";
		printClassName(createClass);

		Taxi taxi = new Taxi();
		System.out.println("클래스 변수 name\t\t: " + taxi.name);
		System.out.println("클래스 변수 name2\t\t: " + taxi.name2);
		taxi.printString();

		createClass = "Car carTaxi = new Taxi()\t\tUpCasting";
		printClassName(createClass);

		Car carTaxi = new Taxi();
		System.out.println("클래스 변수 name\t\t: " + carTaxi.name);
		// System.out.println("클래스 변수 name2\t\t: " + carTaxi.name2);
		System.out.println("클래스 메소드 getName\t: " + carTaxi.getName());
		// System.out.println("클래스 메소드 getName2\t\t: " + carTaxi.getName2());
		carTaxi.printString();

		createClass = "Car downCasting = new Taxi()\t\tDownCasting\n" + "Taxi taxiCar = (Taxi) downCasting";
		printClassName(createClass);

		Car  downCasting = new Taxi();
		Taxi taxiCar     = (Taxi) downCasting;
		// Taxi taxiCar2 = (Taxi) new Car();
		System.out.println("클래스 변수 name\t\t: " + taxiCar.name);
		System.out.println("클래스 변수 name2\t\t: " + taxiCar.name2);
		System.out.println("클래스 메소드 getName\t: " + taxiCar.getName());
		System.out.println("클래스 메소드 getName2\t: " + taxiCar.getName2());
		taxiCar.printString();

	}

	private static void printClassName(String createClass) {
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println(createClass);
		System.out.println("----------------------------------------");
	}
}
