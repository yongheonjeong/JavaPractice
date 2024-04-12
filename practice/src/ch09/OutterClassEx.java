package ch09;

import ch09.OutterClass.InstanceMember;

class OutterClass {
	
	int otfield1 = 0;
	void otmethod1() {}
	
	static int otfield2 = 0;
	static void otmethod2() {}
	
	int field = 0;
	void method() {}

	//인스턴스 멤버 클래스 
	class InstanceMember{
	
		
		int field1 = 1;
		static int field2 = 2;
		
		int field = 1;
		void method() {}
		
		InstanceMember(){
			System.out.println("InstanceMember 생성자 실행");
			
			otfield1=1;
			otmethod1();

		}
		
		void method1() {
			System.out.println("InstanceMember-method1 실행");
			
			//OutterClass와 내부 클래스 이름이 같을때 구분해서 사용하는 법 
			System.out.println(this.field);
			System.out.println(OutterClass.this.field);
			OutterClass.this.method();
		}
		
		static void method2() {
			System.out.println("static InstanceMember-method2 실행");
		}
	}
	
	

	public void useInstanceMember() {
		InstanceMember im = new InstanceMember();
		System.out.println(im.field1);
		im.method1();
		
		System.out.println(InstanceMember.field2);
		InstanceMember.method2();
	}
	
	
	
	//정적 멤버 클래스 
	  static class StaticMemberClass{
		
		int field1= 1;
		
		static int field2 = 2;
		
		
		StaticMemberClass(){
			System.out.println("StaticMemberClass 실행");
			otfield2 = 1;
			otmethod2();
		}
		
		void method1() {
			System.out.println("StaticMember-method1 실행");
		}
		
		static void method2() {
			System.out.println("StaticMember-method2 실행");
		}
		
	}
	
	  //정적 멤버클래스는 static field, method 선언및 사용 가능 
	StaticMemberClass field1 = new StaticMemberClass();
	static StaticMemberClass field2 = new StaticMemberClass();
	
	OutterClass(){
		StaticMemberClass sm = new StaticMemberClass();
	}
	
	void method1() {
		StaticMemberClass sm = new StaticMemberClass();
	}
	
	static void method2() {
		StaticMemberClass sm = new StaticMemberClass();
	}
	
	
	//로컬 클래스 
	 void useLocalClass() {
		 
		 class LocalClass{
			  
			 //로컬클래스에 선언된 변수는 final 변수이다. 
			 int field1 =1;
			 
			 static int field2 = 2;
			 
			 LocalClass(){
				 System.out.println("LocalClass-생성자 실행");
			 }
			 
			 void method1() {
					System.out.println("LocalClass-method1 실행");
				}
				
				static void method2() {
					System.out.println("Static LocalClass-method2 실행");
				}
		 }
		 
		 LocalClass lc = new LocalClass();
		 
		 System.out.println(lc.field1);
		 lc.method1();
		 
		 System.out.println(LocalClass.field2);
		 LocalClass.method2();
	 }
	
	 

}

public class OutterClassEx {

	public static void main(String[] args) {
		 
		OutterClass ot = new OutterClass();
		
		ot.useInstanceMember();
		
		System.out.println();
		
		//객체 생성 및 접근
		OutterClass.StaticMemberClass obj = new OutterClass.StaticMemberClass();
		System.out.println(obj.field1);
		obj.method1();
		

		System.out.println();
		
		//StaticMemberClass 정적 필드 및 메소드 사용 
		System.out.println(OutterClass.StaticMemberClass.field2);
		OutterClass.StaticMemberClass.method2();
		

		System.out.println();
		
		// LocalClass 
		ot.useLocalClass();
	}

}
