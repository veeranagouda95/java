package string;

import java.util.HashMap;
import java.util.Map;

import map.map1;

//occurnce of reverse string using the hashmap
public class OccurenceStringInReverseUsingHASHMAP {

	public static String reversestring(String input) 
	{
		if(input==null)
		{
			return null;
		}
		
	//create a hashmap to store the charcter occurence
		Map<Character, Integer> charoccurence=new HashMap<>();
		
	//count the occurence of each charcter in the input string
		for (char c : input.toCharArray()) 
		{
			if(charoccurence.get(c)>0) 
			{
				reversestring.append(c);
				charoccurence.put(c, charoccurence.get(c)-1);
				
			}
			
		}
		return 
		
	}
	public static void main(String[] args) {
		String input="occurnce";
		String reversed=reversestring(input);
		System.out.println("original : "+ input);
		System.out.println("reversed : "+ reversed);
	}
}
