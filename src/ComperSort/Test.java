package ComperSort;

import java.util.Arrays;



public class Test {
	
	public static void main(String[] args) {
		
		Student[] allstu= new Student[4];
		
		
		 allstu[0]= new Student("Al Amin", 1811, 2024);
		 allstu[1]= new Student("Maruf ", 1815, 2025);
		 allstu[2]= new Student("Toki", 1814, 2027);
		 allstu[3]= new Student("Kaysar", 1814, 2021);
	
		
		Arrays.sort(allstu, new IdComparator() );
		
		for(int i=0;i<allstu.length;i++)
		{
			System.out.println(allstu[i]+" ");
		}
		System.out.println("\n\n");
		
		
		
        Arrays.sort(allstu, new YearComparator() );
		
		for(int i=0;i<allstu.length;i++)
		{
			System.out.println(allstu[i]+" ");
		}
		
     System.out.println("\n\n");
     
     
		
        Arrays.sort(allstu, new NameComparator() );
		
		for(int i=0;i<allstu.length;i++)
		{
			System.out.println(allstu[i]+" ");
		}
		
	}

}
