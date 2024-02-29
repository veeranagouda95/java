package collections1;

import java.util.ArrayList;
import java.util.Scanner;

public class f5 {
	public static void main(String[] args) {
		ArrayList b=new ArrayList();
		System.out.println(b);
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		System.out.println(b);
		Scanner s=new scanner(System.in);
		int key=s.nextInt();
		//passed value of 30
		if(b.contains(key))
			System.out.println(key+"is present inside collection the index :"+b.indexof(key));
		else
			System.out.println(key+"is not  present inside collection the index :"+b.indexof(key));
		
	}
}

		
		

