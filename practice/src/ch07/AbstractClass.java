package ch07;


abstract class  Phone{
	String owner;
	
	Phone(String owner){
		this.owner = owner;
	}
	
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}

class Smartphone extends Phone{
	
	Smartphone(String owner){
		super(owner);
	}
	
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}

//추상 클래스는 작접 객체로 생성할 수 없다. 
// 상속해서 구현한 후에 자식 객체로 인스턴스를 생성하여야 한다.

public class AbstractClass {

	public static void main(String[] args) { 
		
		Smartphone smp = new Smartphone("홍길동");
		
		smp.turnOn();
		smp.internetSearch();
		smp.turnOff();

	}

}
