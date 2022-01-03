package chapter04;

import java.util.Scanner;

public class Exercise41_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int length1 = scanner.nextInt();
		
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		int length2 = scanner.nextInt();
		
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		int length3 = scanner.nextInt();
		
		if (length1>length2 && length1>length3) {
			if (length1 <= length2 + length3) {
				System.out.println("삼각형을 만들 수 있습니다.");
			} 
		}
		else if (length2>length1 && length2>length3) {
			if (length2 <= length1 + length3) {
				System.out.println("삼각형을 만들 수 있습니다.");
			} 
		}
		else if (length3>length2 && length3>length1) {
			if (length3 <= length2 + length1) {
				System.out.println("삼각형을 만들 수 있습니다.");
			} 
		else {
			System.out.println("삼각형을 만들 수 없습니다.");			
		}
		}
	}
}
