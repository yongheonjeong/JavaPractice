package ch08;

public class InterfaceEx {

	
	public static void main(String[] args) {
	
		//인터페이스는 참조타입으로 이용 가능하다!, 추상메서드 abstract class는 불가능 
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		  
		System.out.println("리모콘 최대 볼륨 : "+RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최저 볼륨 : "+RemoteControl.MIN_VOLUME);
		
		RemoteControl.changeBettery();
	}

}
