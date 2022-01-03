package chapter10;

public class CompiletimeException {
	public static void main(String[] args) {
		try {
			Class.forName("java.lnag.String"); //오타가 발생할 수 있으니 오타가 나온다면 예외처리하라
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
//			System.err.println("클래스가 존재하지 않습니다.");  syse 자동완성
		}
	}
}
