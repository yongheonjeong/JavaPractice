package ch11;

public class ThrowsEx {

	public static void main(String[] args) throws Exception {
		findClass();
	}

	public static void findClass() throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}
}
