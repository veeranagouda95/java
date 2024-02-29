package array;

import java.util.Scanner;
import java.util.Stack;

import arrays.StringToCharArray;

public class DD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String key=sc.nextLine();
		boolean res=isValid(key);
		if(res)
			System.out.println("It's a balanced bracket");
		else
			System.out.println("It's not a balanced bracket");

	}
	public static boolean isValid(String s)
	{
		Stack<Character> st=new Stack<>();
		for(char ch:s.toCharArray())
		{
			if((ch=='(')||(ch=='{')||(ch=='['))
			{
				st.push(ch);
			}
			else if((ch==')')||(ch=='}')||(ch==']'))
			{
				if(st.isEmpty())
				{
					return false;
				}
				char top=st.pop();
				if(((ch==')'&& top!='('))||(ch=='}'&& top!='{')||(ch==']'&& top!='['))
				{
					return false;
				}
			}
			
		}
		return st.isEmpty();
	}
}
