package chaptor05;

import java.util.ArrayList;

import chaptor06.Calculator;

public class OddNumList {
	public static void main(String[] args) {
		
		ArrayList<Integer> oddNumList = new ArrayList<Integer>();
		
		for (int i = 0; i <= 100; i++) {
			
			if (i%2==1) {
				oddNumList.add(i);
			}
		}
		
		System.out.println(oddNumList);
		
	}
}