package collections1;

import java.util.ArrayList;
import java.util.Scanner;

public class prime {
	public static ArrayList returnEven(int lowerlimit,int upperlimit)
	{
		ArrayList ls=new ArrayList();
		for (int num = lowerlimit; num <= upperlimit; num++) {
			int count=0;
			for (int i = 2; i < num; i++) {
				if(num%i==0)
				{
					count++;
					break;
				}
				
			}
			if(count==0)
			{
				ls.add(num);
			}
		}
		return ls;
		
	}
	public static void main(String[] args) {
		Scanner s=new scanner(system.in);
		System.out.println("press an interger value for lower limit");
		int m=s.nextInt();
		System.out.println("pass an integer value for upperlimit");
		int n=s.nextInt();
		System.out.println(returnEven(m,n));
	}

}
