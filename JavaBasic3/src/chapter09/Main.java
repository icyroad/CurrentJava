package chapter09;

import chapter09.A.B;
import chapter09.A.C;

public class Main {
	public static void main(String[] args) {
//		A a = new A();
//		a.new B();
		
		new A().new B();
		B b = new A().new B();
		b.b();
		
		C c = new A.C();
		c.c();
		
		
		A a = new A();
		a.a();
	}
}
