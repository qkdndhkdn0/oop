package encapsulation;

import java.util.Scanner;

public class KaupMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "", msg = "";
		double height = 0.0d, weight = 0.0d;
		int idx = 0; // 카우푸 인덱스

		// 연산부
		System.out.println("이름을 입력하세요");
		name =scan.next();
		System.out.println("키를 입력하세요");
		height =scan.nextInt();
		System.out.println("몸무게 입력하세요");
		weight = scan.nextInt();
		
		KaupBean4 kaupbean = new KaupBean4();
		kaupbean.setName(name);
		kaupbean.setHeight(height);
		kaupbean.setWeight(weight);
		kaupbean.getIndex();
		
		//출력부
		
		System.out.println(kaupbean.toString());
		
	}

}
