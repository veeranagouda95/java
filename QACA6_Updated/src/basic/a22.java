package basic;

import java.util.Scanner;

public class a22{
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System .in);
		System.out.println("enter the string");
		String s1 = sc.nextLine();
		String[] str = s1.split("");
		String[] str1=rev(str);
		for (int i = 0; i < str1.length; i++)
		{
			System.out.println(str1[i]+"");
		}
	}

	public static String[] rev(String[] str)
	{

		for (int i = 0; i < str.length; i++)
		{
			String s=str[i];
			String s2="";
			for (int j = 0; j < s.length(); j++) {
				s2=s.charAt(j)+s2;
			}
			str[i]=s2;

		}
		return str;
	}
}

