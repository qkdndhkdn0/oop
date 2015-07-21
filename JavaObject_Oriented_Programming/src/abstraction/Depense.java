package abstraction;

public class Depense extends BagicBot {

	private int de;
	
	

	public void setDe(int de) {
		this.de += de;
	}

	public void status(){
		
		System.out.println("디펜스로봇");
		System.out.println("방어력 : "+this.de);
		super.status();
	}
	
}
