package chaptor08;

public class MyClass {
	RemoteControl rc = new Television();
	
	MyClass(){
		
	}
	
	MyClass(RemoteControl rc){
		// RemoteControl rc = new Audio();
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
