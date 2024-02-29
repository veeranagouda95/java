package aripathMedamArrayProgram;

import java.util.Scanner;

public class AddOneElement {

	public static void main(String[] args) {

		int[]a= {10,80,60,40,20,70,90,30};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the index");
		int index = sc.nextInt();
		System.out.println("enter the value");
		int value = sc.nextInt();
         
		int[]res=new int[a.length-1];
		
		if (index<0 || index>a.length) 
		{
			System.out.println("index is out of range");
		} 
		else 
		{		
			res[index]=value;
			for (int i = 0; i < a.length; i++) 
			{
				if (i<index) 
				{
					res[i]=a[i];
				} 
				else 
				{
					res[i+1]=a[i];
				}
			}
		}
		for (int i = 0; i < res.length; i++) 
		{
			System.out.println(res[i]);
		}
	}
}
