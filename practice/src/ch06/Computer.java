package ch06;

public class Computer {

	int sum(int ...values) {
		int sum = 0;
		for(int i=0;i<values.length;i++)
			sum+= values[i];
		return sum;
	}
	
	public static void main(String[] args) {
		
		Computer myCom = new Computer();
		int result1 = myCom.sum(1,2,3);
		System.out.println("result1 : "+result1);
	
		int result2 = myCom.sum(1,2,3,4,5);
		System.out.println("result2 : "+result2);
	
	}
}
