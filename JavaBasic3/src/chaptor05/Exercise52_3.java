package chaptor05;

import java.util.Iterator;
import java.util.Random;

public class Exercise52_3 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] lottoNum = new int[45];
		
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = i+1;
		}
		
		for (int i = 0; i < lottoNum.length; i++) {
			int ranNum = random.nextInt(45);
			int temp = 0;
			
			temp = lottoNum[i];
			lottoNum[i] = lottoNum[ranNum];
			lottoNum[ranNum] = temp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(lottoNum[i] + ", ");
		}
	}
}
