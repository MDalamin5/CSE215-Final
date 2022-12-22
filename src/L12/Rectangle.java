package L12;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	public Rectangle() {
		
	}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public Rectangle(double width, double height,String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
		
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	double getPerimeter()
	{
		return 2*(width+height);
	}
	double getArea()
	{
		return width*height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getWidth()=" + getWidth() + ", getHeight()="
				+ getHeight() + ", getPerimeter()=" + getPerimeter() + ", getArea()=" + getArea() + "]";
	}
	
	
	
	
	

}
