package chaptor05;

import java.util.Random;

public class Exercise54 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] diceArray = new int[6];
		
		for (int i = 1; i <= 10000; i++) {
			int dice = random.nextInt(6)+1;
			
			// dice[random.nextInt(6)]++;
			
			switch (dice) {
			case 1:
				diceArray[0] +=1;
				break;
			case 2:
				diceArray[1] +=1;
				break;
			case 3:
				diceArray[2] +=1;
				break;
			case 4:
				diceArray[3] +=1;
				break;
			case 5:
				diceArray[4] +=1;
				break;
			default:
				diceArray[5] +=1;
				break;
			}
		}
		System.out.println("----------------");
		System.out.println("면          빈도");
		System.out.println("----------------");
		System.out.println("1           " + diceArray[0]);
		System.out.println("2           " + diceArray[1]);
		System.out.println("3           " + diceArray[2]);
		System.out.println("4           " + diceArray[3]);
		System.out.println("5           " + diceArray[4]);
		System.out.println("6           " + diceArray[5]);
		
		
	//	for (int i = 0; i < diceArray.length; i++) {
	//		System.out.println(i + "             " + diceArray[i]);
	//	}
	}
}
