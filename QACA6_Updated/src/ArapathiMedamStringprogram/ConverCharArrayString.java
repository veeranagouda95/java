package ArapathiMedamStringprogram;

public class ConverCharArrayString {

	public static void main(String[] args) 
	{
		char[]ch= {'v','e','e','r','a','n','a'};
		String name="";
		for (int i = 0; i < ch.length; i++)
		{
			name=name+ch[i];
		}
		System.out.println(name);
	}
}
//for (int i = ch.length/2; i < ch.length; i++)//answer:-rana
//name=name+ch[i]+" ";//answer:-v e e r a n a 