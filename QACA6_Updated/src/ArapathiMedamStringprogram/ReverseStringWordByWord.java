package ArapathiMedamStringprogram;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		String s="all the best";
		String[]s1=s.split(" ");
		String temp=" ";
		for (int  i = s1.length-1; i>=0;i--) 
		{
			temp=temp+s1[i]+" ";
			
		}
		System.out.println(temp);
	}
}
