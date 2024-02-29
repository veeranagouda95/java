//WAJP to reverse the elements in a given array (Mechanism-2)
package array;

import java.util.Scanner;

public class Array16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to be stored");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Please enter the "+size+" of values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The values are stored successfully");
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println("Array elements after reversing");
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
}
