package javaprograms;

import java.util.Scanner;

//write java program arrya smallest element in a given array
public class array12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of values to be stored");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the numbers");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();

		}
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if(min>a[i])
				min=a[i];
		}
		System.out.println("min value present:"+min);
	}

}
