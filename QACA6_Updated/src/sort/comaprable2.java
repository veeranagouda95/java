package sort;

import java.util.Scanner;
//same program string=>convert charcter compareing to
public class comaprable2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		//	String s= "veernagouda";
		int count=s.length();
		char[] ch=new char[count];
		
		for (int i = 0; i < count; i++) {
			ch[i]=s.charAt(i);
		}
		
		boolean[] b=new boolean[count];
		for (int i = 0; i < count; i++) {
			int count1=1;
			if(b[i]==false) {
				for (int j = i+1; j <count ; j++) {
					if(ch[i]==ch[j]) {
						count1++;
						b[j]=true;
					}
				}
				if(ch[i]!=32)
					System.out.println(ch[i]+"="+count1);
			}


		}
	}
}
