package array;

import java.util.Scanner;

public class Array22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to be stored");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the "+size+ "values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//input from user taken
		//to find out first largest numberbelow block
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];

		}
		//to find 2nd largest nimber value
		int max1=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				if(!(a[i]==max))
					max1=a[i];
			}
		}
		System.out.println("Second larget element in the given array is"+max1);


	}
}
