package chaptor06;

public class BookExampleCarExample {
	public static void main(String[] args) {
		BookExampleCar car1 = new BookExampleCar();
		System.out.println("car1.company: " + car1.company);
		System.out.println();
		
		BookExampleCar car2 = new BookExampleCar("자가용");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();
		
		BookExampleCar car3 = new BookExampleCar("자가용", "빨강");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println();
		
		BookExampleCar car4 = new BookExampleCar("택시", "검정", 200);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
		System.out.println();
		
	}
}
