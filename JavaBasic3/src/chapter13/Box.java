package chapter13;

public class Box<T> {
	private T value;
//	private Object value;
	//필드의 타입을 Object로 선언하면 모든 타입의 데이터를 담을 수 있다.
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
