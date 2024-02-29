package string;
//wajp to vaildate password 
import java.util.Scanner;

//wajp to vaildate password
public class vaildatepassword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		int up=0;int low=0;int digi=0;int spec=0;int space=0;
		char ch[]=s.toCharArray();
		if(s.length()>=8 && s.length()<=15) 
		{	  

			for (int i = 0; i < ch.length; i++) 
			{
              if(ch[i]>='A'&&ch[i]<='Z')
            	  up++;
              if(ch[i]>='a'&&ch[i]<='z')
            	  low++;
              if(ch[i]>='0'&&ch[i]<='9')
            	  digi++;
              if(ch[i]=='$'||ch[i]=='#'||ch[i]=='@'||ch[i]=='!')
            	  spec++;
              
			}
			if(up>=1 && low>=1 && digi>=1 && spec>=1 && space==0)
				System.out.println("you are entered valid password");
			else
			{
				System.out.println("you are entered invaild password");
				System.out.println("password should be contain atleast 1 upper case 1 lower case 1 special charcter ");
			}
		}
		else {
			System.out.println("you have entered invaild password");
			System.out.println("password should be in range of 8 to 15");
		}
	}
}