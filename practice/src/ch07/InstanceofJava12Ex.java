package ch07;


class Person{
	public String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void walk() {
		System.out.println("걷습니다.");
	}
}

class Student extends Person{
	public int studentNo;
	
	public Student(String name, int studentNO) {
		super(name);
		this.studentNo = studentNo;
	}
	
	public void study() {
		System.out.println("공부를 합니다.");
	}
}

 
public class InstanceofJava12Ex {

	public static void personInfo(Person person) {
		System.out.println("name: "+person.name);
		person.walk();
		
		//Java12 New instanceof 
		if(person instanceof Student student) {
			System.out.println("studentNo: "+student.studentNo);
			student.study();
		}
	}
	   
	public static void main(String[] args) {
		 Person p1 = new Person("홍길동");
		 personInfo(p1);
		 
		 System.out.println();
		 
		 Person p2 = new Student("김길동",10);
		 personInfo(p2);

	}

}
