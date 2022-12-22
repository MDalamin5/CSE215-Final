package L15;

import java.util.Random;
import java.util.Scanner;

public class Exceptionhh {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int index;
		
		int [] array= new int[100];
		
		//int a=rand.nextInt(100);
		
		for(int i=0;i<100;i++)
		{
			array[i]=rand.nextInt(100);
		}
		
		System.out.println("Enter your array index: ");
		index= scan.nextInt();
		
		
		try
		{
			if(index<0)
			{
				throw new MyExp();
			}
			else
			{
				System.out.println(array[index]);
			}
		}
		
		catch(MyExp e)
		{
			e.printStackTrace();
		}
	}

}
