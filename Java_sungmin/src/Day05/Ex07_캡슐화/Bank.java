package Day05.Ex07_캡슐화;

public class Bank {
	
	public static void main(String[] args) {
		Account account = new Account(0, "김조은", "282401-04-109955", "국민은행");
		
		account.setDeposit(1000);
		
		int money = account.getDeposit();
		System.out.println("예금액 : " + money);
		System.out.println(account);
	}

}
