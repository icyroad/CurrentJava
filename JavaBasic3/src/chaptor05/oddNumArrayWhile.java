package chaptor05;

import java.util.Arrays;

public class oddNumArrayWhile {
	public static void main(String[] args) {
		int[] oddArray = new int[1];
		int a = 0;
		int i = 0;
		
		while (a <=100) {
			
			if (i%2 == 1) {
				oddArray[a] = i;
				int[] newOddArray = Arrays.copyOf(oddArray, oddArray.length + 1);
				a++;
				
				if (newOddArray.length == a) {
					System.out.println(Arrays.toString(newOddArray));
					break;
				}  
			}
		
			i++;
			
		}
	}
}
