package javaprograms;
//WAJP to create a string array and read 5 names and store it in that array and print it
import java.util.Scanner;

public class a1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s[]=new String[5];
	System.out.println("enter the 5 names");
	for (int i = 0; i < s.length; i++) {
		s[i]=sc.nextLine();
	}
	System.out.println("the names are stored successfully");
	System.out.println("the names present in the array are");
	for (int i = 0; i < s.length; i++) {
		System.out.println(s[i]);
	}
}
}
