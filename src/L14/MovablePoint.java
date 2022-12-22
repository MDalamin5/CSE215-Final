package L14;

public class MovablePoint implements Movable {
	
	int x=0;
	int y=0;
	int xSpeed = 0;
	int ySpeed = 0;
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public void moveUp() {
		y=y+ySpeed;
		
	}
	@Override
	public void moveDown() {
		y=y-ySpeed;
		
	}
	@Override
	public void moveLeft() {
		x=x-xSpeed;
		
	}
	@Override
	public void moveRight() {
		x=x+xSpeed;
		
	}

	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + "]";
	}
	
	

}
