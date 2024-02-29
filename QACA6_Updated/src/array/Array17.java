//WAJP to find the prime number in a given array
package array;

import java.util.Scanner;

public class Array17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to be store");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Please enter the "+size+" of values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[size];
		int prime=0;
		int n=0;
		for(int i=0;i<a.length;i++)
		{
			int k=2;
			int count =0;
			while(k<=a[i]/2)
			{
				if(a[i]%k==0)
				{
					count++;
					break;
				}
				k++;

			}
			if(count==0)
			{
				b[n]=a[i];
				n++;
				prime++;
			}
		}
		System.out.println("The prime number present in the given array are");
		for(int i=0;i<prime;i++)
		{
			System.out.println(b[i]);
		}
	}
}
