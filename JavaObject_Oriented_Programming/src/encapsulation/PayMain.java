package encapsulation;

import java.util.Scanner;
/*
 * [오더]
 * Pay 프로그램은 월급을 입력 받아서
 * 세금을 떼고 실급여를 고객에게
 * 알려주는 프로그램.
 * 세율은 10%
 * 출력문은 
 * [홍길동 실급여]
   월급 : 100만원
 * 세금 : 10만원
 * 실급여 : 90만원
 */
public class PayMain {

	public static void main(String[] args) {
		String name ="";
		int sal=0,tax=0,don=0;
		Scanner scan = new Scanner(System.in);
		PayBean pay = new PayBean();
		
		System.out.println("이름 :");
		name=scan.next();
		System.out.println("월급 :");
		sal=scan.nextInt();
		
		pay.setName(name);
		pay.setSal(sal);
		pay.getTax();
		pay.getDon();
		
		System.out.println(pay.getName());
		
		System.out.println(pay.toString());
		//pay.Display();
		

	}

}
