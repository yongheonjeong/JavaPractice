package ch09;

interface RemoteControl{
	void turnOn();
	void turnOff();
}

class Home{
	
	private RemoteControl rc = new RemoteControl(){
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		public void turnOff() {
			
		}
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use2() {
		RemoteControl rc = new RemoteControl(){
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
			}
		};		
			rc.turnOn();
			rc.turnOff();
	}
	
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}

public class HomeEx {

	public static void main(String[] args) {
		 
		Home home = new Home();
		
		home.use1();
		home.use2();
		home.use3(new RemoteControl() {
			public void turnOn() {
				System.out.println("난방을 켭니다.");
			}
			
			public void turnOff() {
				System.out.println("난방을 끕니다.");
			}
		});

	}

}
