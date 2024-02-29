//WAJP to print elements based on the the largest elements order present in an integer array
package array;

import java.util.Scanner;

public class Array41 {
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
		for(int k=1;k<=a.length;k++)
		{
			int key=k;
			for(int i=0;i<a.length;i++)
			{
				int count=0;
				for(int j=0;j<a.length;j++)
				{
					if(a[j]>a[i])
						count++;
				}
				if(count==key-1)
				{
					System.out.println(key+ " largest element is: "+a[i]);
					break;
				}
			}
		}
	}
}
