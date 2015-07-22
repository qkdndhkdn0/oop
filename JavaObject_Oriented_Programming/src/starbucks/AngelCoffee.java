package starbucks;

public class AngelCoffee extends DrinkRecipe{

	private String option;
	
	@Override
	void brew() {
		System.out.println("커피를 내린다");
		
	}

	@Override
	void select(int option) {
		if(option==1){
			this.option="밀크";
		}
		else if(option==2){
			this.option="블랙";
		}
		
	}

	@Override
	void serve() {
		System.out.println("손님 주문하신 "+this.option+"커피 나왔습니다");
		
	}

	
}
