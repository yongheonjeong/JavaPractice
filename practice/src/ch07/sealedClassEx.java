package ch07;


//sealed - permits에 해당되는 클래스만 Person을 상속받을 수 있음
sealed class Person permits Employee,Manager{
	public String name;
	
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}
}

//final 더이상 상속할 수 없음
final class Employee extends Person{
	
	@Override
	public void work() {
		System.out.println("제품을 생산합니다.");
	}
}


//non-seald 봉인해제, Manager클래스를 상속할 수 있음 
 non-sealed class Manager extends Person{
	
	@Override
	public void work() {
		System.out.println("생산 관리를 합니다.");
	}
}
 
//final, non-sealed, sealed를 정의해서 상속하는 클래스를 구현해야함

class Director extends Manager{
	
	@Override
	public void work() {
		System.out.println("제품을 기획합니다.");
	}
}


public class sealedClassEx {

	public static void main(String[] args) {
		 Person p = new Person();
		 Employee e = new Employee();
		 Manager m = new Manager();
		 Director d = new Director();
		 
		 p.work();
		 e.work();
		 m.work();
		 d.work();
	}

}
