package sort;

import java.util.Scanner;
//wajp if given string present or not by using array or not
public class selection2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size array");
		int size = sc.nextInt();
		sc.nextLine();
		String [] s=new String[size];//create an object of string type arrya
		System.out.println("enter the elements ");
		for (int i = 0; i < s.length; i++) {
			s[i]=sc.nextLine(); //nextLine() advances this scanner past the current line and returns the 
//input is skipped.
//nextLine method returns the rest of current line ,exculding any line separator at the end to over come 
//nextline method will be used for given elemnts 5 given it will take only four(4) elements			
			
		}
		String key="gouda";
		int count=0;
		for (int i = 0; i < s.length; i++) {
			if(s[i].equals(key)) {
				count++;
				break;
			}


		}
		if(count==1)
		{
			System.out.println("key ispresent");
		}
		else
		{
			System.out.println("key is not present");
		}



	}
}
