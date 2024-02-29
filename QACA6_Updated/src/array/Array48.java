package array;

import java.util.Scanner;

public class Array48 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of values to be size");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the number"+size+" values");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
}
}
