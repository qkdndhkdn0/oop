package abstraction;

public class Attack extends BagicBot {
	private int at;
	
	

	public void setAt(int at) {
		this.at += at;
	}

	public void status(){
		
		System.out.println("건로봇");
		System.out.println("공격력 : "+this.at);
		super.status();
	}
	
}
