package aripathMedamArrayProgram;

import java.util.Scanner;

public class keyElementfinding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key element");
		int key = sc.nextInt();
		int key1 = sc.nextInt();//one more element to findout it
		int[]a= {72,9,12,83,20,14,20,0,23,80};
		int count=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]==key) 
			{
				count++;
				break;
			}
			else if (a[i]==key1)//this one more for the findout 
			{
				count++;
				break;
			}
		}
		if (count>0) 
		{
		System.out.println("key element is found");	
		} 
		else 
		{
         System.out.println("key element is not found");
		}
	}
}
