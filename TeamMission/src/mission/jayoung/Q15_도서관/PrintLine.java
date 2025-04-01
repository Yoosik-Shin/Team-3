package mission.jayoung.Q15_도서관;

import java.util.ArrayList;

public class PrintLine {
	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<String>();

		strList.add("자바 감자바");
		strList.add("국가기술자격");
		strList.add("디비디비딥");

		for (String str : strList) {
			// 원하는 길이의 공백 문자열을 출력할 문자열 뒤에 추가
			str = str + "          ";
			// subString(startIndex, endIndex) : 문자열을 startIndex부터 endIndex까지 자르기
			String substring = str.substring(0, 10);
			System.out.println("[" + substring + "]");
		}
		for (String str : strList) {
			// 원하는 길이의 공백 문자열을 출력할 문자열 뒤에 추가
			str = str + "          ";
			// subString(startIndex, endIndex) : 문자열을 startIndex부터 endIndex까지 자르기
			String substring = str.substring(0, 10);
			// 같은 글자수여도 폰트에 따라 끝 위치가 미묘하게 다른 경우가 있어 \t으로 마지막 위치 일치 시키기
			System.out.println("[" + substring + "\t]");
		}

		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(10);
		intList.add(1000);
		intList.add(10000000);
		for (int i : intList) {
			// 원하는 길이의 공백 문자열을 출력할 문자열 앞에 추가
			String str = "          " + i;
			// str.length() : 문자열의 총 길이
			// startIndex = 문자열의 총 길이 - 원하는 글자 수
			// ex) [123456789] 에서 뒤에서부터 3글자를 얻고 싶으면
			// 시작 인덱스 = 총길이(9) - 원하는 글자수(3) = 6
			int startIndex = str.length() - 10;
			// subString(startIndex) : 문자열을 startIndex부터 자르기
			String substring = str.substring(startIndex);
			System.out.println("[" + substring + "]");
		}
	}
}
