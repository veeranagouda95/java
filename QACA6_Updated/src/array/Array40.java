//WAJP to find out the n-th smallest element in an integer array
package array;

import java.util.Scanner;

public class Array40 {
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
		System.out.println("Enter the which largest element want pritn from 1 to "+a.length);
		int key=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{ 
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					count++;
				}
			}
			if(count==key-1)
			{
				System.out.println(a[i]);
				break;
			}
		}
	}
}
