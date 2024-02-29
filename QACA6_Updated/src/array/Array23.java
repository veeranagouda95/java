//Findning max value wrong logic
package array;

import java.util.Scanner;

public class Array23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to be store");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the "+size+" values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the which position maximum value to be find in integer value");
		int key=sc.nextInt();
		int max=a[0];
		int max2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}	
		while(key>1)
		{
				
			int max1=a[0];			 
			for(int i=0;i<a.length;i++)
			{
				if(!(a[i]==max))
				
				{
					if(a[i]>max1)
							max=a[i];					
				}
			}
			max=max1;
			key--;
		}
		System.out.println(max);
	}
}
