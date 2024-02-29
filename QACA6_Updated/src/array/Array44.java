//WAJP to print the n-th smallest element present in an integer array using sort method.
package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array44 {
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
	Arrays.sort(a);
	System.out.println("Enter the which smallest element want to print from 1 to "+size);
	int key=sc.nextInt();
	System.out.println(a[key-1]);
}
}
