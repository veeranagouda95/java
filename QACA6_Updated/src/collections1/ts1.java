package collections1;

import java.util.TreeSet;

//tree set how the program will be work it

public class ts1
{
	public static void main(String[] args) {
		TreeSet set=new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);//it doesnot allow the duplicated
	//	set.add("gouda");//error class cast exception in it it not string
	//	set.add('d');////error class cast exception in it it not string
		System.out.println(set);
				
		/*TreeSet set1=new TreeSet<>();
		set1.add(10);
		set1.add("gouda");
		set1.add('h');
		System.out.println(set1);*/ //not allowed  we are getting classcast exception error
		//solution will be the using comprable interface in it
	}
}
