package collctions;

import java.util.ArrayList;
import java.util.Scanner;

public class onetoHundreadEvenNUMBER {
public static ArrayList returnEven(int lowerlimit,int upperlimit) {
	ArrayList ls=new ArrayList<>();
	for (int num = lowerlimit; num < upperlimit; num++) 
	{
		int count=0;
		for (int i = 2; i < num; i++)
		{
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
	Scanner sc=new Scanner(System.in);
	System.out.println("pass an integer value for lowerlimit");
	int m = sc.nextInt();
	System.out.println("pass an integer value for upeerlimit");
	int n = sc.nextInt();
	System.out.println(returnEven(m,n));
}
}
