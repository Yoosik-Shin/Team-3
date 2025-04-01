package Day05.Ex05_인자전달;


import Day05.Ex04_상속.Pikachu;

public class CallByReference {
	
	// 배열을 전달받아 배열 요소를 변경하는 메소드
	public static void setArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		System.out.println(":::: setArr() 메소드 ::::");
		for (int i : arr) {
			System.out.print(i + " "); // 10 20 30 40 50
		}
		System.out.println();
	}
	
	// 객체를 전달받아 객체의 변수를 변경하는 메소드
	public static void setObject(Pikachu pikachu) {
		pikachu.energy = 1000;
		pikachu.type = "물";
		System.out.println(":::: setObject() 메소드 ::::");
		System.out.println(pikachu); // 에너지 1000, 타입 물
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 배열과 객체를 생성하여 메소드로 전달해보기
		int arr[] = {1,2,3,4,5};
		Pikachu pikachu = new Pikachu();
		
		System.out.println(":::: main() 메소드 ::::");
		for (int i : arr) {
			System.out.print(i + " ");   //1 2 3 4 5
		}
		System.out.println();
		System.out.println(pikachu);  // 100, 전기
		System.out.println();
		
		setArr(arr);
		setObject(pikachu);
		
		System.out.println(":::: setXXX() 메소드 호출 후 ::::");
		for (int i : arr) {
			System.out.print(i + " ");   // 10 20 30 40 50 
		}
		System.out.println();
		System.out.println(pikachu);   // 1000, 물
		System.out.println();
	}
}
