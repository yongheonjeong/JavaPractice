package ch14;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sum = new SumThread();
		sum.start();
		try {
			sum.join();
		}catch(InterruptedException e) {}
		
		System.out.println("1~100 합 : "+sum.getSum());
		
	}

}
