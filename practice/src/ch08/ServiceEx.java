package ch08;



class ServiceImpl implements Service{
	
}

public class ServiceEx {

	public static void main(String[] args) {

		Service service = new ServiceImpl();
		
		service.defaultMethod1();
		service.defaultMethod2();
		
		Service.staticMethod1();
		Service.staticMethod2();
	}

}
