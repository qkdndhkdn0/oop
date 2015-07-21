package inheritance;

public class Phone {
	/*===== 필드 =====*/
	private String conpany;
	private String call;
	
	/*===== 생성자 =====*/
	
	/*=====멤버메소드 ======*/
	//get/set 단축키 ALT + SHIFT + S
	public String getConpany() {
		return conpany;
	}
	public String getCall() {
		return call;
	}
	public void setConpany(String conpany) {
		this.conpany = conpany;
	}
	public void setCall(String call) {
		this.call = call+"에게 전화를 검";
	}
	
	
}
