package ch06;


class Television{
	static String company="My Company";
	static String model="LCD";
	static String info;
	
	static {
		info = company+"-"+model;
	}
}
public class StaticBlock {

	public static void main(String[] args) {

		System.out.println(Television.info);
	}

}
