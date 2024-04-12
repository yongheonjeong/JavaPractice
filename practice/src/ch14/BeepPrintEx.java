package ch14;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
		
		// class implements Runnable 
		//Runnable interface를 구현한 객체 전달 
//		Thread thread= new Thread(new Runnable() {
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				
//				for(int i=0;i<5;i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					}catch(Exception e) {}
//				}
//			}
//		});
		
		//class extends Thread
		//Thread를 자식객체로 구현한 객체 전달 
		Thread thread= new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i=0;i<5;i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					}catch(Exception e) {}
				}
			}
		};

		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
		
	}

}
