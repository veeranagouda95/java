//WAJP to print the elements present in the odd index
package array;

import java.util.Scanner;

public class Array6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of values you want to store");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the "+size+" of values");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("The elements present in the odd index in the array are ");
	for(int i=0;i<a.length;i++)
	{
		if(i%2==1)
			System.out.println(a[i]);
	}
}
}
