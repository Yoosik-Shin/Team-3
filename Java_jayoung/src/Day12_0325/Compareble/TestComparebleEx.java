package Day12_0325.Compareble;

import java.util.ArrayList;
import java.util.List;

/**
 * 책 (Book)을 가격순으로 오름차순 정렬
 * 1. Comparable 인터페이스를 구현
 * 2. compareTo() 메소드 오버라이딩
 * - 비교 기준에 따라 양수, 0, 음수 반환
 * 3. Collections.sort() 메소드로 정렬
 */

class MyBook {
	String title;
	String author;
	int    price;

	public MyBook(String title, String author, int price) {
		this.title  = title;
		this.author = author;
		this.price  = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

}

public class TestComparebleEx {
	public static void main(String[] args) {
		List<MyBook> bookList = new ArrayList<MyBook>();
		bookList.add(new MyBook("책1", "저자1", 10000));
		bookList.add(new MyBook("책2", "저자2", 30000));
		bookList.add(new MyBook("책3", "저자3", 50000));
		bookList.add(new MyBook("책4", "저자4", 40000));
		bookList.add(new MyBook("책5", "저자5", 20000));

		// 정렬 전
		System.out.println("정렬 전");
		bookList.stream().forEach(book -> System.out.println(book));

		// 정렬
		// 정렬 후
		System.out.println("정렬 후");
		bookList.stream().sorted((book1, book2) -> Integer.compare(book1.price, book2.price))
				.forEach(book -> System.out.println(book));
	}
}