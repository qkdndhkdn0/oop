package encapsulation;

public class PayBean {
	//메소드는 선언부, 연산부, 출력부 이렇게 나누고
	//Bean 클래스라면 멤버필드 + 멤버메소드
	private String name;
	private int sal;
	
	
	//멤버메소드영역이 시작
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setSal(int sal){
		this.sal=sal;
	}
	
	public int getSal(){
		return sal;
	}
	
	
	public int getTax() {
		int tax=0; //지변초기화 필수
		tax = sal/10;
		return tax;
	}
	
	
	/*
	 * this는 이 클래스 내부에 있는 ~~~의미
	 */
	public int getDon() {
		int don=0;
		don = sal - getTax();
		return don;
	}
	@Override
	public String toString() {
		
		return "["+name+"] 실급여\n"+"월급 : "+sal+"만원"+"세금 : "+getTax()+"만원"+" 실급여 : "+getDon()+"만원";
	}
	
	/*public void Display(){
		System.out.println("["+name+"] 실급여\n"+"월급 : "+sal+"만원"+"세금 : "+getTax()+"만원"+"실급여 : "+getDon()+"만원");
	}*/
	

	
}
