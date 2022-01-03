package chapter09.confirm05;

import chapter09.confirm05.CheckBox.OnSelectListener;

public class BackgroundChangeListener implements OnSelectListener {

	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다.");
	}

}
