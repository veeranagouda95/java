package collections1;

import java.util.ArrayList;
import java.util.ListIterator;

public class classdriver {
	public static void main(String[] args) {
		ArrayList<book> bs=new ArrayList<book>();
		bs.add(new book(101,"manualtesting",200));
		bs.add(new book(102,"java",300));
		bs.add(new book(103,"sql",400));
		bs.add(new book(104,"api",500));
		System.out.println(bs);
		
	ListIterator li =bs.listIterator();
	while(li.hasNext())
	{
		book b=li.next();
		if(b.pid==103)
		{
			li.set(new book(108,"sql"400.1));
		}
	}
	System.out.println("after modi");


	}

}
