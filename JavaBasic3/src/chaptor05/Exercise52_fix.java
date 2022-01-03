package chaptor05;

import java.util.Random;

public class Exercise52_fix {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lottoArray = new int[6];
		int lottoNum = 0;
		
		for (int i = 0; i < lottoArray.length; i++) {
			lottoNum = random.nextInt(45)+1;
			lottoArray[i] = lottoNum;
			for (int k = i-1; k >= 0; k--) {
				
				if (lottoArray[i]==lottoArray[k]) {
					i--;
				}
			}			
		}
		
		for (int i = 0; i < lottoArray.length; i++) {
			for (int k = i+1; k < lottoArray.length; k++) {
				 
				if (lottoArray[i]>lottoArray[k]) {
					int temp = lottoArray[i];
					lottoArray[i] = lottoArray[k];
					lottoArray[k] = temp;		
				}
			}
		}
		
		System.out.print("랜덤 로또번호: {");
		for (int i = 0; i < lottoArray.length; i++) {
			System.out.print(lottoArray[i] + ", ");
		}
		System.out.println("}");
	}
}
