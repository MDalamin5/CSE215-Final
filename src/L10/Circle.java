package L10;

public class Circle extends GeometricObject {
	
	private double radius;
	public Circle() {
		
	}
	public Circle(double radius, String color, boolean filled) {
		super(color,filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getPerimeter()
	{
		return Math.PI*2*radius;
	}
	double getDiameter()
	{
		return 2*radius;
	}
	double getArea()
	{
		return Math.PI*radius*radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + ", getPerimeter()=" + getPerimeter()
				+ ", getDiameter()=" + getDiameter() + ", getArea()=" + getArea() + "]";
	}
	
	

}
