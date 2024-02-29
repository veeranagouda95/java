//WAJP to remove an element from the specified index
package array;

import java.util.Scanner;

public class Array47 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of aan array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the index to which element to be removed");
		int index=sc.nextInt();
		int res[]=remove(a,index);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
	public static int[] remove(int a[],int index)
	{
		if(index<0 || index>a.length)
		{
			System.out.println("Index not in range");
			return a;
		}
		int res[]=new int[a.length-1];
		for(int i=0;i<res.length;i++)
		{
			if(i<index)
			{
				res[i]=a[i];
			}
			else
				res[i]=a[i+1];

		}
		return res;
	}


}
