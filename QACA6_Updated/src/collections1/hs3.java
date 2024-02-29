package collections1;

import java.util.ArrayList;
import java.util.HashSet;

//convert set into the list

public class hs3 {
public static void main(String[] args) {
	HashSet set=new HashSet<>();
	set.add(10);
	set.add("gouda");
	set.add('j');
	
	System.out.println(set);
	
	ArrayList ls=new ArrayList<>(set);
	//set.add(25);
	System.out.println(ls);//arraylist is also hetergenoius collction
	ls.add(25);
	System.out.println(ls);//it will added to particular element
	
}
	
}
