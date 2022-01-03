package chapter09.confirm01;

public class Anonymous {
	Worker field = new Worker() {
		
		public void start() {
			System.out.println("디자인을 쳐하던가말던가");
		};
	};	
	
	void method1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("개발을 합니다.");
			}
		};
		localVar.start();
	}
	
	void method2(Worker worker) {
		worker.start();
	}
	
			
			
	
	
	
}
