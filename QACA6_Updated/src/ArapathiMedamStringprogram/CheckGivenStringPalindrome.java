package ArapathiMedamStringprogram;

public class CheckGivenStringPalindrome {

	
	//main method
	public static void main(String[] args) {
		
		String s="12455";
		
		char[]ch=s.toCharArray();
		
		String s1="";
		
		for (int i =ch.length-1; i>=0;i--) 
		{
			s1=s1+ch[i];
		}
		if (s.equalsIgnoreCase(s1)) 
		{
			System.out.println("the given string pailndrome");
		} 
		else
		{
			System.out.println("the given string not pailndrome");
		}
	}
}
