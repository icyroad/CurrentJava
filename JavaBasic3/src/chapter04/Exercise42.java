package chapter04;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요(1~12): ");
		int month = scanner.nextInt();
		
		//반복되는 월 판별 출력은 case 앞에 2를 빈걸로 두고 계절별로 break 를 둔다.
		 
		switch (month) {
		case 3:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 4:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 7:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9:
			System.out.println(month + "월은 가을입니다.");
			break;
		case 10:
			System.out.println(month + "월은 가을입니다.");
			break;
		case 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		case 12:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 1:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 2:
			System.out.println(month + "월은 겨울입니다.");
			break;

		default:
			System.out.println(month + "월은 잘못된 입력입니다.");
			
			break;
		}
		scanner.close();
	}
}
