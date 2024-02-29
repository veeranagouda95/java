
//WAJP to search for an element using Binary search
package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array31 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to be store");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the "+size+" values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be search");
		int key=sc.nextInt();
		Arrays.sort(a);
		int low=0;
		int high=a.length-1;
		int count=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==a[mid])
			{
				count++;
				break;
			}
			else if(key<a[mid])
				high=mid-1;
			else if(key>a[mid])
				low=mid+1;

		}
		if(count==1)
			System.out.println(key+" is found");
		else
			System.out.println(key+" is not found");
	}
}
