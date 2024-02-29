package collections1;

import java.util.Iterator;
import java.util.TreeSet;

//can we access the elemnets of tree set in descending order without using descendingset()

public class ts6 {
public static void main(String[] args)
{
	TreeSet set =new TreeSet();
	set.add(10);
	set.add(20);
	set.add(30);
	System.out.println(set);
	
	//to access the elements 
	Iterator i = set.descendingIterator();
	while (i.hasNext()) {
		System.out.println(i.next());
		
	}
	
}

}
