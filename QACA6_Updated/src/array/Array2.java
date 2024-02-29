//WAJP to read n elements from the user and store it inside a container and print all the elements
package array;

import java.util.Scanner;

public class Array2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements you want to store");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the "+size+" number of values");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("The values are stored successfully");
	System.out.println("The values present inside the arrays are");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
