package chapter10;

public class MultiCatchExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("결과: " + result);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("잘못된 입력입니다.");
			//배열 타입의 예외처리 따로
			//int 타입의 예외처리를 따로 각각 하고/    / 잘못된입력입니다 라는 부분이 겹치니까 이렇게 합쳐서도 할수있음.
		} catch (Exception e) {
			//여기서는 나머지 경우를 한번에 예외처리(Exception은 맨 마지막 순서로 하자)
		}
	}
}
