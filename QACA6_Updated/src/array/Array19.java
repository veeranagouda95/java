//WAJP to merge 2 integer arrays(Mechanism 1)
package array;

import java.util.Scanner;

public class Array19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to be stored in first array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the number of values to be stored in second array");
		int size1=sc.nextInt();
		int b[]=new int[size1];
		System.out.println("Enter the first array values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The first array elements are stored successfully, please enter second array elements");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("The second array elements stored successfully");
		int c[]=new int[size+size1];
		System.out.println("The array elements after merging");
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		int j=0;
		for(int i=a.length;i<c.length;i++)
		{
			c[i]=b[j++];
			
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
}
