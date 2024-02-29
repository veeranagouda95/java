package ArapathiMedamStringprogram;

import java.util.Scanner;

public class ValidatePassword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the password");
		String s = sc.nextLine();
		int up=0,low=0,digit=0,spe=0,space=0;

		if (s.length()>=8 && s.length()<=15)
		{
			char[]ch=s.toCharArray();

			for (int i = 0; i < ch.length; i++) 
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					low++;
				}
				else if (ch[i]>='A' && ch[i]<='Z') 
				{
					up++;
				}
				else if (ch[i]>='0' && ch[i]<='9')
				{
					digit++;

				}
				else if (ch[i]==' ') 
				{
					space++;
				}
				else if (ch[i]=='$' || ch[i]=='#'||ch[i]=='@'||ch[i]=='!')
				{
					spe++;
				}
			}
			if (up>0 && low>0 && digit>0 && spe>0 && space==0) 
			{
				System.out.println("correct password");
			} else {
				System.out.println("worng password");
			}
		}
		else {
			System.out.println("please enter password in range 8 to 15");
		} 

	}
}
