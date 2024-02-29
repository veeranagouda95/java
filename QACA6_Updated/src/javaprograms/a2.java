package javaprograms;

import java.util.Scanner;

//write to find the average of given array elements ,take input from user
public class a2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of arrya");
		int size=sc.nextInt();//this stament will ask user enter elements
		int a[]=new int[size];//it will take size of arrya only 
		System.out.println("Please enter the elements");
		for (int i = 0; i < a.length; i++) {//this for take inputs from user untill length will be more then 
			a[i]=sc.nextInt();
		}
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		int avg=sum/size;
		System.out.println("the average value given array elemnts is: "+avg);

	}
}
