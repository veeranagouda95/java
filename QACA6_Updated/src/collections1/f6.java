package collections1;

import java.util.ArrayList;

public class f6 {
	public static void main(String[] args) {
		ArrayList b=new ArrayList();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		System.out.println(b);
		
		
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(10);
		a.add(30);
		a.add(40);
		//a.add(50);out of array element present it result false
		System.out.println(a);
		System.out.println(b.containsAll(a));//true elements are present are not
	}
}
		
		

