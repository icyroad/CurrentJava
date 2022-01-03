package chaptor03;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int no1 = scanner.nextInt();

		System.out.print("두 번째 숫자를 입력하세요 : ");
		int no2 = scanner.nextInt();

		if ((no1 + no2) + Math.abs(no1 + no2) > (no1 + no2) - Math.abs(no1 - no2)) {
			
			System.out.println("큰 수를 작은 수로 나는 몫은 " + 
								no1 / no2 + "이고, " + 
								"나머지는 " + 
								no1 % no2 + "이다.");

		} else {
			
			System.out.println("큰 수를 작은 수로 나는 몫은 " + 
								no2 / no1 + "이고, " + 
								"나머지는 " + 
								no2 % no1 + "이다.");
		}
	}
}
