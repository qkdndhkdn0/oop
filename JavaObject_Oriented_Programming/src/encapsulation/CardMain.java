package encapsulation;

import java.util.Scanner;

public class CardMain {
	
	public static void main(String[] args) {
		/*
		 [오더]
		 카드 두장을 비교해서 카드 번호가
		 더 큰 수가 이기는 게임프로그램을 작성하시오.
		 일단, 프로토타입(시제품) 프로그램으로
		 개발자가 임의의 숫자를 입력하면
		 [출력]
		 [홍길동] : 7 vs [김유신 : 3 ]
		 */
		String name =" ", name2="";
		int card =0,card2=0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력");
		name =scan.next();
		System.out.println("이름을 입력");
		name2 =scan.next();
		
		CardBean3 hong = new CardBean3(name, card);
		CardBean3 kim =  new CardBean3(name2, card2);
		
		System.out.println();

	}

}
