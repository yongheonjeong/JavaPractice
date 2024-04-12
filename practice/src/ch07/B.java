package ch07;

import ch06.A;

/*
 * ch06 - A.class protected 
 * 
 * */

public class B extends A {
	public B() {
		super(); //생성자 A호출
	}
	
	public void method1() {
		this.field = "value";
		this.method();
	}
	
	public void method2() {
//		A a = new A();
//		a.field = "Value";
//		a.method(); 
		
		// 객체를 직접 생성하는 것은 안됨 
		// method1()과 같이 상속받은 멤버를 사용해야함
	}
}
