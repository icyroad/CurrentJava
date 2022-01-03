package chapter10;

import java.util.Random;
import java.util.Scanner;

public class ThrowExample2 {
	public static void main(String[] args) throws Exception {
		Random random = new Random();
		int ranNum = random.nextInt(10)+1;
		
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		if (inputNum >10 || inputNum <0) {
			//잘못된 입력입니다.
			throw new Exception("잘못된 입력입니다.");
		}
		
		if (ranNum==inputNum) {
			System.out.println("정답입니다.");
		}
	}
}
