package chaptor06;

public class SingleTonExample {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if (singleton1 == singleton2) {
			System.out.println("같다");
		}
	}
}

		// 같은 단 하나의 객체를 통해 참조한 값이므로 == 동일하다고 나온다.