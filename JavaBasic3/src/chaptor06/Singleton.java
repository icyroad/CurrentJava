package chaptor06;

public class Singleton {
	
	private static Singleton instance = new Singleton();
        //2 외부에서는 못하니까 클래스 내부에서 new를 통해 객체를 딱 하나만 만듦
	    //3 처음에 자바가 실행될때 등록되어서 사용할 수 있게 되도록 static을 부여함
	    //4 static이니까 필드에 직접 접근하는걸 막기 위해 private를 붙이고 메소드를 하나 만듦
	private Singleton() {
		//1 생성자를 private로 설정해서 외부에서 객체를 못만들게 한다.
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	    /*5 하나의 객체만 만드는 것이 목적이기 때문에, 데이터를 입력하는 setter는 
	    /// 하지 않는다 (그러려면 객체가 하나 더 만들어지고 거기에 데이터가 들어갈거기 때문)
	    //거기에다 생성자에 private이 붙어있기 때문에 외부에서 객체를 만드는게 불가능하므로 
	      getter만 만들어서 불러오기만 함 */
	    //6 얘도 new 안하고 메소드 사용할 수 있게 하려고 static 부여함
}
