package ch08;


//interface는 접근지정자로 public or default 
public interface RemoteControl {
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	
	//default method 상수 필드를 읽거나 추상 메서드를 호출할 수 있다.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	
	
	//static method - 구현 객체 없이 인터페이스명으로 접근해서 호출 가능
	static void changeBettery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
	
}


//field는 final static public 생략, 메소드는 public abstract 생략 