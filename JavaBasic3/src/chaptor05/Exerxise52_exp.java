package chaptor05;

import java.util.Iterator;
import java.util.Random;

public class Exerxise52_exp {
	public static void main(String[] args) {
		int[] lottos = new int[45];
		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = i+1;
		}
		
		Random random = new Random();
		for (int j = 0; j < lottos.length; j++) {
			int randomIndex = random.nextInt(45);
			int temp = lottos[j];
			lottos[j] = lottos[randomIndex];
			lottos[randomIndex] = temp;
		}
		
		
		for (int i = 0; i < 6; i++) {
			System.out.print(lottos[i] + ", ");
		}
	}
}
