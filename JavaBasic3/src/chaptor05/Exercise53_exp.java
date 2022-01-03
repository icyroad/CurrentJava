package chaptor05;

import java.util.Random;
import java.util.Scanner;

public class Exercise53_exp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위바위보게임");
		Random random = new Random();
		String[] comArr = {"가위", "바위", "보"};
		String computer = comArr[random.nextInt(3)];
		
		System.out.println("플레이어: ");
		String player = scanner.next();
		String result = "";
		
	}
}
