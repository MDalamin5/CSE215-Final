package L15t4;

public class Test {

	
	public static double getSquareRoot(int num) throws MyException
	{
		return Math.sqrt(num);
	}
	public static void main(String[] args) {
		
		double  x;
		int num=-4;
		
		try {
			if(num<0)
			{
				throw new MyException();
			}
			
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
		
	}
	
}
