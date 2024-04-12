package ch09;



import ch09.Button.ClickListener;

 class Button {

	 //중첩 인터페이스 - 해당 클래스와 긴밀한 관계를 맺는 구현 객체를 만들기 위해 사용 
	public static interface ClickListener{
		void onClick();
	}
	
	
	//필드
	private ClickListener clickListener;
	
	//메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}


public class ButtonEx {

	public static void main(String[] args) {
		 
		Button btnOk = new Button();
		
		class okListener implements Button.ClickListener{
			
			@Override
			public void onClick() {
				System.out.println("Ok버튼을 클릭했습니다.");
			}
		}
		
		btnOk.setClickListener(new okListener());
		btnOk.click();

		
		class cancelListener implements Button.ClickListener{
			
			@Override
			public void onClick() {
				System.out.println("Cancel버튼을 클릭했습니다.");
			}
		}
		
		btnOk.setClickListener(new cancelListener());
		btnOk.click();
	}

}
