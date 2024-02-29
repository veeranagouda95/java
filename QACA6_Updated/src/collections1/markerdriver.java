package collections1;

import java.util.ArrayList;
import java.util.Collections;

public class markerdriver {
public static void main(String[] args) {
	
	ArrayList ls=new ArrayList();
	
	ls.add(new marker(102, "black",40));//here we use ls.add(int index,object element)-void
	//System.out.println(ls);
	ls.add(new marker(103, "red",20));
	ls.add(new marker(104, "yellow",30));
	ls.add(new marker(101, "blue",405));
	System.out.println(ls);
	
	
	
	
	
	
	
	
	
	
	
	//to sort
	Collections.sort(ls);
	System.out.println("after sorting:"+ls);
}
}
