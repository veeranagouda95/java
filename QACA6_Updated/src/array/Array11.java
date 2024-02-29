//WAJP to find the largest element present inside an integer array
package array;

import java.util.Scanner;

public class Array11 {
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
	int max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(max<a[i])
			max=a[i];
	}
	System.out.println("The largest element present in the given array is: "+max);
	
}
}
