package collections1;

import java.util.ArrayList;
import java.util.Collections;

public class batDrive {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList<>();
		ls.add(new bat("mrf",7500 ));
		ls.add(new bat("adibas",8500 ));
		ls.add(new bat("ceat",9500 ));
		ls.add(new bat("reebook",7800 ));
		System.out.println("before sorting:");
		//to sort the collection
		Collections.sort(ls);
		System.out.println("after sorting:" +ls);
		
	}
}
