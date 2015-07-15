package encapsulation;

public class CardBean2 {
	
	private String name,name2;  //멤변은 초기화 하지 않는다.
	private int card,card2;
	
	
	public void setName(String name) { //()안에 값을 파라미터라하고 소속은 지역변수이다
		this.name = name;
		//this.name 은 인스턴스변수(멤버변수)이고
		// = name 은 파라미터로 넘어온 지변(스캐너가 받은 값)
		//스캐너가 받아 논 값을 가진 지변 값을
		//멤변 name에 할당하라.
		//파라미터 값과 멤버변수값의 이름은 달라도 상관없다.
		//단 데이터타입( 스트링,인트 ) 은 반드시 일치하여야 한다.
	}
	
	public void setCard() {
		//외부에서 받는 숫자가 없으므로 파라미터가 필요없다.
		this.card = (int) ((Math.random()*13)+1);
		//1부터 13까지의 정수 중에서 랜덤 숫자를 리턴
	}
	
	
	public void setName2(String name2) {
		this.name2 = name2;
	}
	
	public void setCard2() {
		this.card2 = (int) ((Math.random()*13)+1); //13까지 시작값은 1
	}
	
	public String getWinner() {  //메인에서 받지않는 즉 스캐너에서 받지 않는 것은 GET으로 연산한다
		//getter 에서 문제해결 패턴
		//제일먼저 리턴타입을 카피
		String winner="";
		if (this.card>this.card2) {
			winner = name+"승리";
		}else if(this.card2>this.card){
			winner =name2+"승리";
		}else{
			winner = "비김";
		}
		return winner;
	}
	
	
	@Override
	public String toString() {
		
		return "["+name+" : "+card+"]"+" vs "+"["+name2+" : "+card2+"]"+"\n"+this.getWinner() ;
	}

}
