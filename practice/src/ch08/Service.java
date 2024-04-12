package ch08;


// private method - 중복 코드 처리하기 

public interface Service {

	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}
	
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드");
	}
	
	
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}
	
	private static void staticCommon() {
		System.out.println("staticMethod 중복 코드");
	}
}
