package chaptor06.exercise.answer;

public class NewCar {
	private double speed;
	private String color;
	private final static double MAX_SPEED = killoToMile(200);

	
	public NewCar() {
		
	}
	
	public NewCar(String color) {
		this.color = color;
	}

	
	
	public double getSpeed() {
		return mileToKillo(speed);
	}

	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean speedUp(double speed) {
		speed = killoToMile (speed);
		if (this.speed + speed<0) {					
			this.speed = 0;
			return false;
		} else if (this.speed + speed > MAX_SPEED) {
			return false;					//위처럼 최저속도를 0으로 하려면 
										    //MAX_SPEED 이상의 속력도 200으로 고정해야 했음
		} else {
			this.speed += speed;
			return true;
		}
		
		/*
		 * if (this.speed + speed >=0 && this.speed + speed <= MAX_SPEED) { 
		 *     this.speed += speed;
		 *     return true;
		 *     }
		 */
	}
	
	public static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}
	
	public String toString() {
		return String.format(speed + ", " +color + ", " + MAX_SPEED);
		//return "Car{speed: " + speed + ", color: " + color + "}";
	}
	
	private static double killoToMile (double distance) {
		return distance / 1.6;
	}
	private static double mileToKillo (double distance) {
		return distance * 1.6;
	}
}
