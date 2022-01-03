package chapter09.confirm03;

public class CheckBox {
	OnSelectListener listener;
	
	void setOnselectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.Onselect();
	}
	
	
	
	
	static interface OnSelectListener {
		void Onselect();
	}
}
