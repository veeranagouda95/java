package string;

//wajp to replace a space by a specied  special charcter
import java.util.Scanner;

public class replacespacewithspecchar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one string");
		String s1 = sc.nextLine();
		System.out.println("enter the character");
		char  ch=sc.next().charAt(0);
		char [] c=s1.toCharArray();
		for (int i = 0; i < c.length; i++)
		{
			if(c[i]==' ')
			{
				c[i]=ch;
			}
		}
		s1=new String(c);
		System.out.println(s1);


	}
}
