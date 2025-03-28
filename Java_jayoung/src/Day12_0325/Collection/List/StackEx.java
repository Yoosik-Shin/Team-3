package Day12_0325.Collection.List;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {
	private Stack<String> history     = new Stack<String>();
	private String        currentPage = "시작 페이지";

	// 페이지 방문
	public void visit(String page) {
		history.push(currentPage);
		currentPage = page;
		System.out.println(page + " - 페이지로 이동합니다.");
	}

	// 뒤로가기
	public void goBack() {

		if (!history.isEmpty()) {
			currentPage = history.pop();
			System.out.println("뒤로 가기\t\t: " + currentPage);
		} else {
			System.out.println("뒤로 갈 수 없습니다.");
		}
	}

	public void nowPage() {
		System.out.println("현재 페이지\t: " + currentPage);
	}

	// 방문 기록 보기
	public void showHistory() {
		System.out.println();
		System.out.println("::::: 방문 기록 :::::");
		Iterator<String> it = history.iterator();

		while (it.hasNext()) {
			String page = (String) it.next();
			System.out.println(page);
		}
	}

	public static void main(String[] args) {
		StackEx web = new StackEx();
		web.visit("유튜브");
		web.nowPage();
		web.visit("Github");
		web.nowPage();
		web.visit("네이버");
		web.nowPage();
		web.visit("쇼핑몰");
		web.nowPage();
		web.showHistory();
		System.out.println();
		// 뒤로가기
		web.nowPage();
		web.nowPage();
		web.goBack();
		web.nowPage();
		web.goBack();
		web.nowPage();
		web.showHistory();
	}
}
