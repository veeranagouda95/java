package collections1;

import java.util.NavigableSet;
import java.util.TreeSet;

//can we reverse the element of treeset without converting them into list

public class ts4 {

	public static void main(String[] args) {
		TreeSet set=new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);//it doesn't allow the duplicate values
		
		System.out.println(set);
		
		//to sort it in descending order or reverse
		
		 NavigableSet s=set.descendingSet();
		System.out.println(s);
		
	}
}
