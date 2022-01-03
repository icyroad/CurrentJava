package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("첫번째 숫자:");
				int firstNum = scanner.nextInt();
				System.out.print("두번째 숫자: ");
				int secondNum = scanner.nextInt();
				int result = firstNum + secondNum;
				System.out.printf("결과: %d + %d = %d ", firstNum, secondNum, result);
				break; // 결과까지 출력되면 브레이크로 반복문이 끝나게.
			} catch (InputMismatchException e) {
				System.out.println("입력된 내용이 정수가 아닙니다. 다시 입력하세요.");
				scanner.next(); //nextInt에 남아있는 엔터를 없애는부분
			} 
		}
		scanner.close();
	}
}
