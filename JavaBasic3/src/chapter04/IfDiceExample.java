package chapter04;

import java.util.Random;

public class IfDiceExample {
	public static void main(String[] args) {
		Random random = new Random(51);
		int ranNum1 = random.nextInt(6) + 1;  //1부터 6까지
		int ranNum2 = random.nextInt(6) + 1;  //1부터 6까지
		int ranNum3 = random.nextInt(6) + 1;  //1부터 6까지
		int ranNum4 = random.nextInt(6) + 1;  //1부터 6까지
		int ranNum5 = random.nextInt(6) + 1;  //1부터 6까지
		int ranNum6 = random.nextInt(6) + 1;  //1부터 6까지
		System.out.println(ranNum1);
		System.out.println(ranNum2);
		System.out.println(ranNum3);
		System.out.println(ranNum4);
		System.out.println(ranNum5);
		System.out.println(ranNum6);
	}
}
