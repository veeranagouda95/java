//WAJP to sort the elements in ascending order using Bubble sort technique.
package array;

import java.util.Scanner;

public class Array25 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number values to be store");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the "+size+" values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])		//Just change the condition < to sort in descending order
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array elements after sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
