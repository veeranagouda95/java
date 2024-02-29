package javaprograms;

import java.util.Scanner;

public class a23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number  of values to be stored");
		int size = sc.nextInt();
		int[]a=new int[size];
		System.out.println("enter the number");//here  user see that enter value output but this statemnt doesnot take values
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the elemnts are stored succesfully");
	int max=a[0];
	for (int i = 0; i < a.length; i++) {
		if(a[i]>max)
			max=a[i];
		System.out.println(a[i]);
	}
}
}