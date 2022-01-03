package chaptor06.exercise;

public class Car {
	private double speed;
	private String color;
	private final static double MAX_SPEED = 200;

	
	public Car() {
		
	}
	
	public Car(String color) {
		this.color = color;
	}

	
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean speedUp(double speed) {
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
		 * if (this.speed + speed >=0 && this.speed + speed <= MAX_SOEED) { 
		 *     this.speed += speed;
		 *     return true;
		 *     }
		 */
	}
	
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	
	public String toString() {
		return String.format(speed + ", " +color + ", " + MAX_SPEED);
		//return "Car{speed: " + speed + ", color: " + color + "}";
	}
		
}
