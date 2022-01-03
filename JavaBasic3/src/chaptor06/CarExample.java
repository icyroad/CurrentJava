package chaptor06;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.color);
		System.out.println(car.model);
		System.out.println(car.company);
		
		car.model= "g80";
		System.out.println(car.model);
		
		Car car2 = new Car();
		System.out.println(car2.model);
	}
}
