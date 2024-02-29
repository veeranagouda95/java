package collections1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class convert {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println(set);
		//convert hashset int0 list
	Collection c=new ArrayList<>(set);
		
		System.out.println(c);
		
		
		
		
	}

}
