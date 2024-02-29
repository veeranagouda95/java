package collctions;

import java.io.Serializable;
import java.util.ArrayList;

public class test {
	public static void main(String[] args) {


		ArrayList<String> te=new ArrayList();
		te.add("smith");
		te.add("adams");
		te.add("jhon");
		System.out.println(te.size());
		System.out.println(te);
		System.out.println(te.isEmpty());

		ArrayList<Serializable> de=new ArrayList();
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
