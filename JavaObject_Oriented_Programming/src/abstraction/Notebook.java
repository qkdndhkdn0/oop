package abstraction;

public class Notebook extends ProductSpec{

	private String cpu;
	private String ram;
	private String hdd;
	
	
	public void writeInfo(String company, String name, String serialNo,String cpu,String ram,String hdd) {
		
		super.writeInfo(company, name, serialNo);
		this.cpu =cpu;
		this.ram =ram;
		this.hdd = hdd;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("CPU 정보 : "+this.cpu);
		System.out.println("메모리 정보 : "+this.ram);
		System.out.println("하드디스크 정보 : "+this.hdd);
	}

}
