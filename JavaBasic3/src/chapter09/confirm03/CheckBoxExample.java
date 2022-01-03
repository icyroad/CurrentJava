package chapter09.confirm03;

import chapter09.confirm03.CheckBox.OnSelectListener;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnselectListener(new CheckBox.OnSelectListener() {
			
			@Override
			public void Onselect() {
				System.out.println("배경을 변경합니다.");
			}
		});
		checkBox.select();
	}
}
