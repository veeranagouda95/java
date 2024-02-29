//WAJP to find the smallest element in a given array
package array;

import java.util.Scanner;

public class Array12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to be stored");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			min=a[i];
		}
		System.out.println("Minimum value present in the array are: "+min);
	}
}
