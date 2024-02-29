package string;

import java.util.Scanner;

//wajp to check whether the given string is a paildrome String or not


public class GivenStringpaildromeOrNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s = sc.next();
	char []ch=s.toCharArray();
	String s1="";
	
	//reverse the for loop also conditions also 
	for (int i=ch.length-1;i>=0; i--) {
		s1=s1+ch[i];
	}
	//using equalsignorecase method help for the compares the two strings
	if(s1.equalsIgnoreCase(s))
		System.out.println("the given string is a paildrome string");
	else
		System.out.println("the given string is not  a paildrome string");
}
}
