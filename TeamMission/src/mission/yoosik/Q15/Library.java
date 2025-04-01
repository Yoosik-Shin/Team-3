package mission.yoosik.Q15;

import java.util.ArrayList;

public class Library {
	// Book 객체를 생성할 Library 클래스 정의
	
	public static void main(String[] args) {

		ArrayList<Book> book = new ArrayList<>();

		book.add(new Book("123123", "이게 자바냐", "감자바", "자바 감자바", 33000));
		book.add(new Book("112112", "정보처리기사", "김휴먼", "국가기술자격", 45000));
		book.add(new Book("001001", "실무 DB", "박디비", "디비디비딥 ", 60000));
		
		
		
		System.out.println("==================== ALOHA 스터디 도서관 ====================");
		for (Book book2 : book) {
			System.out.println(book2);
		}
		
		
	}

}
