package chapter02;

import java.util.Scanner;

public class Exercise25_한찬길 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원짜리 동전의 갯수: ");
		String won500 = scanner.nextLine();
		
		System.out.print("100원짜리 동전의 갯수: ");
		String won100 = scanner.nextLine();
		
		System.out.print("50원짜리 동전의 갯수: ");
		String won50 = scanner.nextLine();
		
		System.out.print("10원짜리 동전의 갯수: ");
		String won10 = scanner.nextLine();
		
		int totalWon = Integer.parseInt(won500) * 500 + 
				       Integer.parseInt(won100) * 100 + 
				       Integer.parseInt(won50) * 50 + 
				       Integer.parseInt(won10) * 10;
		
		System.out.print("저금통 안의 동전의 총 액수: " + totalWon);
		
	}
}
