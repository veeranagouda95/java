package ArapathiMedamStringprogram;

import java.util.Scanner;

public class StringContainsOnlyDigitsOrNOt {

	public static void main(String[] args) {
		
	/*	String s="1234";//string contains only digits
		//string contains only digits
	    //	string contains only digits
	    //	string contains only digits  4 digits 4 will be printed

		
		char[]ch=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++)
		{
			try 
			{
				Integer.parseInt(s);
				System.out.println("string contains only digits");
			} 
			catch (Exception e)
			{
			    System.out.println("string contains not digits");
			}
		}*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s = sc.nextLine();
		try {
			Integer.parseInt(s);
			System.out.println("string conatins only digits");
		} 
		catch (Exception e) {
			System.out.println("string contains not digits");
		}
	}
}
