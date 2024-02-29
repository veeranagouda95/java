package aripathMedamArrayProgram;

import java.util.Scanner;

public class StoreAndPrint {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		
		
		int size = sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the elements in array");
		
		
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();//10,20,30,40
		}
		System.out.println("entered the elemnts");
		
		for (int i = 0; i < a.length; i++) 
		{
		System.out.println(a[i]);
			
		}
		
	}
}
