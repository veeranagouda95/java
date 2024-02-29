package javaprograms;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter physics marks");
		int b=s.nextInt();
		System.out.println("enter chemistry marks");
		int c=s.nextInt();
		System.out.println("enter biology marks");
		int d=s.nextInt();
		System.out.println("enter maths marks");
		int e=s.nextInt();
		if(b>=35 && c>=35 && d>=35 && e>=35)
		{
			int per=(b+c+d+e/4);
			switch(per) 
			{
			case 1:System.out.println("dist");
			case 2:System.out.println("first");
			case 3:System.out.println("second");
			break;
			//	System.out.println("just pass");
			}
		}

		else
		{
			System.out.println("failed");
		}

	}	
}		




