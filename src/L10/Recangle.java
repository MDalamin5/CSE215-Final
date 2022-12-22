package L10;

public class Recangle extends GeometricObject{
	
	private double width;
	private double height;
	
	public Recangle() {
		// TODO Auto-generated constructor stub
	}

	public Recangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Recangle(double width, double height,String color, boolean filled) {
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
	double getDiameter()
	{
		return Math.sqrt((width*width)+(height*height));
	}
	double getArea()
	{
		return width*height;
	}

	@Override
	public String toString() {
		return "Recangle [width=" + width + ", height=" + height + ", getWidth()=" + getWidth() + ", getHeight()="
				+ getHeight() + ", getPerimeter()=" + getPerimeter() + ", getDiameter()=" + getDiameter()
				+ ", getArea()=" + getArea() + "]";
	}
	
	

}
