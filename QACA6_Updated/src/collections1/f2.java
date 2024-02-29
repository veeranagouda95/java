package collections1;

import java.util.ArrayList;

public class f2 {
	public static void main(String[] args) {
		ArrayList te=new ArrayList();
			te.add("smith");
		te.add("adams");
		te.add("jhon");
		System.out.println(te.size());
		System.out.println(te);
		System.out.println(te.isEmpty());
		
		ArrayList de=new ArrayList();
		
		de.add("smith");
		de.add("adams");
		de.add("jhon");
		System.out.println(de.size());
		System.out.println(de);
		System.out.println(de.isEmpty());
		
		de.add(te);
		System.out.println(de);
		te.addAll(0,de);
System.out.println(te);	
	}

}
