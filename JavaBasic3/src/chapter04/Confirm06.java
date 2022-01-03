package chapter04;

public class Confirm06 {
	public static void main(String[] args) {

		String str1 = "□";
		String str2 = "*";

		for (int i = 1; i <= 4; i++) {
			
			if (i <= 1) {
				System.out.print(str1);
			}
			if (i <= 2) {
				System.out.print(str1);
			}
			if (i <= 3) {
				System.out.print(str1);
			}
			System.out.println(str2);
			str2 += "*";
			
		}
	}
}


