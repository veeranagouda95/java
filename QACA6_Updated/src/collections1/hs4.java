package collections1;

import java.util.ArrayList;
import java.util.HashSet;

//convert to list to set

public class hs4 {
public static void main(String[] args) {
	ArrayList ls=new ArrayList<>();
	ls.add(10);
	ls.add(20);
	ls.add(30);
	ls.add(20);
	ls.add(50);
	System.out.println(ls);
	
	//convertlist to set
	HashSet set=new HashSet<>(ls);
	System.out.println(set);//it will not allowed the duplicates
	
	
}
}
