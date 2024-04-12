package ch07;



class Vehicle{
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}

class Bus extends Vehicle{
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}

class Taxi extends Vehicle{
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}

class Driver{ //매개변수 다형성 
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}


public class PolymorphismEx {

	public static void main(String[] args) {
		 Driver driver = new Driver();
		 
		 Bus bus = new Bus();
		 driver.drive(bus);
		 
		 Taxi taxi = new Taxi();
		 driver.drive(taxi);

	}

}
