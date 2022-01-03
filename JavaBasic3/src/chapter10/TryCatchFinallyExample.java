package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("첫번째 숫자:");
			int firstNum = scanner.nextInt();
			System.out.print("두번째 숫자: ");
			int secondNum = scanner.nextInt();
			int result = firstNum + secondNum;
			System.out.printf("결과: %d + %d = %d ", firstNum, secondNum, result);
			/*아예 메인메소드 안에 있는 내용을 한꺼번에 try catch로 감싸버리면
			*가독성'은' 좋아진다
			*다만 어디서 오류가 난건지는 조금 파악하기 힘들어질지도
			*중간에 오류가 난 지점에서 캐치하기 때문에 그 아래 부분은 실행되지 않는다.
			*근데 아래 있는거 중에 얘는 무조건 실행해야된다. 싶은것은 finally 안에 넣는다.
			*/
			
		} catch (InputMismatchException e) {
			System.out.println("입력된 내용이 정수가 아닙니다.");
		} finally {
			scanner.close();								
			
		}
	}
}
