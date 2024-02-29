//WAJP to sort the second half of arrays 
package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array27 {
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
		System.out.println("Enter the start of index and end index for which array to be sort");
		int startIndex=sc.nextInt();
		int endIndex=sc.nextInt();
		Arrays.sort(a, startIndex,endIndex);
		System.out.println("Arrays index after sorting from a specified index");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
}
