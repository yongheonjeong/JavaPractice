package ch06;


/*
 * static method,block 에서는 인스턴스 멤버를 바로 사용할 수는 없다.
 * */
class Car{
	int speed;
	void run() {
		System.out.println(speed+" 으로 달립니다.");
	}
	
	static void simulate() { //static method, 인스턴스 멤버를 사용하기 위해서는
							//객체를 생성하여야 한다 
		Car myCar = new Car();
		myCar.speed = 200;
		myCar.run();
	}
}

public class StaticMethod {

	public static void main(String[] args) {

		Car.simulate();
	}

}
