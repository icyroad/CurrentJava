package chaptor06.exercise.answer;

public class Circle {
	double radius;
	double x;
	double y;
	
	public Circle() {
		
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		
		if (radius > 0) {
		 this.radius = radius;
		}
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double X) {
		this.y = y;
	}
	
	
}
