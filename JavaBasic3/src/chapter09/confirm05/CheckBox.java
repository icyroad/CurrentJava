package chapter09.confirm05;

public class CheckBox {
	OnSelectListener listener;
	
	public void setListener(OnSelectListener listener) {
		this.listener = listener;
	}

	void select() {
		listener.onSelect();
	}

	static interface OnSelectListener{
		void onSelect();
	}
}
