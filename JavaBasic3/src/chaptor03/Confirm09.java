package chaptor03;

import java.util.Scanner;

public class Confirm09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		double no1= scanner.nextDouble();
		
		System.out.print("두 번째 수: ");
		double no2 = scanner.nextDouble();
		
		String result = (no2 != 0.0) ? 
						String.valueOf(no1 / no2) :
						"무한대";
		
		System.out.println("결과: " + result);
	}
}
