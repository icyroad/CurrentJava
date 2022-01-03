package chaptor06;

import java.util.Scanner;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요: ");
		String id = scanner.nextLine();
		
		System.out.print("비밀번호를 입력하세요: ");
		String password = scanner.nextLine();
		
		boolean result = memberService.login(id, password);
		
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
			
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	scanner.close();
	}
}
