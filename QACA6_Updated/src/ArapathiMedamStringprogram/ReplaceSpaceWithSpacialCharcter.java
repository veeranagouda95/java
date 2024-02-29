package ArapathiMedamStringprogram;

import java.util.Scanner;

public class ReplaceSpaceWithSpacialCharcter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s = sc.nextLine();
		System.out.println("enter a charcter");
		char ch=sc.next().charAt(0);
		char[] c=s.toCharArray();
		for (int i = 0; i < c.length; i++)
		{
			if (c[i]==' ')
			{
				c[i]=ch;
			}
		}
		s=new String(c);
		System.out.println(s);
		
				
	}
}
