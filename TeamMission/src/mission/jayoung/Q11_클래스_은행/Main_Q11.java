package mission.jayoung.Q11_클래스_은행;

import java.util.Scanner;

// ALOHA은행은 예금액을 최대 10억까지 관리할 수 있는 통장을 개설해주고 있다.
// 최근 보이스피싱 사기가 많아 한 번에 송금할 수 있는 금액을 1,000,000 원으로 제한하여
// 예금주의 계좌를 안전하게 보호하고 있다.
// 아래의 <조건>과 <실행결과>를 참고하여 [Account.java, Bank.java] 클래스를 작성 하시오.
// <조건>- ALOHA은행의 금고에는 최대 1조까지 안전하게 보관할 수 있다.
// 따라서, ALOHA은행이 수용할 수 있는 최대 고객수는 1,000 명이다.
// - Account 객체를 기본 생성시 계좌번호, 예금주, 잔고는 각각 “계좌없음”, “이름없음“, 0 으로 초기화한다.
// - Account 객체의 멤버 변수는 Getter, Setter 메소드를 이용하여 접근한다.
// - 잔고 직접 지정과 입금 및 출금은 허용된 금액 범위에서만 적용 가능하도록 한다.
//
// ===================================			// 입력>> 1                       
// 1.계좌등록										// 계좌번호>> 1234-5678             
// 2.입금                                       	// 예금주>> 김조은                    
// 3.출금                                       	// 최초예금액>> 10000                
// 4.계좌조회                                    	// 비밀번호>> 1234                  
// 5.계좌목록                                    	// ‘김조은’ 님의계좌가개설되었습니다.          
// 6.종료
// ===================================
// ===================================         	// 입력>> 2                       
// 1.계좌등록                                    	// ============= 입금=============
// 2.입금                                       	// 계좌번호>> 1234-5678             
// 3.출금                                      	// 입금액>> 500000                 
// 4.계좌조회                                   	// ‘김조은’ 님에게입금하는게맞으십니까?         
// 5.계좌목록                                   	// 1.예                          
// 6.종료                                      	// 2.아니오                        
// ===================================        	// 입력>> 1                       
// ‘김조은‘ 님의계좌에500000 원이입금되었습니다. 

// ===================================        	// 입력>> 3                           
// 1.계좌등록                                    	// ============= 출금=============    
// 2.입금                                       	// 계좌번호>> 1234-5678                 
// 3.출금                                       	// 비밀번호>> 0000                      
// 4.계좌조회                                    	// 비밀번호가다릅니다!                       
// 5.계좌목록
// 6.종료
// ===================================
// ===================================        	// 입력>> 3                        
// 1.계좌등록                                   	// ============= 출금============= 
// 2.입금                                     	// 계좌번호>> 1234-5678              
// 3.출금                                     	// 비밀번호>> 1234                   
// 4.계좌조회                                  	// 출금액>> 100000                  
// 5.계좌목록                                 		// ‘김조은‘ 님의계좌에100000 원이출금되었습니다.  
// 6.종료
// ===================================
// ===================================      	// 입력>> 4                        
// 1.계좌등록                                  	// ============= 계좌조회============
// 2.입금                                    		// 계좌번호>> 1234-5678              
// 3.출금                                    		// 비밀번호>> 1234                   
// 4.계좌조회                                		// ‘김조은’ 님의계좌잔액은410000 원입니다.     
// 5.계좌목록
// 6.종료
// ===================================
// ===================================      	// 입력>> 5                            
// 1.계좌등록                                    	// 관리자비밀번호>> 1111                    
// 2.입금                                       	// ============= 계좌목록=============   
// 3.출금                                       	// 예금주계좌번호잔고                         
// 4.계좌조회                                    	// 김조은1234-5678 410000               
// 5.계좌목록                                     	// 한로하2222-9072 256000               
// 6.종료
// ===================================
// 입력>> 6

public class Main_Q11 {
	public static void main(String[] args) {
		int count = 0;

		Bank bank = Bank.getInstance();
		Main_Q11 menu = new Main_Q11();

		Scanner sc = new Scanner(System.in);

		while (true) {

			bank.printMenu();

			System.out.print("입력>> ");
			int input = sc.nextInt();
			System.out.println();

			if (input == 6) break;
			else if (input < 0 || input > 6) {
				System.out.println("메뉴 번호를 확인 해주세요.");
				continue;
			}

			Account account = new Account();

			switch (input) {
				case 1 : // 계좌등록

					account.setDepoNumber(menu.inputDepoNumber(sc));		// 계좌번호
					account.setDepositor(menu.inputDepositor(sc));		// 예금주
					account.setDeposit(menu.inputAdd(sc, true));		// 입금(최초입금)
					account.setPassword(menu.inputPassword(sc));

					bank.creatAccount(account);
					System.out.println("'" + account.getDepoNumber() + "'님의 계좌가 개설되었습니다.");

					break;
				case 2 : // 입금

					System.out.println("============= 입금=============");
					account.setDepoNumber(menu.inputDepoNumber(sc));		// 계좌번호
					account.setDeposit(menu.inputAdd(sc, false));		// 입금
					
					Account asAccount = bank.asAccount(account.getDepoNumber());
					
					
					if (null != asAccount ) {
						System.out.print("'"+ asAccount.getDepositor()+ "님에게 입금하는게 맞으십니까?");
					}

					System.out.println("1. 예");
					System.out.println("2. 아니오");
					System.out.print("입력>> ");
					int check = sc.nextInt();
					if (check != 1)
						continue;
					
					// asAccount.add ;
					
					
					// 입력>> 2
					// ============= 입금=============
					// 계좌번호>> 1234-5678
					// 입금액>> 500000
					// ‘김조은’ 님에게입금하는게맞으십니까?
					// 1.예
					// 2.아니오
					// 입력>> 1
					break;
				case 3 : // 출금

					// 입력>> 3
					// ============= 출금=============
					// 계좌번호>> 1234-5678
					// 비밀번호>> 0000
					// 비밀번호가다릅니다!

					// 입력>> 3
					// ============= 출금=============
					// 계좌번호>> 1234-5678
					// 비밀번호>> 1234
					// 출금액>> 100000
					// ‘김조은‘ 님의계좌에100000 원이출금되었습니다.
					break;
				case 4 : // 계좌조회

					// 입력>> 4
					// ============= 계좌조회============
					// 계좌번호>> 1234-5678
					// 비밀번호>> 1234
					// ‘김조은’ 님의계좌잔액은410000 원입니다.
					break;
				case 5 :// 관리자조회

					// 입력>> 5
					// 관리자비밀번호>> 1111
					// ============= 계좌목록=============
					// 예금주계좌번호잔고
					// 김조은1234-5678 410000
					// 한로하2222-9072 256000
					break;
				default :
//					menu = "";
			}
		}

		sc.close();
	}
	/** 계좌번호 */
	public String inputDepoNumber(Scanner sc) {
		System.out.print("계좌번호>> ");
		return sc.nextLine();
	}

	/** 예금주 */
	public String inputDepositor(Scanner sc) {
		System.out.print("예금주>> ");
		return sc.nextLine();
	}
	
	/** 입금 */
	public int inputAdd(Scanner sc, boolean isFirst) {
		if (isFirst) {
			System.out.print("최초예금액>> ");
		} else {
			System.out.print("입금액>> ");
		}
		int nextInt = sc.nextInt();
		sc.nextLine();
		return nextInt;
	}

	/** 출금 */
	public int inputMinus(Scanner sc) {
		System.out.print("출금액>> ");
		int nextInt = sc.nextInt();
		sc.nextLine();
		return nextInt;
	}

	/** 비밀번호 */
	public String inputPassword(Scanner sc) {
		System.out.print("비밀번호>> ");
		return sc.nextLine();
	}


}
