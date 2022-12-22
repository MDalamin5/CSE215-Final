package L14t2;

public class Circle implements GeometricObject {
	
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		
		return Math.PI*radius*2;
	}

	@Override
	public double getArea() {
		
		return Math.PI*radius*radius;
	}
	
	

}
