package mission.Q11_클래스_은행;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Bank {
	// ALOHA은행의 금고에는 최대 1조까지 안전하게 보관
	// ALOHA은행은 예금액을 최대 10억까지 관리할 수 있는 통장을 개설해주고 있다.
	// ALOHA은행이 수용할 수 있는 최대 고객수는 1,000 명
	// static 으로 유일한 객체 선언
	private static Bank               instance;
	public final double               MAX_MOMEY_BANK   = 1000000000000D;
	public final int                  MAX_MOMEY_PEOPLE = 1000000000;
	public final int                  MAX_PERSON       = 1000000000;
	private final String              password         = "123456789";
	private static ArrayList<Account> accountList;

	// private 생성자 정의
	private Bank() {
	}

	// 유일한 인스턴스를 반환하는 메소드
	public static Bank getInstance() {
		if (null == instance) {
			instance    = new Bank();
			accountList = new ArrayList<Account>();
		}
		return instance;
	}

	/** 메뉴 출력 */
	public void printMenu() {
		System.out.println("1.계좌등록");
		System.out.println("2.입금");
		System.out.println("3.출금");
		System.out.println("4.계좌조회");
		System.out.println("5.계좌목록");
		System.out.println("6.종료");
	}

	/** 은행 비번 */
	public String getPassword(String password) {
		if (this.password == password) {
			return password;
		} else {
			return null;
		}
	}

	/** 계좌 개설 */
	public Account creatAccount(Account account) {
		if (accountList.size() > MAX_PERSON) {
			System.out.println("최대 인원수 초과");
			return null;
		} else {
			accountList.add(account);
			return account;
		}
	}

	/** 계좌 조회 */
	public Account asAccount(String depoNumber) {

		Stream<Account> filter = accountList.stream()
				// 계좌번호가 같은가?
				.filter(account -> account.getDepoNumber() == depoNumber);

		if ((int) filter.count() == 1) {
			return (Account) filter.limit(1);
		} else {
			return null;
		}
	}


}
