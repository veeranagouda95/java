package javaprograms;
//wajp for you can enter user said products and it's price value given by user only 
import java.util.Scanner;

public class a4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of product to be stored");
		int size=sc.nextInt();
		//int a[]=new int[size];
		double a[]=new double[size];
		System.out.println("enter the price of each product");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextDouble();
		}
		double sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];

		}
		double avg=sum/a.length;
		System.out.println("the average price is :"+avg);
	}
}
