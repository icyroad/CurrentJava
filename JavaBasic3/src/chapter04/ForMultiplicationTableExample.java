package chapter04;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) {
			System.out.println("***" + i+ "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(i + " * " + n  + " = " + (i * n));
			}
		}
		
	}
}
