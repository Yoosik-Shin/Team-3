package Day13_0326.Ex03_Stream;

import java.util.ArrayList;

public class StreamReduce {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(90);
		list.add(80);
		list.add(60);
		list.add(80);
		list.add(70);

		// reduce 연산
		// reduce (초기값, (누적값, 현재요소) - > 수식 )
		// : 모든 스트림 요소를 하나의 값으로 누적해서 줄이는 연산
		int result = list.stream().reduce(0, (sum, a) -> sum + a);
		System.out.println("result : " + result);

		ArrayList<String> wordlist = new ArrayList<String>();
		wordlist.add("안녕하세요.");
		wordlist.add("1시간 뒤면");
		wordlist.add("집에 갈 시간입니다.");
		wordlist.add("집에 가서 뭐하실 건가요?");

		String msg = wordlist.stream().reduce("", (a, b) -> a + " " + b);
		System.out.println("msg : " + msg);
	}
}
