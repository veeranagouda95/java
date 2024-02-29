//WAJP to print the sum of odd numbers in the given array
package array;

import java.util.Scanner;

public class Array8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values you want to be store");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the "+size+" of values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
				sum=sum+a[i];
		}
		System.out.println("The sum of odd numbers in the given array is: "+sum);
	}
}
