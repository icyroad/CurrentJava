package chapter04;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int ran1 = random.nextInt(100) +1;
		int times = 0;
		while (true) {
			
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			int choice1 = scanner.nextInt();
			times ++;
			
			if (ran1 > choice1) {
				System.out.println("정답은 더 큰 수입니다.");
			}
			
			if (choice1 > ran1) {
				System.out.println("정답은 더 작은 수입니다.");
			}
			
			if (ran1 == choice1) {
				System.out.println("정답입니다." + "("+ times + "회 걸림.)");
				break;
			}
		}
		System.out.println("게임을 종료합니다.");
	scanner.close();
	}
}

