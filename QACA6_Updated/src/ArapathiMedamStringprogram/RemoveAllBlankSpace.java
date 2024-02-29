package ArapathiMedamStringprogram;

public class RemoveAllBlankSpace {

	public static void main(String[] args) {
		
		String s="ve er ana gouda";
		
		char[]ch=s.toCharArray();
		String s1="";
		
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]!=' ')
			{
				s1=s1+ch[i];
			}
		}
		System.out.println(s1);
		
	}
}
