package Day13_0326.Ex03_Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamArrayList {
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();

		// 에너지 드링크
		productList.add(new Product("몬스터에너지", 2300));
		productList.add(new Product("레드불", 2500));
		productList.add(new Product("핫식스", 1800));
		productList.add(new Product("스누피커피우유", 1800));
		productList.add(new Product("아르포텐", 3000));

		// map - 매핑
		// : 스트림 요소를 사용하려는 형태로 변환하는 연산
		// * 이름(name) 만 추출(매핑)하여 반복
		productList.stream()
				// 추출
				.map((product) -> { return product.getName(); })
				// 반복
				.forEach((name) -> { System.out.println("[" + name + "]"); });

		System.out.println();

		productList.stream()
				// 추출
				.map(Product::getPrice)
				// 반복
				.forEach(System.out::println);
		System.out.println();

		// filter - 필터
		// : 스트림 요소에서 조건에 맞는 요소만 선택하는 연산
		// * 가격이 2000원 이상인 상품만 필터링하여 반복
		productList.stream()
				// 조건
				.filter(p -> p.getPrice() >= 2000)
				// 반복
				.forEach(p -> System.out.println(p.getName()));
		System.out.println();

		// 상품 명이 3글자인 상품만 필터링하여 반복
		productList.stream()
				// 조건
				.filter(p -> p.getName().length() == 3).map(Product::getName)
				// 반복
				.forEach(p -> System.out.println(p));
		System.out.println();

		// sorted - 정렬
		// : 스트림 요소에서 지정한 기준에 따라
		// 요소들을 오름차순 / 내림차순 정렬하는 연산
		System.out.println("이름순 정렬 (오름차순)");
		productList.stream()
				// 정렬 조건 이름순
				.sorted(Comparator.comparing(p -> p.getName()))
				// 반복
				.forEach(p -> System.out.println(p));
		System.out.println();

		System.out.println("이름순 정렬 (내림차순)");
		productList.stream()
				// 정렬 조건 이름순
				// .sorted(Comparator.comparing(p -> p.getName()).reversed())
				.sorted(Comparator.comparing(Product::getName).reversed())
				// 반복
				.forEach(p -> System.out.println(p));
		System.out.println();

		System.out.println("가격순 정렬 (오름차순)");
		productList.stream()
				// 정렬 조건 가격순
				.sorted(Comparator.comparing(p -> p.getPrice()))
				// 반복
				.forEach(p -> System.out.println(p));
		System.out.println();

		System.out.println("가격순 정렬 (내림차순)");
		productList.stream()
				// 정렬 조건 가격순
				.sorted(Comparator.comparing(Product::getPrice).reversed())
				// 반복
				.forEach(p -> System.out.println(p));
		System.out.println();

		// TODO 정렬 기준 2개

		// count() - 스트림 요소 개수
		// * 이름이 4글자 이상인 상품의 개수
		long count = productList.stream()
				// 조건
				.filter(p -> p.getName().length() >= 4)
				// 개수
				.count();
		System.out.println("이름이 4글자 이상인 사람들의 수 : " + count);

		// sum() 스트림 요소의 합계
		// * 가격이 2000원 미만인 상품들의 가격 합계
		int sum = productList.stream()
				// 조건
				.filter(p -> p.getPrice() < 2000)
				// 숫자 형식으로
				.mapToInt(p -> p.getPrice())
				// 합계
				.sum();
		System.out.println("가격이 2000원 미만인 상품들의 가격 합계 : " + sum);
	}
}

class Product {
	String name;
	int    price;

	public Product(String name, int price) {
		super();
		this.name  = name;
		this.price = price;
	}

	public Product() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}