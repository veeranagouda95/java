//WAJP to create a character array and read the character from user and print it on the console 
package array;

import java.util.Scanner;

public class Array49 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of values to be store");
	int size=sc.nextInt();
	char a[]=new char[size];
	System.out.println("Enter the "+size+" characters");	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.next().charAt(0);
	}
	System.out.println("The characters are stored successfully");
	System.out.println("The created array elements are");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
