package ArapathiMedamStringprogram;

public class ConvertLoWerCaseUpperCase
{
public static void main(String[] args)
{
	String s="veerAna";
	char[]ch=s.toCharArray();
	char [] ch1=new char[ch.length];
	
	for (int i = 0; i < ch.length; i++)
	{
		if (ch[i]>='a' && ch[i]<='z')
		{
			ch1[i]=(char) (ch[i]-32);
		}
	}
	String s1=new String(ch1);
	System.out.println(s1);
}
}
