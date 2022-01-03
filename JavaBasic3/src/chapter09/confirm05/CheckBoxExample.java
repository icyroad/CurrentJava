package chapter09.confirm05;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setListener(new BackgroundChangeListener());
		checkBox.select();
	}
}
