package Day08_0319.Ex06_UserException;

public class Bank {

	public static void main(String[] args) {
		Account account = new Account();

		// 10000원 입금
		account.deposit(10000);

		// 20000원 출금
		try {
			account.withdraw(20000);
		} catch (BalanceExceptoin e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
