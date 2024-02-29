//WAJP to read n product prices from the user and store it inside a container then find the average value
package array;

import java.util.Scanner;

public class Array13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of products to be stored");
		int size=sc.nextInt();
		double a[]=new double[size];
		System.out.println("Enter the price of each product");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextDouble();
		}
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		double avg=sum/a.length;
		System.out.println("The average price is: "+avg);
	}
}
