package chaptor05;

import java.util.Random;
import java.util.Scanner;

public class Exercise53_2 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int ranNum = random.nextInt(3);
		String computer = "";
		
		switch (ranNum) {
		case 0:
			computer = "가위";
			break;
		case 1:
			computer = "바위";
			break;

		default:
			computer = "보";
			break;
		}
		
		System.out.print("가위 바위 보를 입력하세요:");
		String player = scanner.nextLine();
		System.out.println("게이머: " + player);
		System.out.println("인공지능 컴퓨터: " + computer);
		
		if (player.equals(computer)) {
			System.out.println("비겼습니다.");
		} else if (player.equals("가위")&&computer.equals("보")|| 
				   player.equals("바위")&&computer.equals("가위")||
				   player.equals("보")&&computer.equals("바위")) {
			System.out.println("게이머 승리!");
		} else {
			System.out.println("인공지능 컴퓨터 승리!");
		}
		
	}
}
