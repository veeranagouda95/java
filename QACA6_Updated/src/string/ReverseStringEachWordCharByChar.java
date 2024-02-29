package string;

import java.util.Scanner;

//wajp to reverse String Each word charcter by charcter
public class ReverseStringEachWordCharByChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one string");
		String s = sc.nextLine();
		String [] s1=s.split("");
		String temp="";
		for (int i = 0; i < s1.length; i++) 
		{
			String str=s1[i];
		    char[] ch=str.toCharArray();
			for (int j=ch.length-1; j>=0;j--) 
			{
				System.out.print(ch[j]);
			}
	
		}
	//	System.out.print(temp);
	}

}
