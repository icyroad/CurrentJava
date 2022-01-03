package chaptor06;

public class BookExampleCar {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	//생성자
	BookExampleCar() {
		
	}
	
	BookExampleCar(String model){
		this(model, null, 0);
	}
	
	
	BookExampleCar(String model, String color) {
		this(model, color, 0);
	}

	
	BookExampleCar(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
