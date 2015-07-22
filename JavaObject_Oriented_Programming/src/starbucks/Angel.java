package starbucks;

import java.util.Scanner;

public class Angel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		AngelCoffee kim = new AngelCoffee();
	//	System.out.println("밀크 커피는 1번, 2번은 블랙커피 입니다. 골라주세요");
		//kim.prepare(scan.nextInt());
		
		AngelTea lee = new AngelTea();
		System.out.println("레몬티는 3번, 4번은 자몽티 입니다. 골라주세요");
		lee.prepare(scan.nextInt());

	}

}
