package chaptor05;

import java.util.Iterator;
import java.util.Random;

public class Exercise52_2 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] lottos = new int[45];
		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = i+1;
		}
		
		for (int i = 0; i < lottos.length; i++) {
			int randomIndex = random.nextInt(45);
			int temp = lottos[i];
			lottos[i] = lottos[randomIndex];
			lottos[randomIndex] = temp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(lottos[i] + ", ");
		} 
	}
}
