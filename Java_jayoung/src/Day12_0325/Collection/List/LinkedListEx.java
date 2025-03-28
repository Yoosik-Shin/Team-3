package Day12_0325.Collection.List;

import java.util.LinkedList;

class Product {

	String name;	// 상품명
	int    price;	// 가격
	int    count;	// 재고수

	public Product(String name, int price, int count) {
		this.name  = name;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
}

public class LinkedListEx {

	public static void main(String[] args) {
		// LinkedList 생성 - 재고목록
		LinkedList<Product> inventoryList = new LinkedList<Product>();

		Product product1 = new Product("블루투스 동글", 0, 0);
		Product product2 = new Product("미니선풍기", 0, 0);
		Product product3 = new Product("기계식 키보드", 0, 0);

		// 요소 추가 - add()
		inventoryList.add(product1);
		inventoryList.add(product2);
		inventoryList.add(product3);

		// 첫 번째/마지막 요소 가져오기
		Product firstProduct = inventoryList.getFirst();
		Product lastProduct  = inventoryList.getLast();
		System.out.println("첫번째 요소 : " + firstProduct);
		System.out.println("마지막 요소 : " + lastProduct);

		// 첫 번째/마지막 요소 제거
		inventoryList.removeFirst();
		inventoryList.removeLast();

		// 첫 번째/마지막 요소 추가
		inventoryList.addFirst(new Product("모니터", 200000, 10));
		inventoryList.addLast(new Product("컴퓨터", 1500000, 5));
		System.out.println(inventoryList);

		System.out.println("상품 개수 : " + inventoryList.size());

		inventoryList.clear();
		System.out.println("재고 목록");
		System.out.println(inventoryList);

	}
}
