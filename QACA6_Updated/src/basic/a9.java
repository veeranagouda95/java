package basic;
//convert string name into how many charcter repated in it
import java.util.Scanner;

public class a9 {
	public static void main(String[] args)
	{
		int[]a= {10,20,30,40,10,30};
		boolean [] b=new boolean[a.length];
		
		for (int i = 0; i < b.length; i++)
		{
			if(b[i]==false) {
				
			
			int count=1;
			
			for (int j = i+1; j < b.length; j++)
			{
				if(a[i]==a[j]) 
				{
					count++;
					
					b[j]=true;
					
				}
			}
		
		{
				
			
			System.out.println(a[i]+"============"+count);
		}
		}
		
	}
	}
}
