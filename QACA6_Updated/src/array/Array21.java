package array;

import java.util.Scanner;

public class Array21 {
	public static void main(String[] args) {
		int a[]=toRead();
		int b[]=toRead();
		int res[]=merge(a,b);
		System.out.println("Array elements after merging");
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
	public static int[] toRead()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to be stored");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static int[] merge(int a[],int b[])
	{
		int res[]=new int[a.length+b.length];
		int j=0;
		for(int i=0;j<res.length;i++)
		{
			if(i<a.length)
				res[j++]=a[i];
			if(i<b.length)
				res[j++]=b[i];
		}

		return res;
	}


}
