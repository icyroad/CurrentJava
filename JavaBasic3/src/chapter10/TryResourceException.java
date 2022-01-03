package chapter10;

import java.util.Scanner;

public class TryResourceException {
	public static void main(String[] args) {
		
		//블럭지정하고 try-with resource block - 리소스를 사용하고 자동으로 반납까지 해주는 예외처리
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("첫번째 숫자:");
			int firstNum = scanner.nextInt();
			System.out.print("두번째 숫자: ");
			int secondNum = scanner.nextInt();
			int result = firstNum + secondNum;
			System.out.printf("결과: %d + %d = %d ", firstNum, secondNum, result);
		}
		
	
}
}
