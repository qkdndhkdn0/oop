package starbucks;

public class Coffee implements Recipe{
	
	private String msg;
	private String option;

	@Override
	public void boilWater() {
		System.out.println("물을 끓여라");
		
	}

	@Override
	public void brew() {
		System.out.println("커피를 내려라");
		
	}

	@Override
	public void pourInCup() {
		System.out.println("물을 컵에 담아라");
		
	}

	@Override
	public void select(int option) {
		if(option==1){
			this.option="밀크";
		}
		else if(option==2){
			this.option="블랙";
		}
		
	}

	@Override
	public void serve() {
		System.out.println("손님 주문하신"+this.option+"커피 나왔습니다");
		
	}



}
