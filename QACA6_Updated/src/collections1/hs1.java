package collections1;

import java.util.HashSet;

public class hs1 {
	public static void main(String[] args) {
		HashSet set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println(set);
		System.out.println(set.clone());   //double the hashset values
		System.out.println(set.parallelStream());  //this will gives address of stream of collctiones
		//answer:-java.util.stream.ReferencePipeline$Head@5caf905d
		
		System.out.println(set.iterator());//it will give addres of the hashset of the given that order 
		//answer:-java.util.HashMap$KeyIterator@27716f4
		
         System.out.println(set.spliterator());//it will give the address spliterator java.util.HashMap$KeySpliterator@8efb846
         System.out.println(set.stream());//java.util.stream.ReferencePipeline$Head@2a84aee7
		
		
	}
	}

