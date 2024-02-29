package sort;

import java.util.Arrays;
import java.util.Scanner;

//wajp second half of element
public class s2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size arrya");
		int size = sc.nextInt();
		int []a=new int[size];
		System.out.println("enter arrya elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		//int[] a={10,50,20,40,8,9,7,4,2};
		
		int n=a.length;
		Arrays.sort(a, n/2, n);
		System.out.println("after sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+ " ");


		}
	}
}
