package javaprograms;

import java.util.Scanner;

public class array9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char[]ch=new char[5];
		System.out.println("enter the charcters");
		for (int i = 0; i < ch.length; i++) {
			ch[i]=s.next().charAt(0);

		}
		System.out.println("enter charctrs are");
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}
}
