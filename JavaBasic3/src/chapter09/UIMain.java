package chapter09;

public class UIMain {
	public static void main(String[] args) {
		Button button = new Button();
		button.setOnClickListener(new Button.OnClickListener() {  
		//new OnClickListener 라고 하면 OnClickListener라는 것이 Button에 있는것이기 때문에 앞에 Button. 이라고 붙여줘야 한다.
			
			@Override
			public void onClick() {
				System.out.println("버튼을 클릭했습니다.");
			}
		});
		button.touch();
	}
}
