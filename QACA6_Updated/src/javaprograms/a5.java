package javaprograms;

import java.util.Scanner;

//WaJP to create a charcter array of size 5 read the charcters from the user and store it inside the charcter array
public class a5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 5 character");
		char[]ch=new char[5];//sc.next().charAt(0)=>this wait for takes only one charcter don't take second charcter
		for (int i= 0; i< ch.length; i++) {


			ch[i]=sc.next().charAt(0);
		}
		System.out.println("the charcters are stored successfully");
		System.out.println("the charcters are present is array are");
		for (int i = 0; i < ch.length; i++) {


			System.out.println(ch[i]);
		}

	}
}
