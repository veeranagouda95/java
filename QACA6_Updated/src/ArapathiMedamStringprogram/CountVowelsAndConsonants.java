package ArapathiMedamStringprogram;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		String s="veeranagouda";
		char[]ch=s.toCharArray();
		int v=0;
		int c=0;
		
		for (int i = 0; i < ch.length; i++)
		{
			//first write uppercase and lower case values decsion statment
			if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z') 
			{
				//only for vowels put in one conditions 
				if (ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') 
				{	
					v++;
				} 
				else 
				{
                    c++;
				}
			}
		}
		System.out.println("vowels: "+v);
		System.out.println("consonants :"+c);
	}
	
}
