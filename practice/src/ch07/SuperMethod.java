package ch07;

class Airplane{
	public void land() {
		System.out.println("착륙합니다!");
	}
	
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
	
	public void takeoff() {
		System.out.println("이륙합니다.");
	}
}

class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly(); // 부모 객체의 fly()메서드 실행 
		}
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		 SupersonicAirplane sa = new SupersonicAirplane();
		 sa.takeoff();
		 sa.fly(); // super();
		 sa.flyMode = SupersonicAirplane.SUPERSONIC;
		 sa.fly();
		 sa.land();

	}

}
