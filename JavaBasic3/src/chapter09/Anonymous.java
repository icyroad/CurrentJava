package chapter09;

public class Anonymous {

	Person filed = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("일어납니다.");
			work();
		};
	};
	
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};//여기까지가 익명객체의 내용이고
		localVar.wake(); //여기가 메소드 내용인데
						 //얘는 익명객체 안에 있는 오버라이딩된 wake() 메소드를 실행한다.
	}
	
	
	void method2(Person person) {
		person.wake();
	}
			
}
