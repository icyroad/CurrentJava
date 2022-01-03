package chapter04;

import java.util.Scanner;

public class Exercise44_exp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임");
		System.out.print("철수: ");
		String cheolsu = scanner.next();
		System.out.print("영희: ");
		String yeonghui = scanner.next();
		String result = ""; //=new String()과 같고, null과는 다르다.
		if (cheolsu.equals(yeonghui)) {
			result = "비김";
			
		} else if (cheolsu.equals("가위") && yeonghui.equals("바위")
				|| cheolsu.equals("바위") && yeonghui.equals("보")
				|| cheolsu.equals("보") && yeonghui.equals("가위")) {
			result = "영희 승";
		} else {
			result = "철수 승";
		}
		System.out.println("결과 = " + result);
		scanner.close();
	}
}
