package collections1;

import java.util.HashSet;

//hashset accepted null value in it
public class hs2 {
public static void main(String[] args) {
	HashSet set=new HashSet<>();
	set.add(10);
	set.add(20);
	set.add(null);
	set.add(null);//it does not applyacable duplicated valies
	set.add("gouda");//it applycable the value also
	set.add('b');//it will take chaerter in the order
	
	System.out.println(set);
}
}
