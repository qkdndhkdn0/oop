package abstraction;

public class Orange implements FruitsInterface {

	@Override
	public void display(String str) {
		System.out.println(str + " 오렌지 입니다.");
		
	}
	
	public int count(){ //int는 리턴타입
		// 리턴타입이 void가 아니라면
		// 반드시 return 키워드를 사용해야한다.
		// return 타입이 존재한 때 코딩하는 방법
		// 1.return 타입의 지역변수를 초기화 한다
		// 2.return 키워드 뒤에 지역변수를 둔다.
		int count = 100;
		
		return count;
	}

}
