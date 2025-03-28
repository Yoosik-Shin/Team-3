package Day05.Ex05_인자전달;

public class CallByValue {
	
	public static int sum(int a, int b) {
		a = 100;
		b = 200;
		int sum = a + b;  // 300
		System.out.println("::::: sum() 메소드 :::::");
		System.out.println("(a, b) : " + a + ", " + b); // 100, 200
		return sum;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(":::: main() 메소드 호출 ::::");
		System.out.println("(a, b) : " + a + ", " + b); // 10, 20
		
		int sum = sum(a, b);
		System.out.println("sum : " + sum); // 300 
		
		System.out.println(":::: sum() 메소드 호출 ::::");
		System.out.println("(a, b) : " + a + ", " + b);
	}
}
