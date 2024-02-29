package collections1;

import java.util.ArrayList;

public class remove {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		//to remove 20 from list
		ls.remove(Integer.valueOf(20));
		System.out.println(ls);
	}

}
