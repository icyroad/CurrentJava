package chaptor06.exercise;

public class NewCar {
	private double speed;
	private String color;
	private final static double MAX_SPEED = 200;

	public NewCar() {
		
	}
	
	public NewCar(String color) {
		this.color = color;
	}

	
	
	public double getSpeed() {
		return mileToKillo(speed);
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
		//중복되는 killoToMile(speed)를 
		//메소드 맨 윗줄에
		//speed = killoToMile(speed)를 추가하는 것으로 바꿀 수 있다.
		if (this.speed + killoToMile(speed)<0) {
			this.speed = 0;
			return false;
			
		} else if (this.speed + killoToMile(speed) >killoToMile(MAX_SPEED)) {
		  return false;
			
		} else {
			this.speed += killoToMile(speed);
			return true;
		}
	}
	
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	
	private static double killoToMile(double distance) {
		return distance / 1.6;
	}
	
	private static double mileToKillo(double distance) {
		return distance * 1.6;
	}
	
	
	public String toString() {
		return String.format(speed + ", " +color + ", " + MAX_SPEED);
	}
}