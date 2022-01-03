package chapter04;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int sub1 = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int sub2 = scanner.nextInt();
		System.out.print("화면 구현: ");
		int sub3 = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int sub4 = scanner.nextInt();
		System.out.print("머신러닝: ");
		int sub5 = scanner.nextInt();
		
		int total = sub1 + sub2 + sub3 + sub4 + sub5;
		float avrg = ((float)total / 5);
		System.out.println("총점: " + total);
		System.out.printf("평균: %2.2f", avrg );
		System.out.println();
		if (avrg>=90) {
			System.out.println("학점 : A");
		}
		else if (avrg>=80) {
			System.out.println("학점 : B");
		}
		else if (avrg>=70) {
			System.out.println("학점 : C");
		}
		else if (avrg>=60) {
			System.out.println("학점 : D");			
		}
		else {
			System.out.println("학점 : F");
			
		}
		scanner.close();
	}
}
