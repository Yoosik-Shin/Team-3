package Day13_0326.Ex01_Generics;

import Day05_0314.Ex04_상속.PiKachu;
import Day05_0314.Ex04_상속.Raichu;

/**
 * 제네릭 와일드 카드
 * - 알 수 없는 타입을 대체하여 사용하는 기호
 * - 주로 타입 제한을 위해서 사용한다.
 * 1) ? super T : 해당 클래스부터 상위 클래스 범위까지 제한
 * 2) ? extends T : 해당 클래스부터 하위 클래스 범위까지 제한
 */
public class BoxWildCard {
	public static void main(String[] args) {
		Box<?> wildCardBox = new Box<>();

		Box<String> box1 = new Box<>();
		box1.setT("String Box");
		Box<?> wBox1 = box1;

		// Number 클래스와 하위 클래스 허용
		Box<Integer> box2_a = new Box<>();
		Box<Double>  box2_b = new Box<>();
		Box<Byte>    box2_c = new Box<>();

		Box<? extends Number> wbox2 = box2_a;
		wbox2 = box2_b;
		wbox2 = box2_c;
		// Box<? extends Number> wbox2 = box1; // (에러)

		Box<Raichu>  box3_a = new Box<>();
		Box<PiKachu> box3_c = new Box<>();

		Box<? super Raichu> wBox3 = box3_a;
		wBox3 = box3_c;

		// ? 와일드카드 사용시, 어떤 타입이든 사용 가능
		wildCardBox = wBox1;		// String
		wildCardBox = wbox2;		// Number
		wildCardBox = wBox3;		// Picachu

	}
}
