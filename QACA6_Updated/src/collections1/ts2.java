package collections1;

import java.util.ArrayList;
import java.util.TreeSet;

//convert list to treeset

public class ts2 {
public static void main(String[] args) {
	ArrayList ls=new ArrayList<>();
	ls.add(10);
	ls.add(20);
	//ls.add("null");//it allow the null values
	ls.add(10);
	System.out.println(ls);
	
//	convert list to treeset
	TreeSet set=new TreeSet<>(ls);
	System.out.println(set);//null value does not allowed in it set does not taken in it
	
	
}
}
