package ArapathiMedamStringprogram;

public class program3 {
	public static void main(String[] args) {
		String s="BANGALORE";
		char[]ch=s.toCharArray();
		int k=0;
		int n=4;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print(ch[k++]+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
