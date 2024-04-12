package ch13;




public class GenericEx {
	
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static <T extends Number> boolean compare(T t1, T t2) {
	System.out.println("compare("+t1.getClass().getSimpleName()
	+ ", " + t2.getClass().getSimpleName()+ ")");
	
	double v1 = t1.doubleValue();
	double v2 = t2.doubleValue();
	
	return (v1==v2);
	}

	public static void main(String[] args) {
//		Box<String> box1 = new Box<>();
//		box1.content = "안녕하세요";
//		String str = box1.content;
//		System.out.println(str);
//		
//		Box<Integer>box2 = new Box<>();
//		box2.content = 100;
//		int value = box2.content;
//		System.out.println(value);
		
//		Product<Tv,String> product1 = new Product<>();
//		
//		product1.setKind(new Tv());
//		product1.setModel("스마트 Tv");
//		
//		Tv tv = product1.getKind();
//		String tvModel = product1.getModel();
//		
//		System.out.println(tv+" "+tvModel);
//		
//		Product<Car,String> product2 = new Product<>();
//		
//		product2.setKind(new Car());
//		product2.setModel("SUV자동차");
//		
//		Car car = product2.getKind();
//		String carModel = product2.getModel();
//		
//		System.out.println(car+" "+carModel);
		
		
//		HomeAgency homeAgency = new HomeAgency();
//		Home home = homeAgency.rent();
//		home.turnOnLight();
//		
//		CarAgency carAgency = new CarAgency();
//		Car car = carAgency.rent();
//		car.run();
		
//		Box<Integer> box1 = boxing(100);
//		int intValue = box1.get();
//		System.out.println(intValue);
//		
//		Box<String> box2 = boxing("홍길동");
//		String strValue = box2.get();
//		System.out.println(strValue);
		 
		boolean result1 = compare(10,20);
		System.out.println(result1);
		System.out.println();
	
		boolean result2 = compare(4.5,4.5);
		System.out.println(result2);
		
		
	}

}
