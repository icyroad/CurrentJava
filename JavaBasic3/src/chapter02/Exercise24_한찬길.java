package chapter02;

import java.util.Scanner;

public class Exercise24_한찬길 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm): ");
		String radius = scanner.nextLine();
		
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm) ");
		String height = scanner.nextLine();
		
		double area = Math.PI * 
				      Math.pow(Double.parseDouble(radius), 2);
		
		double volume = Math.PI * 
						Math.pow(Double.parseDouble(radius), 2) *
				        Double.parseDouble(height);
	
		System.out.println("원기둥 밑변의 넓이는 " + area + "㎠이고, " + "원기둥의 부피는 " + volume + "㎤이다");
	}
}
