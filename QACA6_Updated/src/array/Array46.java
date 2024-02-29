//WAJP to add an element at a particular index in an integer array
package array;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class Array46 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the array elements");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the index where need to add the element");
	int index=sc.nextInt();
	System.out.println("Enter the element ");
	int element=sc.nextInt();
	int res[]=add(a,element,index);
	System.out.println("New array elements");
	for(int i=0;i<res.length;i++)
	{
		System.out.println(res[i]);
	}
}
public static int [] add(int a[],int element,int index)
{
	if(index<0 || index>a.length)
	{
		System.out.println("index is not in range");
		return a;
	}
	int res[]=new int[a.length+1];
	res[index]=element;
	for(int i=0;i<a.length;i++)
	{
		if(i<index)
			res[i]=a[i];
		else
			res[i+1]=a[i];
	}
	return res;
}
}
