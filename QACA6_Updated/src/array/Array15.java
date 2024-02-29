//WAJP to reverse a elements present in the given array(Mechanism-1)
package array;

import java.util.Scanner;

public class Array15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values want to be store");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the "+size+" number of values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Values are stored successfully");
		int b[]=new int[size];
		int j=0;
		for(int i=b.length-1;i>=0;i--)
		{
			
			b[i]=a[j];
			j++;
		}
		System.out.println("Array elements after reversing");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}
