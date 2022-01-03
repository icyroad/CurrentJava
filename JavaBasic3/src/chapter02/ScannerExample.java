package chapter02;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		String a = "1";
		Scanner scanner = new Scanner(System.in);
		int intValue = scanner.nextInt();
		System.out.println("입력된 숫자: " + intValue);
		String strValue = scanner.next();
		System.out.println("입력된 문자: " + strValue);
		
	}
}
