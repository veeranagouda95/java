//WAJP to find the key element in an integer array Linear search
package array;

import java.util.Scanner;

public class Array30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to be stored");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the "+size+" values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be search");
		int key=sc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				count++;
				break;
			}
		}
		if(count==1)
			System.out.println(key+" is found in the array");
		else
			System.out.println(key+" not found in the array");

	}
}
