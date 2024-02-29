package basic;

import java.util.Arrays;

public class a10 {
public static void main(String[] args) {
	int[]a= {10,20,30,40,10,20,30};
	boolean[]b=new boolean[a.length];
	
	for (int i = 0; i < b.length; i++) 
	{
		int count=0;
		if(b[i]==false)
		{
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=true;
					
				}
				
			}
			System.out.println(a[i]+"is repaeted:"+--count+"times");
		}
	}
	}
}

