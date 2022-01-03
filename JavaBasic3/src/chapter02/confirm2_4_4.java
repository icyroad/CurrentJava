package chapter02;
import java.util.Scanner;

public class confirm2_4_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.println("1. 이름 :___");
		String name = scanner.nextLine();
		System.out.println("2. 주민번호 앞 6자리: ______");
		String idNumber = scanner.nextLine();
		System.out.println("3. 전화번호: ___-____-____");
		String phoneNumber = scanner.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(idNumber);
		System.out.println(phoneNumber);
		
		
		
	}
}
