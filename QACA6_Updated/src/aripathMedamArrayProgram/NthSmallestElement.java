package aripathMedamArrayProgram;

import java.util.Scanner;

public class NthSmallestElement {

	public static void main(String[] args) {
		
	int[]a= {10,80,60,40,20,70,90,30};
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of n between 1 and "+a.length);
	
	int n = sc.nextInt();
	for (int i = 0; i < a.length; i++)
	{
		int count=1;
		for (int j = 0; j < a.length; j++) 
		{
			if (a[j]<a[i])
			{
				count++;
			}
		}
		if (count==n) 
		{
			System.out.println(n+"smallest element is"+a[i]);
		}
	}
	}
}
