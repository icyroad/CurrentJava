package chapter02;

import java.util.Scanner;

public class Exercise21_한찬길 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("가로의 길이는?(단위: m) ");
		String width = scanner.nextLine();
		
		System.out.print("세로의 길이는?(단위: m) ");
		String height = scanner.nextLine();
		
		double perimeter = Double.parseDouble(width) * 2 + 
				           Double.parseDouble(height) * 2;
		
		double area = Double.parseDouble(width) * 
				      Double.parseDouble(height);
		
		System.out.println("직사각형의 넓이: " + area);
		System.out.println("직사각형의 둘레: " + perimeter);
	}

}
