package string;
//wajp to count number of owles and consonent present in string
public class a2 {
	public static void main(String[] args) {
		String s="veeranagouda";//if a add any spical charcter it not taken that value#@$%
		int vowels=0;
		int consonent=0;
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			char ch1=ch[i];
			if(ch1>='A'&& ch1<='Z'|| ch1>='a' && ch1<='z') 
			{
				if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'||ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') 
				{
					vowels++;

				}
				else
					consonent++;
			}
		}
		System.out.println("vowels    :"+vowels);
		System.out.println("consonent   :"+consonent);
	}
}
