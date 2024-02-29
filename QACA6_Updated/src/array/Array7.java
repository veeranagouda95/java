//WAJP to print the sum of even elements present in the array
package array;

import java.util.Scanner;

public class Array7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values of to be store");
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
			if(a[i]%2==0)
				sum=sum+a[i];
		}
		System.out.println("The sum of even numbers present in the given array are: "+sum);
	}
}
