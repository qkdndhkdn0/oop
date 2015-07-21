package inheritance;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Phone phone = new Phone();
		//클래스 이름 인스턴스(객체) = new 생성자 ;
		// 인스턴스를 생성하는 이유는 ? 메소드 호출
		phone.setConpany("삼성가정용 전화기");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("전화 걸 사람 : ");
		phone.setCall(scan.next());
		System.out.println(phone.getConpany()+" 를 사용해서...");
		System.out.println();
		/*
		 [콘솔 출력문]
		 삼성 가정용 전화기를 사용해서
		 홍길동에게 전화를 검
		 */
		
		System.out.println(phone.getCall());
		
		
		
	}

}
