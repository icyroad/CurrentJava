package chaptor07.exercise;

public class Circle extends Shape {
	private double radius;
	
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius; 
	}
	
	public String toString() {
		return String.format("도형의 종류 : 원 " + ", 둘레: " + perimeter() + "㎝, 넓이: " + area() + "㎠");
	}
}
