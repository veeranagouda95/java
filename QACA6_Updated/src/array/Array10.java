//WAJP to create a character array of size 5 read the characters from the user and store it inside the character array
package array;

import java.util.Scanner;

public class Array10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 character");
		char ch[]=new char[5];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		System.out.println("The characters are stored successfully");
		System.out.println("The characters present in the array are");
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
}
