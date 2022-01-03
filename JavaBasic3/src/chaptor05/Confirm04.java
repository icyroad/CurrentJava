package chaptor05;

public class Confirm04 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[] array = {1, 5, 3, 8, 2 };
		for (int i = 0; i < array.length; i++) {
		
			if (max < array[i]) {
				max = array[i];
			}
			
			if (min > array[i]) {
				min = array[i];
			}
			
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}
