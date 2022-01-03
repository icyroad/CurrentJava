package chaptor05;

import java.util.Arrays;

public class oddNumArray {
	public static void main(String[] args) {
		int[] oddArray = new int[50]; 
		int a = 0;
		
		for (int i = 0; i < 100; i++) {
			
			if (i%2 == 1) {
				oddArray[a] = i;
				a++;
			}
		}
		
		System.out.println(Arrays.toString(oddArray));
		
		System.out.print("{ ");
		for (int i = 0; i < oddArray.length; i++) {
			System.out.print(oddArray[i]);
			System.out.print(", ");
			
		}
		System.out.print("}");
		
	}
}
