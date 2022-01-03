package chaptor07;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Bus());
		driver.drive(new Taxi());  // Taxi taxi = new Taxi() 를 따로 안쓰고 바로 매개값에
									// new Taxi()를 넣으면 dirver.drive() 메소드에
									// Vehicle vehicle = new Taxi() 가 대입되면서
									// 타입변환한 vehicle 이라는 변수가 Taxi()라는 객체를 참조하는
									// 것이 된다.
	}
}
