package chapter04;

import java.util.Scanner;

public class Exercise42_exp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요(1~12): ");
		int month = scanner.nextInt();
		
		//반복되는 월 판별 출력은 case 앞에 2를 빈걸로 두고 계절별로 break 를 둔다.
		String result = ""; 
		switch (month) {
		case 3:
		case 4:
		case 5:
			result = "봄";
			break;
		case 6:
		case 7:
		case 8:
			result = "여름";
			break;
		case 9:
		case 10:
		case 11:
			result = "가을";
			break;
		case 12:
		case 1:
		case 2:
			result = "겨울";
			break;

		default:
			result = "잘못된 입력";
			System.out.println(month +"월은" + result +  "입니다.");
			
			break;
		}
		scanner.close();
	}
}
