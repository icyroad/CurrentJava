package chapter04;

import java.util.Random;

public class Confirm03 {
	public static void main(String[] args) {
		Random random = new Random();
		
		while (true) {
			int eye1 = random.nextInt(6) + 1;
			int eye2 = random.nextInt(6) + 1;
			
			if (eye1 + eye2 == 5) {
				System.out.println("(" + eye1 + ", " + eye2 + ")");
				break;
			}
			
			System.out.println("(" + eye1 + ", " + eye2 + ")");
			
		}
	}
}
