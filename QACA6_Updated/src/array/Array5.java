//WAJP to print the elements present in the even index
package array;

import java.util.Scanner;

public class Array5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values you want to store");	
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the "+size+" number of values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The elements which are present in the even index are");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				System.out.println(a[i]);
		}
	}

}
