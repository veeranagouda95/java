package collections1;

import java.util.ArrayList;
import java.util.Scanner;

public class f3 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter size of fruit" );
			int length=sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < length; i++) {
				System.out.println("enter the name fruit");
				String name=sc.nextLine();
				ls.add(name);
				
			}
			System.out.println(ls);
			
		}

}
