package AutorDis;

public class Demo {
	public static void main(String[] args) {
		
		int count;
		int max=1;
		int[] a= {1,7,1,7,3,5,1};
		
		for(int i=0;i<a.length-1;i++)
		{
			count=1;
			
			for(int j=i+1;j<a.length;j++)
			{
				
				
				if((a[i]==a[j])&&(i!=j))
				{
					count++;
					if(max<=count)
					{
						max=count;
					}
				}
			}
			
		}
		System.out.println(max);
		
		
		
		
	}

}
