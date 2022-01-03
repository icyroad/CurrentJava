package chaptor08;

public interface Animal {

	//interface== abstract class
	//대신에 interface는 데이터를 저장하는 필드는 없다.
	//인터페이스는 필드는 없는데, 그냥 만들어보면 상수가 된다.
	//final static이 생략된거라고 보면 된다.
	
	
	String USER_NAME="홍";
	void breath();  // public abstract가 앞에 생략되어있다.
	
}
