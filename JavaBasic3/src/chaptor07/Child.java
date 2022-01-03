package chaptor07;

public class Child extends Parent{
	void method1() {
		System.out.println("Child - method1");
	}
	// annotation : @ sns의 해시태그같은 존재. 
	@Override
	void method2() {
		// TODO Auto-generated method stub
		super.method2();
		System.out.println("Child - method2");
	}
}
