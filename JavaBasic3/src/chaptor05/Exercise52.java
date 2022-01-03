package chaptor05;

import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lottoArray = new int[6];
		
		for (int i = 0; i < lottoArray.length; i++) {
			
			int lottoNum = random.nextInt(45)+1;
			
			if (lottoNum == lottoArray[0]|| 
				lottoNum == lottoArray[1]||
				lottoNum == lottoArray[2]||
				lottoNum == lottoArray[3]||
				lottoNum == lottoArray[4]||
				lottoNum == lottoArray[5]) {
				i--;
			
			} else {
				lottoArray[i] = lottoNum;
			}
		}
		System.out.println("랜덤 로또번호 : " + "{" +
							lottoArray[0] + ", " +
							lottoArray[1] + ", " +
							lottoArray[2] + ", " +
							lottoArray[3] + ", " +
							lottoArray[4] + ", " +
							lottoArray[5] + "}"			
						);
	}
}