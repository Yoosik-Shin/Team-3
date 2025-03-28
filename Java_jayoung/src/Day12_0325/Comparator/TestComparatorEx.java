package Day12_0325.Comparator;

import java.util.Arrays;
import java.util.List;

/**
 * 1. Comparator 인터페이스 구현
 * 2. compare() 메소드 오버라이딩
 * - 정렬 기준 1 : 나이순 내림차순
 * - 정렬 기준 2 : 이름순 오름차순
 */
class MyUser {

	String id;
	String name;
	int    age;

	public MyUser() {}

	public MyUser(String id, String name, int age) {
		this.id   = id;
		this.name = name;
		this.age  = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

public class TestComparatorEx {
	public static void main(String[] args) {
		List<MyUser> userList = Arrays.asList(
				new MyUser("joeun1234", "홍조은", 34), 
				new MyUser("user1004", "전조은", 25), 
				new MyUser("joeun1004", "김조은", 25), 
				new MyUser("tje0202", "배조은", 25),
				new MyUser("aloha1007", "박조은", 28), 
				new MyUser("kje0715", "권조은", 30), 
				new MyUser("leejoeun22", "이조은", 22), 
				new MyUser("hje25", "황조은", 25)
		);

		// 정렬 전
		System.out.println("정렬 전");
		for (MyUser book : userList) {
			System.out.println(book);
		}

		// 정렬
		// 정렬 후
		System.out.println("정렬 후");
		userList.stream().sorted((o1, o2) -> {
			int age  = o2.getAge() - o1.getAge();
			int name = o1.getName().compareTo(o2.getName());
			return age == 0 ? name : age;
		}).forEach(user -> System.out.println(user));
	}
}
