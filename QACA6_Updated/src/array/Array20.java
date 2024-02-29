//WAJP to merge 2 integer arrays(Mechanism 1)

package array;

import java.util.Scanner;

public class Array20 {
	public static void main(String[] args) {
		int a[]=toRead();
		int b[]=toRead();
		int res[]=merge(a,b);
		System.out.println("Elements after merging");
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
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			res[a.length+i]=b[i];
		}
		return res;

	}
}
