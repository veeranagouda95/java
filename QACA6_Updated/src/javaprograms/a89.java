package javaprograms;
//WAJP to print the odd numbers present in the given array 


import java.util.Scanner;

public class a89 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to pass");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the "+size+" number of values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The odd numbers present in the given array are");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==1) {
				
			}
				System.out.println(a[i]);
					
		}

	}
}




