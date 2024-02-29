package collections1;

import java.util.ArrayList;

public class remove2 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(20.0);
		ls.add(30.2);
		ls.add(40.3);
		ls.add(50.6);
		System.out.println(ls);
		//to remove 20 from list
		//ls.remove('c');
		ls.remove(Double.valueOf(50.6));
		System.out.println(ls);

	}
}
