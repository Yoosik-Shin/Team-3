package Day12_0325.Collection.List;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		// Vector 생성
		// - 학생 목록
		Vector<String> bookList = new Vector<String>();

		// 요소 추가 - add()
		bookList.add("백설공주");
		bookList.add("미운 오리 새끼");
		bookList.add("헨젤과 그레텔");
		bookList.add("피터 팬");
		bookList.add("어린 왕자");

		System.out.println("::::: 목록 :::::");
		System.out.println(bookList);
		System.out.println();

		// 요소 제거 - remove()
		bookList.remove("백설공주");	// 객체 요소(인스턴스)로 제거
		bookList.remove(1);			// index로 제거

		System.out.println("::::: 목록 :::::");
		System.out.println(bookList);
		System.out.println();

		// 요소 접근 - get()
		System.out.println("::::: 찾기 :::::");
		System.out.println(bookList.get(0));
		System.out.println(bookList.get(1));
		System.out.println();

		// 요소 개수 - size()
		System.out.println("::::: 남은 수 :::::");
		System.out.println(bookList.size());
		System.out.println();

		// 모든 요소 제거 - clear()
		bookList.clear();
		System.out.println("::::: 모든 요소 제거 :::::");
		System.out.println(bookList);
		System.out.println();

		// 요소 전체 추가 - addAll()
		System.out.println("::::: 요소 전체 추가 :::::");
		Vector<String> bookListAdd = new Vector<String>();
		bookListAdd.add("알라딘과 요술 램프");
		bookListAdd.add("곰돌이 푸");
		bookListAdd.add("신데렐라");
		bookList.addAll(bookListAdd);
		System.out.println(bookList);
		System.out.println();

		System.out.println("::::: 리스트 출력 :::::");
		for (int i = 0; i < bookList.size(); i++) {
			String book = bookList.get(i);
			System.out.print(book);
			if (i < bookList.size()) System.out.print(", ");

		}
		System.out.println();
		for (String book : bookListAdd) {
			System.out.print(book + ", ");
		}
		System.out.println();

		System.out.println();
		System.out.println("::::: 원본 변경 후 :::::");
		bookList.set(1, "토끼와 거북이");
		for (String book : bookList) {
			System.out.print(book + ", ");
		}
		System.out.println();
		for (String book : bookListAdd) {
			System.out.print(book + ", ");
		}
		System.out.println();
		System.out.println();

		// 다른 컬렉션을 인자로 생성 할 수 있다.
		System.out.println("::::: 다른 컬렉션을 인자로 생성 :::::");
		Vector<String> bookListLast = bookListAdd;
		bookListLast.add("금도끼 은도끼");
		bookListAdd.set(1, "백설공주");
		for (String book : bookListAdd) {
			System.out.print(book + ", ");
		}
		System.out.println();
		for (String book : bookListLast) {
			System.out.print(book + ", ");
		}
		System.out.println();
	}
}
