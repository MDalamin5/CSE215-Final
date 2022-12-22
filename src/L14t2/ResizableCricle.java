package L14t2;

public class ResizableCricle extends Circle implements Resizable {

int x;
	public ResizableCricle(double radius) {
		super(radius);
		
	}

	@Override
	public void resize(int percent) {
		
	
		System.out.println(super.radius*(percent/100));
	}
	

}
