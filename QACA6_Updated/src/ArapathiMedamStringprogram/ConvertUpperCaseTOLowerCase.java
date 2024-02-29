package ArapathiMedamStringprogram;

public class ConvertUpperCaseTOLowerCase 
{
public static void main(String[] args) 
{
	String s="VEERANA";
	char[]ch=s.toCharArray();//V,E,E,R,A,N,A
	char[]ch1=new char[ch.length];
	for (int i = 0; i < ch.length; i++)
	{
		if (ch[i]>='A'&& ch[i]<='Z')
		{
			ch1[i]=(char)(ch[i]+32);
		}
	}
	
	
	
	String s1=new String(ch1);
	System.out.println(s1);
}
}