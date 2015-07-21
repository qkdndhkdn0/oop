package abstraction;
/*
 	인터페이스인 Product를 구현한 클래스
 */
public class ProductSpec implements Product {
	/*=== 필드 ===*/
	private String company;  // 제조사
	private String name;    // 제품명
	private String serialNo;// 시리얼 넘버
	/*=== 생성자 ===*/
	/*=== 멤버메소드 ===*/
	@Override
	public void showInfo() {
		System.out.println("제조사 : "+this.company);
		System.out.println("제품명 : "+this.name);
		System.out.println("시리얼 넘버 : "+this.serialNo);
		
	}
	@Override
	public void writeInfo(String company, String name, String serialNo) {
		this.company = company; //청색: 인스턴스변수, 밤색: 파라미터에서 넘어온 지역변수
		this.name = name;
		this.serialNo = serialNo;
		
	}

	

}
