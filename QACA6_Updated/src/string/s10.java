package string;

import java.util.Scanner;

//wajp the subset string FUN
//F
//FU
//FUN
//U
//UN
//N
public class s10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one string");
		String s=sc.nextLine();
		char [] ch=s.toCharArray();
		for (int j = 0; j < ch.length; j++)
		{
			String s1="";	
			for (int i = j; i < ch.length; i++)
			{
				s1=s1+ch[i];
				System.out.println(s1);

			}

		}
	}
}