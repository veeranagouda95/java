package collections1;

//convert array into arryalist
import java.util.ArrayList;

public class c2 {
public static void main(String[] args) 
{
	
	Integer[] s= {10,20,30,40};
	ArrayList i = tolist(s);
	System.out.println(i);
}
public static ArrayList tolist(Object[]o) 
{
	ArrayList ls=new ArrayList();
	for (Object object : o)
	{
		ls.add(object);
	}
	return ls;
}
}
