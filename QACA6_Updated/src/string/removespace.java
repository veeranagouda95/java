package string;
//wajp to remove the spaces in the given string
import java.util.Scanner;

public class removespace {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s = sc.nextLine();
String [] s1=s.split("");
for (int i = 0; i < s1.length; i++) {
	System.out.println(s1[i]);
}
	
}
}
