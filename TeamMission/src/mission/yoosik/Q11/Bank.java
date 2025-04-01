package mission.yoosik.Q11;

import java.util.ArrayList;
import java.util.Scanner;


public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountInterface accountInterface = new AccountAccess();
		int num;
		
		do {
			System.out.println("============================");
			System.out.println("1. 계좌 등록");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 계좌 조회");
			System.out.println("5. 계좌 목록");
			System.out.println("6. 종료");
			System.out.println("============================");
			System.out.print("입력 : ");
			num = sc.nextInt();
			sc.nextLine();
			
			if (num == 0) break;
			
			switch (num) {
			case 1:
				System.out.print("계좌번호>>");
				String accountNumber = sc.nextLine();
				
				System.out.print("예금주>>");
				String name = sc.nextLine();
				
				System.out.print("최초예금액>>");
				int firstDeposit = sc.nextInt();
				sc.nextLine();
				
				System.out.print("비밀번호>>");
				int pw = sc.nextInt();
				sc.nextLine();
				
				Account creatAccount = new Account(accountNumber, name, firstDeposit, pw);

				break;
			case 2:
				System.out.print("계좌번호>>");
				String accNumber = sc.nextLine();
				Account accountNum = accountInterface.read(accNumber);
				if (accountNum != null) {
					System.out.print("입금액>>");
				} else {
					System.out.println("계좌가 없습니다.");
				}
				int money = sc.nextInt();
				System.out.println("'" + accountNum.getName() + "'" +"님에게 입금하는게 맞으십니까?");
				System.out.println("1. 예");
				System.out.println("2. 아니오");
				System.out.print("입력>>");
				int chooseNum = sc.nextInt();
				
				if (chooseNum == 1) {
					accountNum.setBalance(accountNum.getBalance() + money);
					System.out.println("입금되었습니다.");
					System.out.println("잔고는 " + accountNum.getBalance() + "원 입니다.");
				} else if (chooseNum == 2){
					System.out.println("입금이 취소되었습니다.");
				}
			
				break;
			case 3:
				System.out.print("계좌번호>>");
				accNumber = sc.nextLine();
				
				System.out.print("비밀번호>>");
				int accPw = sc.nextInt();
				sc.nextLine();
				
				Account account = accountInterface.read(accNumber);
				boolean accChk = accNumber.equals(account.getAccountNumber());

				boolean pwChk = accPw == account.getPassWord();
				if (!accChk) {
					System.err.println("계좌번호가 틀립니다.");
				} else if (accChk && pwChk) {
					System.out.print("출금액>>");
					int withDraw = sc.nextInt();
					sc.nextLine();
					System.out.println("'" + account.getName() + "'" + "님의 계좌에서 " + withDraw + "원이 출금되었습니다.");
					account.setBalance(account.getBalance()-withDraw);
					System.out.println("잔액은 " + account.getBalance() + "원 입니다.");
				}
				break;	
			case 4:
				System.out.println("============= 계좌 조회 =============");
				System.out.print("계좌번호>>");
				String acNum = sc.nextLine();
				System.out.print("비밀번호>>");
				int acPw = sc.nextInt();
				Account acc = accountInterface.read(acNum);
				boolean accInquiry = acNum.equals(acc.getAccountNumber());
				boolean accPwInquiry = acPw == acc.getPassWord();
				if (accInquiry && accPwInquiry)
					System.out.println("'" + acc.getName() + "'" + "님의 계좌 잔액은 " + acc.getBalance() + "원 입니다.");
				if (!accInquiry) {
					System.err.println("없는 계좌번호 입니다.");
				} else if(!accPwInquiry) {
					System.err.println("비밀번호가 틀렸습니다.");
				}
				break;
			case 5:
				System.out.print("입력>>");
				int adminPw = sc.nextInt();
				if (adminPw == 1234) {
					ArrayList<Account> accountList = (ArrayList<Account>) accountInterface.list();
					for (Account accarray : accountList) {
						System.out.println(accarray);
					}
				} else {
					System.err.println("비밀번호가 다릅니다!");
				}
				break;
			default:
				if (num == 6) {
					System.out.println("시스템을 종료합니다.");
				} else
				System.out.println("1~6번 사이의 숫자를 입력해주세요.");
				break;
		}
	} while (true);
		System.out.println("종료합니다.");
		sc.close();
		
	}
	
}
