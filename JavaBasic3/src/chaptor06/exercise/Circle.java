package chaptor06.exercise;

public class Circle {

	private double radius;
	private double x;
	private double y;

	
	
	
	Circle() {
		
	}
	
	
	double getArea() {
		double result = Math.PI * Math.pow(this.radius, 2);
		return result;
	}
	
	public double getRadious() {
		return radius;
	}
	
	public void setRadious(double radius) {
		if (radius >0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	
}
