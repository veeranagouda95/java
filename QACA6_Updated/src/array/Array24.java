//WAJP to sort the array elements
package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to be stored");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the "+size+" values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Array elements after sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
