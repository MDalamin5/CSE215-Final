package DeletArr;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		int[] book= {10,20,30,40,50,60};
		int d_ele;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Which elements you want to delete: ");
		d_ele=scan.nextInt();
		
		for(int i=0;i<book.length;i++)
		{
			if(d_ele==book[i])
			{
				for(int j=i;j<book.length-1;j++)
				{
					book[j]=book[j+1];
				}
				break;
			}
		}
		
		
		for(int i=0;i<book.length-1;i++)
		{
			System.out.print(book[i]+" ");
		}
		
		
		//Reset array index
		
		
		for(int i=0;i<book.length-1;i++)
		{
			book[i]=0;
		}
		
		System.out.println("\n");

		for(int i=0;i<book.length-1;i++)
		{
			if((book[i]+book[i+1])==0)
			{
				System.out.println("Empty book List");
				break;
			}
		}
		
	}

}
