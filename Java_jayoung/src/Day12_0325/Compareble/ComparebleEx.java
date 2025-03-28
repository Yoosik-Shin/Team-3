package Day12_0325.Compareble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 책 (Book)을 가격순으로 오름차순 정렬
 * 1. Comparable 인터페이스를 구현
 * 2. compareTo() 메소드 오버라이딩
 * - 비교 기준에 따라 양수, 0, 음수 반환
 * 3. Collections.sort() 메소드로 정렬
 */

class Book implements Comparable<Book> {
	String title;
	String author;
	int    price;

	public Book(String title, String author, int price) {
		this.title  = title;
		this.author = author;
		this.price  = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	/**
	 * compareTo()
	 * - 해당 객체 this와 비교 객체 o의 크기 기준을 설정하여 반환하는 메소드
	 * return
	 * 양수(1)	: 해당객체 > 비교객체
	 * 0		: 해당객체 = 비교객체
	 * 음수(-1)	: 해당객체 < 비교객체
	 */
	@Override
	public int compareTo(Book o) {
		int asc  = 1;
		int desc = -1;
		
		// 가격순 오름차순 정렬
		int thisPrice = this.price;
		int comPrice  = o.price;

		// 두 가격을 비교하여, 비교 기준에 따라 리턴
		// 방법 1
		if (thisPrice > comPrice) return asc;
		else if (thisPrice == comPrice) return 0;
		else return desc;

		// // 방법2
		// if (thisPrice > comPrice) return asc;
		// if (thisPrice == comPrice) return 0;
		// if (thisPrice < comPrice) return desc;
		// return 0 ;
		//
		// // 방법3
		// asc = thisPrice - comPrice; // 오름차순
		// desc = comPrice - thisPrice; // 내림차순
		//
		// // 방법4
		// return (thisPrice > comPrice) ? asc : (thisPrice < comPrice) ? desc : 0;

		// TODO <가격이 같을 때 제목 순>
	}
}

public class ComparebleEx {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("책1", "저자1", 10000));
		bookList.add(new Book("책2", "저자2", 30000));
		bookList.add(new Book("책3", "저자3", 50000));
		bookList.add(new Book("책4", "저자4", 40000));
		bookList.add(new Book("책5", "저자5", 20000));

		// 정렬 전
		System.out.println("정렬 전");
		for (Book book : bookList) {
			System.out.println(book);
		}

		// 정렬
		Collections.sort(bookList);

		// 정렬 후
		System.out.println("정렬 전");
		bookList.stream().forEach(book -> System.out.println(book));
	}
}