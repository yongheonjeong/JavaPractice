package ch11;

public class ExceptionHandlingEx {
	
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수 : " + result);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("마무리 실행\n");
		}
	}

	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		printLength("This is java");
		printLength(null);
		System.out.println("프로그램 종료");
		
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String.클래스가 존재");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		
		String[] array = {"100","1oo"};
		
		for(int i=0;i<=array.length;i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array["+i+"]: "+value);
			}catch(NumberFormatException | ArrayIndexOutOfBoundsException e) {
				System.out.println("데이터 문제 있어: "+e.getMessage());
			}catch(Exception e) {
				System.out.println("실행에 문제가 있습니다!");
			}
		}
	}

}

// catch 구문은 순서대로 실행되므로 하위 클래스 catch 블록을 먼저 작성하고  
// 상위 클래스 catch 블록을 나중에 작성해야 한다.
