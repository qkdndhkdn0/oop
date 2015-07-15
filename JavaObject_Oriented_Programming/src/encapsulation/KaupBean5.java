package encapsulation;

import java.util.Scanner;

/*
 * @Date : 2015.07.13
 * @ Author : me
 * @Stroy : 카우푸지수 프로그램을 객체화 하는 예제
 */
public class KaupBean5 {

	private String name,msg;      //멤버필드
	private double height,weight;
	private int idx;
	
	/*
	 * 스캐너가 입력받은 값을 저장하는 메소드가 필요해졌습니다
	 * 이를 setter 메소드라고 합니다.
	 * 그리고 이 setter 메소드는 
	 * set + 멤버필드() 로 이름이 자동 생성된다!!!!!!
	 * setter 는 write 의 의미입니다.
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/*
	   멤버필드에 값을 저장하는 메소드가 setter라면
	   값을 읽어오는 메소드는 getter라고 합니다.
	   getter는 read의 의미입니다.
	   그리고 특별한 상황이 아니라면 파라미터가
	   존재하지 않습니다.
	 */
	
	public int getIdx(){
        
		return idx;
	}
	
	public String getMsg() {
idx = (int) ((weight / (height * height)) * 10000);
		
		if (idx>30) {
			msg="비만";
		}
		else if(idx>24){
			msg="과체중";
		}
		else if(idx>20 && idx<24){
			msg="정상";
		}
		else if(idx>15){
			msg="저체중";
		}
		else if(idx>13){
			msg="마름";
		}
		else{
			msg="영양실조";
		}
		return msg;
	}
	
	@Override
	public String toString() {
		
		String str = ""; //지역변수는 무조건 초기화
		// 연산부
		str ="[" + name + "] 키 :" + height + "cm, 몸무게: " + weight + "kg, 카우푸지수 : " +getMsg();
		// 출력부
		return str ;
	}

}
