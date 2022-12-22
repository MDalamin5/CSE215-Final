package L13;

public class Circle extends Shape{
	
	private double radius;
	public Circle() {
		super();
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle(double radius,String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	double getArea() {
		
		return Math.PI*radius*radius;
	}
	@Override
	double getPerimeter() {
		
		return Math.PI*radius*2;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getArea()=" + getArea() + ", "
				+ "getPerimeter()=" + getPerimeter() + "]";
	}
	
	

}
