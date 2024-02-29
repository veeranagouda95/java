//WAJP to print all the even numbers present inside the given array
package array;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers of values you want to pass");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the "+size+" number of values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();

		}
		System.out.println("The even numbers present in the given array are");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}

	}
}
