package Day08_0319.Ex06_UserException;

// 사용자 정의 예외
// - public class XXXException extends Exception { }
public class BalanceExceptoin extends Exception {

	public BalanceExceptoin() {}

	public BalanceExceptoin(String message) {
		super(message);
	}
}
