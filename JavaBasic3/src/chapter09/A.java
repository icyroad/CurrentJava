package chapter09;

public class A {
	class B{
		void b() {
			
		}
	}
	
	void a() {
		//local class
		class D{
			void d() {    //이 메소드는 a 메소드 안에서밖에 쓸 수없다.
			}
		}
		D d = new D();
		d.d();            
	}
	
	static class C{
		void c() {
		}
	}
}

//public class는 하나만있어야 한다.
class Outer {
	
}