package bank;

public class BankBook implements Account{

	public  static String BANK ; 
	 	private int bankbookNo; 
	 	private String name; 
	 	private int money; 
	 	private int pass; 
	 	private String msg; 
	 	 
	 	// 유효성 체크 결과를 알려줘서 고객이 만약 
		// 실수로 그렇게 입력했다면 공지해주는 기능 
	 	 
		 
	 	public BankBook(String name) { 
			this.BANK="아이티뱅크"; 
	 		// 계좌번호는 5자리 숫자 
		// 99999 - 10000 -....- 100000 
	 		this.bankbookNo = (int) ((Math.random()*99999)+10000); 
	 		this.name = name; 
	 	} 
	 	// 개발자는 setter 를 쓸지, 생성자로 끝낼지를 고민 
		// getter setter 단축키 : ART + SHIFT + S 
	
	 
	 
	 
	 	/*====== MemberMethod =======*/ 
 	@Override 
	 	public String toString() { 
			  
	 		return "===============\n " 
	 				+ "["+BANK+"]\n" 
				+ "계좌 번호 : "+bankbookNo+" \n" 
					+ "이름 : "+name+" \n" 
					+ "잔액 : "+money+"\n" 
	 				+ "==============="; 
	 	} 
	 
	 
	
	 
	 	public int getBankbookNo() { 
	 		return bankbookNo; 
	 	} 
	 
	 
	 	public String getName() { 
	 		return name; 
	 	} 
	 
	 
	 	public int getMoney() { 
	 		return money; 
	 	} 
	 	 
	 	public int getPass() { 
	 		return pass; 
	 	} 
	 	 
	 	public void setPass(int pass) { 
	 		this.pass = pass; 
		} 
		 
	 	@Override 
	 	public void withdraw(int money) { 
			// 파라미터 값이 정상값이 아닌 상태를 
 		// 추적해서 필터링 하는 로직이 필요해짐 
	 		// ==> 유효성 체크 
			if (money <= 0) { 
 				msg ="출금액이 잔액 보다 큽니다."; 
 		}else { 
			this.money -= money; //누적된 값에서 마이너스를 한다. 
 		} 
 		 
	 	} 
	 		 
	 	@Override 
	 	public void deposit(int money) { 
			if (money <= 0) { 
				msg = "입금액은 0 보다 커야합니다."; 
	 		}else { 
	 			this.money += money; 
	 		} 
	 		 
	 		 
		} 
	 	 
	} 
