package collections1;

import java.util.ArrayList;
import java.util.HashSet;

//convet the set to Arrya

public class hs5 
{
public static void main(String[] args) {
	HashSet set =new HashSet<>();
	set.add(10);
	set.add(40);
	set.add(30);
	set.add(20);
	System.out.println(set);
	//to convert hashset to arryalist
	
	ArrayList ls=new ArrayList<>(set);
	System.out.println(ls);
	ls.add(10);
	
	//to convert the list to arrya to using toarrya() method
	
	Object[] o = ls.toArray();
	System.out.println(o);//it will give the addres  of the  arrya in it
	for (Object object : o)//collction will have the for ecah loop u should use it 
	{
		System.out.println(object);
	}
	
	
	
}
	
}
