package string;

import java.util.Scanner;

//wajp to check whether the string contains only digits or not(logic 1)
public class s3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s = sc.next();
	char[] ch=s.toCharArray();
	boolean flag=true;
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]>'0'&& ch[i]<='9') {
			
		}
		else
			flag=false;
	}
	if(flag)
		System.out.println("the given string contains only digits");
	else
		System.out.println("the given string is not containing only digits");
	
}
}
