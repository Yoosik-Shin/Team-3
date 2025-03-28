package Day08.Ex06_UserException;

// 사용자 정의 예외
// - public class ??Exception extends Exception {  }
public class BalanceException extends Exception {

	public BalanceException() {
		super();
	}

	public BalanceException(String message) {
		super(message);
	}


	
}
//