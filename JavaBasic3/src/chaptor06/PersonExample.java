package chaptor06;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567" , "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";              파이널 필드이기 때문에 수정이 불가능
		//p1.ssn = "654321-7654321";
		p1.name = "홍삼원";
		
	}
}
