package ArapathiMedamStringprogram;

public class printRepeatedcharcterInString {

	public static void main(String[] args) {
		String s="aaabbccdddde";
		
		char[]ch=s.toCharArray();
		
		Boolean []b=new Boolean[ch.length];
		
		for (int i = 0; i < ch.length; i++)
		{
			int count=0;
			if(b[i]==false) 
			{
				for (int j = i+1; j < ch.length; j++)
				{
					if (ch[i]==ch[j]) 
					{
						b[j]=true;
						count++;
					}
				}
				if(count>0) 
				{
					System.out.println(ch[i]+"");
				}
			}
		}
	}
}
