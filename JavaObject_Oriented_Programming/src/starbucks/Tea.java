package starbucks;

public class Tea implements Recipe {
private String option;
	@Override
	public void boilWater() {
		System.out.println("물을 끓인다");
		
	}

	@Override
	public void brew() {
		System.out.println("티백을 내린다");
		
	}

	@Override
	public void pourInCup() {
		System.out.println("물을 컵에 붓는다");
		
	}

	@Override
	public void select(int option) {
		if(option == 3){
			this.option = "레몬티";
		}
		else if(option == 4){
			this.option = "자몽티";
		}
		
	}

	@Override
	public void serve() {
		System.out.println("손님 주문하신 "+this.option+" 나왔습니다.");
		
	}

}
