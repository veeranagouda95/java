package collections1;

import java.util.ArrayList;

public class remove1 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add('a');
		ls.add('b');
		ls.add('c');
		ls.add('d');
		System.out.println(ls);
		//to remove 20 from list
		//ls.remove('c');
		ls.remove(Character.valueOf('c'));
		System.out.println(ls);
	}

}
