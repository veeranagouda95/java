package collections1;

import java.util.ArrayList;



public class f4 {
	public static void main(String[] args) {
		
		
		ArrayList te=new Arraylist();
		te.add("smith");
		te.add("adams");
		te.add("jhon");
		System.out.println(te.size());
		System.out.println(te);
		System.out.println(te.isEmpty());
		
		ArrayList de=new Arraylist();
		de.add("miller");
		de.add("king");
		de.add("jackon");
		System.out.println(de.size());
		System.out.println(de);
		System.out.println(de.isEmpty());
		de.add(te);
		System.out.println(de);
		
		}
}
