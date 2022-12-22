package L15t3;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		int dim1,dim2,dim3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your therr input");
		
		dim1=scan.nextInt();
		dim2=scan.nextInt();
		dim3=scan.nextInt();
		
		
		try {
			if(dim1+dim2<dim3)
			{
				throw new IllegalTriangleException();
			}
			
			
			else
			{
				System.out.println("Your input is correct");
			}
		}
		catch(IllegalTriangleException e)
		{
			e.printStackTrace();
		}
		
	}
	
		
	
}
