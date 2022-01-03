package chapter04;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임");
		System.out.print("철수 : ");
		String str1 = scanner.nextLine();
		System.out.print("영희 : ");
		String str2 = scanner.nextLine();
		
		if (str1.equals("가위") && str2.equals("바위") ) {
			System.out.println("영희 승리!");
		}
		else if (str1.equals("가위") && str2.equals("보")) {
			System.out.println("철수 승리!");
			
		}
		else if (str1.equals("바위") && str2.equals("가위")) {
			System.out.println("철수 승리!");
			
		}
		else if (str1.equals("바위") && str2.equals("보")) {
			System.out.println("영희 승리!");

		}
		else if (str1.equals("보") && str2.equals("가위")) {
			System.out.println("철수 승리!");

		}
		else if (str1.equals("보") && str2.equals("바위")) {
			System.out.println("철수 승리!");

		}
		else {
			System.out.println("비겼습니다!");
		}
		scanner.close();
	}
}