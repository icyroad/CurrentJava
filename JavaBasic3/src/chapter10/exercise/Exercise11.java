package chapter10.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		try {
			System.out.print("어떤 수로 나누시겠습니까?: ");
			int num1 = scanner.nextInt();
			System.out.print("어떤 수를 나누시겠습니까?: ");
			int num2 = scanner.nextInt();
			int result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
			
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				scanner.next();
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
			} 
		}
		scanner.close();
	}	
}
