package abstraction;

public class RobotMain {

	public static void main(String[] args) {
		/*
		 GunRobot
		 ShieldRobot
		 
		 출력 
		 건로봇은 속도 10, 에너지는 10, 공격력은 50
		 - 공격력은 인스턴스 변수로 int attackPoint
		 쉴드 로봇은 속도는 20, 에너지는 20, 방어력은 50
		 - 방어력은 인스턴스 변수로 int shieldPoint
		 * */
		
		Attack GunRobot = new Attack();
		GunRobot.charge(10);
		GunRobot.run(10);
		GunRobot.setAt(50);
		
		Depense ShieldRobot = new Depense();
		ShieldRobot.charge(20);
		ShieldRobot.run(20);
		ShieldRobot.setDe(50);
		
		//GunRobot.status();
		//ShieldRobot.status();
		Robot[] robots = new Robot[2];
		robots[0] = GunRobot;
		robots[1] = ShieldRobot;
		
		//확장된 폴문
		
		for(Robot robot : robots){
			robot.status();
		}
		

	}

}
