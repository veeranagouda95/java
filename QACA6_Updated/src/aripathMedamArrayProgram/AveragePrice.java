package aripathMedamArrayProgram;

import java.util.Scanner;

public class AveragePrice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value n");
		int size = sc.nextInt();
		double[] price=new double[size];
		double sum=0.0;
		System.out.println("enter the price of the item");
		for (int i = 0; i <size; i++) 
		{
			price[i]=sc.nextDouble();
			sum=sum+price[i];
		}
		double avg=sum/size;
		System.out.println(avg);
		
	}
}
