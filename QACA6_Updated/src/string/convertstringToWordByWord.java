package string;

import java.util.Scanner;

//wajp to String to word by word 


public class convertstringToWordByWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s = sc.nextLine();
		
		//it will spilit the word bye using split method present in the string class
		String [] s1=s.split("");
		String temp="";
		
		//revrese the for loop 
		for (int i=s1.length-1; i>=0; i--) 
		{
			temp=temp+s1[i]+"";
		}
		System.out.println(temp);
	}
}
