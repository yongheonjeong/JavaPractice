package ch06;

public class Singleton {

	
	private static Singleton singleton = new Singleton();
	// 객체 생성하기 
	
	private Singleton() {
	 //private 제한자로 외부 생성 막기 	
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
 
}
