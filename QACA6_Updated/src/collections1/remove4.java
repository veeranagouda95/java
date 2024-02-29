package collections1;

import java.util.ArrayList;

public class remove4 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		
	
	
		ArrayList ls1=new ArrayList();
		ls1.add(10);
		ls1.add(60);
		ls1.add(30);
		ls1.add(50);
		System.out.println(ls1);
		System.out.println("after removing" );
		ls.retainAll(ls1);//to remove common elemnts in to arraylist with refered collction
		System.out.println(ls);
	
	}
}
