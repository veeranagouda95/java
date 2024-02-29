//WAJP to find the largest length name present in a string array
package array;

import java.util.Scanner;

public class Array14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of names to be stored");
		int size=sc.nextInt();
		String s[]=new String[size];
		System.out.println("Enter the names");
		sc.nextLine();
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.nextLine();
		}
		System.out.println("The names are stored successfully");
		int len=s[0].length();
		String name=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(len<s[i].length())
			{
				len=s[i].length();
				name=s[i];
			}

		}
		System.out.println("The names which has maximun length is : "+name);
	}
}
