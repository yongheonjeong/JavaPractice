package ch13;

public class CarAgency implements Rentable<Car>{
	public Car rent() {
		return new Car();
	}
}
