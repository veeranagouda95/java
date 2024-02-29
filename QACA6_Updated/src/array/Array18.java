//WAJP to design a method which which return whether the array element is prime or not based on that print the prime numbers present in the array
package array;

import java.util.Scanner;

public class Array18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to be stored");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the "+size+" number to be stored");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The prime numbers present in the given array are");
		for(int i=0;i<a.length;i++)
		{
			boolean res=isPrime(a[i]);
			if(res)
				System.out.println(a[i]);
		}

	}
	public static boolean isPrime(int n)
	{
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0) {


				return false;
			}

			i++;
		}		
		return true;
	}

}
