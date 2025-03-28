package Day05_0314.Ex05_인자전달;

import Day05_0314.Ex04_상속.PiKachu;

public class CallByReference {

	// 배열을 전달받아 배열 요소를 변경하는 메소드
	public static void setArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}

		System.out.println(":::::::::: setArr() 메소드 ::::::::::");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
	}

	public static void setObject(PiKachu pikachu) {
		pikachu.energy = 1000;
		pikachu.type   = "물";
		System.out.println(":::::::::: setObect() 메소드 ::::::::::");
		System.out.println(pikachu);
		System.out.println();
	}

	public static void main(String[] args) {
		int     arr[]   = {1, 2, 3, 4, 5};
		PiKachu pikachu = new PiKachu();

		System.out.println(":::::::::: main() 메소드 ::::::::::");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println(pikachu);
		System.out.println();

		setArr(arr);
		setObject(pikachu);

		System.out.println(":::::::::: setXXX() 메소드 호출 후 ::::::::::");

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println(pikachu);
		System.out.println();
	}
}
