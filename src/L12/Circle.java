package L12;

public class Circle extends Shape{
	
	private double radius;

	public Circle() {
		
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius,String color, boolean filled) {
		super(color, filled);
		this.radius=radius;
		
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
	double getArear()
	{
		return Math.PI*radius*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getPerimeter()=" + getPerimeter() + ", getArear()=" + getArear() + "]";
	}
	
	
	
	
	

}
