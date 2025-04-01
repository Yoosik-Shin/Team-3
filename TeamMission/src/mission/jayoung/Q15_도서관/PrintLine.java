package mission.jayoung.Q15_도서관;

import java.util.ArrayList;

public class PrintLine {
	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<String>();

		strList.add("자바 감자바");
		strList.add("국가기술자격");
		strList.add("디비디비딥");

		for (String str : strList) {
			str = str + "          ";
			System.out.println("[" + str.substring(0, 10) + "]");
		}
		for (String str : strList) {
			str = str + "          ";
			System.out.println("[" + str.substring(0, 10) + "\t]");
		}
	}
}
