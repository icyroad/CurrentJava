package chapter04;

import java.util.Scanner;

public class Confirm07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			
			int choice = scanner.nextInt();
			
			if (choice==1) {
				System.out.print("예금액> ");
				int saving = scanner.nextInt();
				balance += saving;
			}
			
			if (choice==2) {
				System.out.print("출금액> ");
				int withdraw = scanner.nextInt();
				balance -= withdraw;
			}
			
			if (choice==3) {
				System.out.println("잔액> " + balance);
			}
			
			
			
			
			
			if (choice==4) {
				break;
			}
		}
		System.out.println();
		System.out.println("프로그램 종료");		
		scanner.close();		
	}
}
