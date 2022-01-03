package chaptor05;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int rand = random.nextInt(3);
		String computer = "";
		String gamer = "";
		String result= "";
		
		switch (rand) {
		case 0:
			computer = "바위";
			break;
		case 1:
			computer = "가위";
			break;

		default:
			computer = "보";
			break;
		}
		
		
		System.out.print("가위 바위 보를 입력하세요: ");
		gamer = scanner.nextLine();
		
		if (gamer.equals("바위")&&computer.equals("가위")||
			gamer.equals("가위")&&computer.equals("보")||
			gamer.equals("보")&&computer.equals("바위") )
			 {
			result = "게이머 승리!";
			
		} else if (
			gamer.equals("가위")&&computer.equals("바위")|| 
			gamer.equals("보")&&computer.equals("가위")||
			gamer.equals("바위")&&computer.equals("보") ) {
		
			result = "인공지능 컴퓨터 승리!";
			
		} else {
			result ="비겼습니다.";
					
		}
		System.out.println("게이머: " + gamer);
		System.out.println("인공지능 컴퓨터: " + computer);
		System.out.println("결과: " + result);
	
		scanner.close();
	}
}
