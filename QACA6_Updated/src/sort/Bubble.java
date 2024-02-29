package sort;

import java.util.Iterator;

public class Bubble {
public static void main(String[] args) {
	int []a= {10,50,20,25,40,8,5,3,9,10};
	int n=a.length;
	System.out.println("before sorting");
//	System.out.println(a[n-1]);
	for (int i = 0; i < n-1; i++)//this for loop used for number passes
	{
		for (int j = 0; j < n-1; j++)//this for loop for comparsion purpose element
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			
		}
	}
	System.out.println("after sorting");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
