//WAJP to sort the elements in descending order using Bubble sort technique.
package array;

import java.util.Scanner;

public class Array26 {
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
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]<a[j+1])		//Just change the condition > to sort in ascending order
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Arrays elements after sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
