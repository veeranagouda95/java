package string;

public class ReverseStringEachWordCharByChar1 {

	public static void main(String[] args) {
		String s="i am softer enginnering";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++)
		{
         //  System.out.print(s1[i]);
           String temp=s1[i];
          char[] ch= temp.toCharArray();
           for (int  j = ch.length-1; j>=0;j--) 
           {
			System.out.print(ch[j]);
			
		}
           System.out.print(" ");
		}
	}
}