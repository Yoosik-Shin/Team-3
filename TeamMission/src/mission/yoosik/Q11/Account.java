package mission.yoosik.Q11;

import java.util.ArrayList;

public class Account {

	private String accountNumber;
	private String name;
	private int balance;
	private int passWord;
	
	
	
	public Account() {
		this("계좌없음", "이름없음", 0, 0);
	}
	public Account(String accountNumber, String name, int balance, int passWord) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.passWord = passWord;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPassWord() {
		return passWord;
	}
	public void setPassWord(int passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "" + accountNumber + " \t\s " + name + " \t\t " + balance + " ";
	}


}

interface AccountInterface {
	int BALANCE_MAX = 1000000000;
	int MAX_DEPOSIT_AMOUNT = 1000000;
	
	Account create(Account account);
	
	ArrayList<Account> list();
	
	Account read(String accountNumber);
	
}

class AccountAccess implements AccountInterface {
	
	int count = 0;
	ArrayList<Account> accountList = new ArrayList<>();
	
	public AccountAccess() {
	}
	
	@Override
	public Account create(Account account) {
		accountList.add(account);
		System.out.println("계좌가 개설되었습니다.");
		return account;
	}

	@Override
	public ArrayList<Account> list() {
		if (accountList.isEmpty()) {
			System.out.println("개설된 계좌가 없습니다.");
			
			return null;
		}
		System.out.println("========== 계좌 목록 ===========");
		System.out.println("예금주 \t\s 계좌번호 \t\t 잔고");
		return accountList;
	}

	@Override
	public Account read(String accountNumber) {
		for (Account account : accountList) {
			if (accountNumber.equals(account.getAccountNumber()))
			return account;
		}
		return null;
	}

}