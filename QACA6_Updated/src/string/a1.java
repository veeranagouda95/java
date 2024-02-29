package string;

import java.util.Iterator;
import java.util.Scanner;

//to convert uppercase alphbet into upper alphbet both vice vers
public class a1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		char[] ch=s.toCharArray();
		boolean flag=true;
		for (int i = 0; i < ch.length; i++) {
			
			if (ch[i]>='0' && ch[i]<='9') {
				
				
			} else {
                   flag=false;
                   
			}
			
			
		}
		if (flag) {
			System.out.println("the given string contains only digits");
		}
		else
		{
			System.out.println("the given string not contains only digits");
		}
	}
}
