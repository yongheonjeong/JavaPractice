package ch07;



class Parent{
	
	public String field1;
	
	public void method1() {
		System.out.println("Parent-method1()");
	}
	
	public void method2() {
		System.out.println("Parent-method2()");
	}
}


class Child extends Parent{
	public String field2;
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}
public class TypeCasting {

	public static void main(String[] args) {
		 //객체 생성 및 자동 타입 변환
		
		Parent parent = new Child();
		
		//Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		
		//강제 타입 변환, Instanceof 
		System.out.println(parent instanceof Child);
		Child child = (Child)parent;
		
		child.field2 = "data2";
		child.method3();
		
		//자식객체를 부모를 참조하는 변수로 선언하고 
		//다시 자신을 참조하는 변수로 캐스팅할때 강제캐스팅을 할 수 있다.
	}

}
