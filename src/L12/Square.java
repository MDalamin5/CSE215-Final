package L12;

public class Square extends Rectangle {


	public Square() {
		super();
		
	}
	
	public Square(double side) {
		super(side,side);
		
	}

	public Square(double side, String color, boolean filled) {
		super(side,side, color, filled);
		
	}
	
	public double getSide()
	{
		return getWidth();
	}
	
	public void setSide(double side)
	{
		setWidth(side);
		setHeight(side);
	}

	
	double getPerimeter()
	{
		return 2*(getWidth()+getWidth());
	}
	double getArea()
	{
		return getWidth()*getWidth();
	}

	@Override
	public String toString() {
		return "Square [getSide()=" + getSide() + ", getPerimeter()=" + getPerimeter() + ", getArea()=" + getArea()
				+ "]";
	}
	
	
	
	

	
	
	
	
}
