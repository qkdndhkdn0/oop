package starbucks;

import java.util.Scanner;

public class Starbucks {

	public static void main(String[] args) {
		/*
		 인터페이스를 구현한 클래스의 객체 생성문법
		 인터페이스 인스턴스 = new 생성자();
		 * */
		
		
		Recipe coffee = new Coffee();
		
		Scanner scan = new Scanner(System.in);
		
		coffee.boilWater();
		coffee.brew();
		coffee.pourInCup();
		System.out.println("밀크 커피는 1번, 2번은 블랙커피 입니다. 골라주세요");
		coffee.select(scan.nextInt());
		
		coffee.serve();
		System.out.println("");
		
		Recipe tea = new Tea();
		
		tea.boilWater();
		tea.brew();
		tea.pourInCup();
		System.out.println("레몬티는 3번, 4번은 자몽티 입니다. 골라주세요");
		tea.select(scan.nextInt());
		
		tea.serve();
		
		
		/*
		 홍차 끓이는 순서
		 1. 물을 끓인다
		 2. 티백을 내린다
		 3. 물을 컵에 붓는다.
		 4. 레몬, 자몽 첨가 여부를 손님에게 묻는다
		  - 레몬 : 레몬티 , 자몽 : 자몽티
		 5. 홍차를 제공한다
		  -고객님 레몬티가 나왔습니다.
		 */

	}

}
