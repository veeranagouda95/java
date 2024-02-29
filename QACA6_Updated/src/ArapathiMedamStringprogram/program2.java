package ArapathiMedamStringprogram;

public class program2 {
	public static void main(String[] args) {
		String s="FUN";
		char[]ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String s1="";
			for (int j = i; j < ch.length; j++) {
				s1=s1+ch[j];
				System.out.println(s1);
			}
		}
	}
}
