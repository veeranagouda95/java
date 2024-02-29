package string;

import java.util.Scanner;

//wajp to check whether the string contains only digits or not(logic 2)
public class s4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();
		try {
			Integer.parseInt(s);
			System.out.println("the given string is having only digits");
			
		} catch (Exception e) {
			System.out.println("the given string is not only having the digits it is having some other charcyer");
		}
	}
		
	}

