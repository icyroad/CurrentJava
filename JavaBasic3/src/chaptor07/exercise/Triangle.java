package chaptor07.exercise;

public class Triangle extends Shape{
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		return Math.sqrt(3) * Math.pow(side, 2) / 4.0;
	}
	
	@Override
	public double perimeter() {
		return side *3;
	}
	public String toString() {
		return String.format("도형의 종류 : 정삼각형 " + " 둘레: " + perimeter() + "㎝, 넓이: " + area() + "㎠");
	}
}
