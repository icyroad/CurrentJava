package chaptor07;

public class Driver {
	public void drive(Vehicle vehicle) {
		
		// Vehicle vehicle = new Bus() 가 들어오는거나 마찬가지
		// 결국 new Bus() 라는 객체를 선언하면서 타입에 상위 타입인 Vehicle을 넣은거랑 똑같다.
		// 따라서 지금 이 클래스에 new로 새로 만드는게 안써져 있어도
		// vehicle.run() 메소드를 사용할 수 있는 것.
		vehicle.run();
	}
}
