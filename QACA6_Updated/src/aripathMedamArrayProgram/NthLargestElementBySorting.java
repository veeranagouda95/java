package aripathMedamArrayProgram;

import java.util.Scanner;

public class NthLargestElementBySorting {
public static void main(String[] args) {
	

	int[]a= {10,80,60,40,20,70,90,30};
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of n between 1 and "+a.length);
	int n = sc.nextInt();
	for (int i = 0; i < a.length-1; i++)
	{
		for (int j = 0; j < a.length-1; j++) 
		{
			if (a[j]<a[j+1]) 
			{
			    int temp=a[j];
			    a[j]=a[j+1];
			    a[j+1]=temp;
			    
			}
		}
	}
	System.out.println(n+"largest element is "+a[n-1]);
}
}