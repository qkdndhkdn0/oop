package bank;

public class Bank implements BankRole{
//필드
	
	//생성자
	
	public Bank() {
		
	}
	//멤버메소드(인터페이스를 임플리먼트를하면 겟셋을 쓰지않는다
	
	//계좌개설
	@Override
	public void openAccount(String accountNo, String ownerName, String password, int restMoney) {
		
		
	}
//계좌 검색 (계좌 번호) -> 리턴결과 : 계좌 1개
	@Override
	public Account searchAccountByAccountNo(String accountNo) {
		Account account = null;
		return account;
	}
//계좌 검색(이름) -> 리턴결과 : 계좌 여러개
	@Override
	public Account[] searchAccountByName(String ownerName) {
		Account[] accounts = null;
		return accounts;
	}
//계좌검색(이름) -> 리턴결과 : 숫자
	@Override
	public int searchCaountByName(String name) {
		int count =0;
		return count;
	}
//계좌해지 -> 리턴결과 : true of false
	@Override
	public boolean closeAccount(String accountNo) {
		boolean flag = false; //지역변수가 불린이면 바로 이프엘스 구문구조 생성
		if (flag) {
			
		} else {

		}
		return flag;
	}

}
