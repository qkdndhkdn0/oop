package starbucks;
/*
 extends 는 컨트롤 + 스페이스로
 @Override 를 호출하라고 했는데..
 그것은 extends 클래스가 일반클래스인 경우리고
 추상클래스는 일반클래스 + 인터페이스 형태이므로
 인터페이스의 특징을 갖게 됩니다.
 따라서, extends이지만 부모클래스가 추상클래스라면
 unimplements 를 해줘야 합니다
 * */

public class AngelTea extends DrinkRecipe {

	private String option;
	@Override
	void brew() {
		System.out.println("티백을 내린다");
		
	}

	@Override
	void select(int option) {
		if(option == 3){
			this.option = "레몬티";
		}
		else if(option == 4){
			this.option = "자몽티";
		}
		
	}

	@Override
	void serve() {
		System.out.println("손님 주문하신 "+this.option+" 나왔습니다.");
		
	}

}
