//WAJP to print the number of time the elements are repeated in an integer array
package array;

import java.util.Scanner;

public class Array36 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to be store");
		int size=sc.nextInt();
		int a[]=new int[size];
		boolean b[]=new boolean[size];
		System.out.println("Enter the "+size+" values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		for(int i=0;i<a.length;i++)
		{
			int count=1;
			if(b[i]==false)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						b[j]=true;
					}

				}
				System.out.println(a[i]+" is repeated for: "+--count+" times");
			}
		}
	}
}