package inhebitance;
/*
   객체지향 프로그래밍 언어 4대특징 (2)상속
   -extends 라는 키워드로 부모역할을 하는 클래스를 선언하면
   -자식클래스는 부모클래스의 자산(필드와 메소드)를 따로 선언하지않아도
   	사용하게 된다.
 */

public class CelPhone extends Phone { //상속
	/*------필드--------*/
	private boolean portable; //이동이 가능한지 여부
	private String move; //가지고 다니는 상황을 표시
	/*------생성자------*/
	/*------멤버메소드------*/

	public boolean isPortable() { 
		
		return portable;
	}
	//if-else로 참, 거짓을 판별하는 알고리즘을 구현하려면
	//파라미터로 들어오는 값이 있어야 그 값에 대한 판별을 할것이므로
	// 이 상황에서는 set에 구현한다.
	
	public void setPortable(boolean portable) {
		//boolean타입의 getter일 경우에는 get 대신 is*()방식으로 자동 생성된다
		//이 경우는 반드시 리턴타입의 지변을 선언하고 if-else 알고리즘을 구현해야 한다.
		if (portable) { //portable이 true 라면
			this.setMove("폰을 가지고 다닐수 있음");
		} else {
			this.setMove("폰을 가지고 다닐수 없음");
		}
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}
	
}
