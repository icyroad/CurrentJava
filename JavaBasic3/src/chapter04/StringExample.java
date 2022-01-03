package chapter04;

public class StringExample {
	public static void main(String[] args) {
		String str = "신민철"; // = new String("신민철")
		String str2 = "신민철";
		String str3 = new String("신민철");
		String str4 = new String("신민철");
		
		if (str == str2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		if (str3 == str4) {
			System.out.println("같음");
			
		} else {
			System.out.println("다름");
			
		}
	}
}
