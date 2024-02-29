package aripathMedamArrayProgram;

import java.util.Scanner;

public class ReadCharcters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		char[] a=new char[size];
		System.out.println("enter the names into array");
		
		//input will be taken order will arranged
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.next().charAt(0);
		}
		
		//output will be taken order
		System.out.println("entered elemnts are");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
		
		
		
	}
}
