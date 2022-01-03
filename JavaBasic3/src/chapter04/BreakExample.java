package chapter04;

import java.util.Random;

public class BreakExample {
	public static void main(String[] args) {
	Random random = new Random();
	
		while (true) {
			int ran1 = random.nextInt(6) + 1;
			System.out.println(ran1);
			if (ran1 == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
