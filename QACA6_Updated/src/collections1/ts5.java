package collections1;

import java.util.Collections;
import java.util.HashSet;

//write a java program to sort the set in descending order
public class ts5 {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		System.out.println(set);
		
		//to convert hashset to list
		ArryaList ls=new ArryaList(set);
		
		System.out.println(ls);
		
		//to sort the elemnets 
		Collections.sort(ls);
		System.out.println(ls);
		
		//to reverse the elements
		Collections.reverse(ls);
		
		
	}
	
}
