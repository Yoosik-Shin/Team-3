package mission.Q11_클래스_은행;

public class Account {
	// 최근 보이스피싱 사기가 많아 한 번에 송금할 수 있는 금액을 1,000,000 원으로 제한
	// Account 객체를 기본 생성시 계좌번호, 예금주, 잔고는 각각 “계좌없음”, “이름없음“, 0 으로 초기화
	// Account 객체의 멤버 변수는 Getter, Setter 메소드를 이용하여 접근
	// 잔고 직접 지정과 입금 및 출금은 허용된 금액 범위에서만 적용 가능하도록 한다.
	private String depoNumber; // 계좌번호
	private String depositor;  // 예금주
	private int    deposit;    // 잔고
	private String password;   // 비밀번호

	public Account() {
		this("계좌없음", "이름없음", 0, "0");
	}
	public Account(String depoNumber, String depositor, int deposit, String password) {
		this.depoNumber = depoNumber;
		this.depositor  = depositor;
		this.deposit    = deposit;
		this.password   = password;
	}

	// 잔액 변경

	public String getDepoNumber() {
		return depoNumber;
	}
	public void setDepoNumber(String depoNumber) {
		this.depoNumber = depoNumber;
	}
	public String getDepositor() {
		return depositor;
	}
	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		if (deposit > 1000000 || deposit < -1000000) {
			System.out.println("1회 거래 금액은 1,000,000원을 넘기실 수 없습니다.");
		} else this.deposit += deposit;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Account [depoNumber=" + depoNumber + ", depositor=" + depositor + ", deposit=" + deposit + ", password="
				+ password + "]";
	}

	public void setMoney(int money) {

	}

}
