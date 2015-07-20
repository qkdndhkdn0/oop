package encapsulation;

public class Dice {
	/*====== Field ========*/ 
	 	private int num; // 주사위는 한나의 숫자만 갖는다 
	 /*====== Constructor ========*/ 
	 	// 생성자 단축키 CTRL + SPACE 
	 	public Dice() { 
	 		this.num = (int) ((Math.random()*6)+1); 
	 	} 
	 	 
	 	 
	 /*====== MemberMethod ========*/ 
	 	public int getNum() { 
	 		return num; 
	 	} 


}
