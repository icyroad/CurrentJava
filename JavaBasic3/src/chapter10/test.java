package chapter10;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("어떤 수로 나누시겠습니까?: ");
			int num1 = scanner.nextInt();
			System.out.print("어떤 수를 나누시겠습니까?: ");
			int num2 = scanner.nextInt();
			int result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
			scanner.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
