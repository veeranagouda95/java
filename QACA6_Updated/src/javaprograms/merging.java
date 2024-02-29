package javaprograms;

import java.util.Scanner;

public class merging {
	/*public static void main(String[] args) {
		int[]a=toRead();
		int[]b=toRead();
		int[]res=merge(a,b);
		System.out.println("merged arrya elements are");
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]+" ");
		}

	}*/
	public static int [] toRead()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("enter the size of arrya");
		int n=s.nextInt(); 
		int[] a=new int[n];	
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		return a;
	}
	public static int[] merge(int []a,int[]b) {
		int[] res =new int [a.length+b.length];
		for (int i = 0; i < res.length; i++) {
			res[i]=a[i];

		}
		for (int i = 0; i < b.length; i++) {
			res[a.length+i]=b[i];
		}
		return res;

	}
}
