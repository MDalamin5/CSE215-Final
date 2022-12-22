package L13;

public abstract class Shape {
	
	private String color;
	private boolean filled;
	
	public Shape() {
		
	}

	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	abstract double getArea();
	abstract double getPerimeter();

	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + ","
				+ " getColor()=" + getColor() + ", isFilled()="
				+ isFilled() + ", getArea()=" + getArea() + ","
				+ " getPerimeter()=" + getPerimeter() + "]";
	}
	
	
   

}
