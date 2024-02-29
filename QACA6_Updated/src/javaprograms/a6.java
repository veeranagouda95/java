package javaprograms;

import java.util.Iterator;
import java.util.Scanner;

public class a6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of names to be stored");
		int size=sc.nextInt();
		String s[]=new String[size];
		System.out.println("enter the names ");
		//sc.nextLine();
		for (int i = 0; i < s.length; i++) {
			s[i]=sc.nextLine();
			
		}
		System.out.println("the names are stored succesfully ");
		int len=s[0].length();
		String name=s[0];
		for (int i = 0; i < s.length; i++) {
			if(len<s[i].length());
			{
				len=s[i].length();
				name=s[i];
			}
		}
		System.out.println("the names which maximum length"+name);
	}

}
