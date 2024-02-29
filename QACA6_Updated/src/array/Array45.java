//WAJP to add one element into the array for a particular index
package array;

import java.util.Scanner;

public class Array45 {
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
		System.out.println("Enter the index where to add the element");
		int index=sc.nextInt();
		System.out.println("Enter the value to be store at "+index+" index");
		int value=sc.nextInt();
		int b[]=new int[a.length+1];
		int j=0;
		for(int i=0;i<b.length;i++)
		{
			if(i==index)
				b[i]=value;
			else
			{
				b[i]=a[j];
				j++;
			}
		}
		System.out.println("Array elements after adding the value to th given index");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}
