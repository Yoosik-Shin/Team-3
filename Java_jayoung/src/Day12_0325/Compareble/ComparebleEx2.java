package Day12_0325.Compareble;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 1. 영화 클래스 정의
 * 2. 변수 선언 : title, firector, price
 * 3. 영화를 제목순으로 오름차순 정렬
 *  - comparable 인터페이스 구현
 *  - compareTo() 메소드 오버라이딩
 *  - 비교기준 설정
 * 		* String의 compareTo() 메소드 활용
 * 		* 해당문자열.compareTo( 비교 문자열 )
 * 		i)	 해당 문자열이 사전순으로 더 뒤에 있으면(양수)
 * 		ii)	 해당 문자열이 사전순으로 더 앞에 있으면(음수)
 * 		iii) 같은 문자열이면 0
 */

class Movie implements Comparable<Movie> {
	String title;
	String firector;
	int    price;

	public Movie(String title, String firector, int price) {
		this.title    = title;
		this.firector = firector;
		this.price    = price;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public int compareTo(Movie o) {
		String thisTitle = this.getTitle();
		String comTitle  = o.getTitle();
		int    result    = thisTitle.compareTo(comTitle);
		return result;
		// return this.getTitle().compareTo(o.getTitle());
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", firector=" + firector + ", price=" + price + "]";
	}
}

public class ComparebleEx2 {
	public static void main(String[] args) {
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("미키17", "봉준호", 25000));
		movieList.add(new Movie("서브스턴스", "코랄리 파르쟈", 20000));
		movieList.add(new Movie("백설공주", "디즈니", 15000));
		movieList.add(new Movie("타짜", "최동훈", 18000));
		movieList.add(new Movie("포레스트 검프", "로버트 지메키스", 19000));

		System.out.println("----- 정렬 전 -----");
		for (Movie movie : movieList) {
			System.out.println(movie);
		}
		System.out.println();

		Collections.sort(movieList);

		System.out.println("----- 정렬 후 -----");
		for (Movie movie : movieList) {
			System.out.println(movie);
		}
	}
}
