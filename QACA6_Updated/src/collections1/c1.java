package collections1;
//we convert arraylist into arrya 
import java.util.ArrayList;

public class c1 {
public static void main(String[] args) {
	ArrayList ls=new ArrayList<>();
	ls.add(10);
	ls.add(20);
	ls.add(30);
	ls.add(40);
	System.out.println(ls);
	Object[] o = ls.toArray();
	System.out.println(o);//address of the arrya object
	for (Object object : o)
	{
		System.out.println(object);
	}
}
}
