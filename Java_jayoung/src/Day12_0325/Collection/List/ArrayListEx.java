package Day12_0325.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// ArrayList 생성 - 쇼핑 카트 (장바구니)
		ArrayList<String> shoppingCart = new ArrayList<String>();

		// 요소 추가 - add()
		shoppingCart.add("아웃백 외식 상품권 100만원");
		shoppingCart.add("신세계 백화점 상품권 100만원");
		shoppingCart.add("빽햄 500개");

		// 반복 출력
		System.out.println("::::: 장바구니 목록 :::::");

		for (String item : shoppingCart) {
			System.out.print(item + "\t");
		}
		System.out.println();
		System.out.println();

		// 특정 위치에 요소 추가 - add(index)
		System.out.println("::::: 위치에 요소 추가 :::::");
		shoppingCart.add(1, "삼성 갤럭시북");
		shoppingCart.add(2, "아이패드 미니");
		System.out.println(shoppingCart);
		System.out.println();

		// 요소 제거 - remove()
		System.out.println("::::: 요소 제거 :::::");
		shoppingCart.remove("아이패드 미니");
		System.out.println(shoppingCart);

		// 요소 개수 - size()
		System.out.println(shoppingCart.size());
		System.out.println();

		// 요소 접근 - get()
		System.out.println("::::: 요소 접근 :::::");
		String addItem = shoppingCart.get(2);
		System.out.println("세 번째 아이템 : " + addItem);

		// 요소 확인
		boolean hasCalaxyBook = shoppingCart.contains("삼성 갤럭시북");
		if (hasCalaxyBook) System.out.println("갤럭시북이 있습니다.");
		else System.out.println("갤럭시북이 없습니다.");
		System.out.println();

		// 요소 전체 추가 - addAll()
		System.out.println("::::: 요소 전체 추가 :::::");
		System.out.println("추가 전 : " + shoppingCart.size());

		ArrayList<String> addShoppingCart = new ArrayList<String>();
		addShoppingCart.add("아웃백 외식 상품권 100만원");
		addShoppingCart.add("신세계 백화점 상품권 100만원");
		addShoppingCart.add("빽햄 500개");
		shoppingCart.addAll(addShoppingCart);
		System.out.println("추가 후 : " + shoppingCart.size());
		System.out.println();

		// 모든 요소 제거 - clear()
		System.out.println("::::: 모든 요소 제거 :::::");
		shoppingCart.clear();
		System.out.println(shoppingCart);

		System.out.println();
		System.out.println("가지고 싶은 물건 5가지 입력하기");

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			String dnltl = sc.nextLine();
			shoppingCart.add(dnltl);
		}

		sc.close();

		System.out.println();

		// 반복1 - for
		for (int i = 0; i < shoppingCart.size(); i++) {
			System.out.print(shoppingCart.get(i) + "\t");
		}
		System.out.println();

		// 반복2 - foreach
		for (String item : shoppingCart) {
			System.out.print(item + "\t");
		}
		System.out.println();

		// 반복3 - Iterator (for)
		for (Iterator<String> iterator = shoppingCart.iterator(); iterator.hasNext();) {
			String item = (String) iterator.next();
			System.out.print(item + "\t");
		}
		System.out.println();

		// 반복4 - Iterator (while)
		Iterator<String> iterator = shoppingCart.iterator();

		while (iterator.hasNext()) {
			String item = (String) iterator.next();
			System.out.print(item + "\t");
		}
	}
}
