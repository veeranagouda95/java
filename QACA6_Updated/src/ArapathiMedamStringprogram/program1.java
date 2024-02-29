package ArapathiMedamStringprogram;

public class program1 {
	public static void main(String[] args) {
		String s="java";
		char[]ch=s.toCharArray();
	
		for (int i = 0; i < ch.length; i++) //this for loop will given comparision  purpose
		{
			String s1="";                   //this will help for the intialize the 
			for (int j = 0; j < ch.length-1; j++) //this for loop will extract one by one values
			{
				s1=s1+ch[j];//adding that values to 
				System.out.println(s1);
			}
		}
	}
}
