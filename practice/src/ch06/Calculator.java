package ch06;

public class Calculator {

	static double pi = 3.14;
	
	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width,double height) {
		return width * height;
	}
	
	static int plus(int x,int y) {return x+y;}
	
	public static void main(String[] args) {
		 
		Calculator myCalcu = new Calculator();
		
		double result1 = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 = "+result1);
		System.out.println("직사각형 넓이 = "+result2);
		
		int result = Calculator.plus((int)result1, (int)result2);
		System.out.println(result);

	}

}
