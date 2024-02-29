package string;

import java.util.Scanner;

public class removespaceL2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
	String s = sc.nextLine();
	String s1=s.replaceAll(" \\s", " ");
	System.out.println(s1);
}
}
