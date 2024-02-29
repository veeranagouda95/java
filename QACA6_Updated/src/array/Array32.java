//WAJP to print the missing elements in a given range of an array
package array;

import java.util.Scanner;

public class Array32 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to be store");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the "+size+" values from 1 to 10");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<=10;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(i==a[j])
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println("Missing elements "+i);
		}
	}
}
