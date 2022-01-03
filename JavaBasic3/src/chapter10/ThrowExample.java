package chapter10;

public class ThrowExample {
	public static void main(String[] args) throws Exception {
		
		//메소드에서 떠넘겼기 때문에 실제로 실행하는 이부분에서 try catch예외처리를 해줘야됨
		//만약에 여기 메인메소드에서도 떠넘기면 jvm이 처리함.
		try {
			findClass("chapter01.Hello");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	static void findClass(String className) throws Exception {
		Class.forName(className);
	}
}
