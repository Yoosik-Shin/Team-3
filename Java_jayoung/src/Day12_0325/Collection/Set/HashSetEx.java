package Day12_0325.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();

		// 추가
		System.out.println(set.add(1));
		System.out.println(set.add(2));
		System.out.println(set.add(3));
		System.out.println(set.add(4));
		System.out.println(set.add(5));
		System.out.println(set.add(6));

		for (Integer item : set) {
			System.out.print(item + " ");
		}
		System.out.println();

		System.out.println("::::: 추가 :::::");
		// Set 컬렉션은 중복된 요소를 저장하지 않는다.(중복불가)
		// - 이미 존재하는 3, 5는 추가하면 저장되지 않고 false 를 반환한다.
		System.out.println(set.add(3));
		System.out.println(set.add(5));
		System.out.println(set);
		System.out.println("size(개수) : " + set.size());

		System.out.println("::::: 삭제 :::::");
		// 삭제
		// * set에는 순서(index)가 없으므로 인스턴스 자체로 삭제한다.
		set.remove(3);
		set.remove(5);
		System.out.println(set);
		System.out.println(set.remove(10));
		System.out.println("size(개수) : " + set.size());

	}
}
