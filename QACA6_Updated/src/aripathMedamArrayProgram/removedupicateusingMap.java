package aripathMedamArrayProgram;

import java.util.Arrays;
import java.util.HashMap;

public class removedupicateusingMap
{
//to remove the duplicate and also values
	static String removeduplicate(char str[],int n) 
	{
		
		//used as index in the modification string
		int index=0;
		
		//traverse through all charcters
		for (int i = 0; i < n; i++)
		{
			  
			  //check if str[i] is present before it 
			  int j2;
			  for ( j2 = 0; j2 < i; j2++) 
			  {
				if (str[i]==str[j2]) 
				{
					break;
				}
			  }
			  //if not present,then add it to
			  //result
			  
			  
			 if (j2==i) 
			 {
				str[index++]=str[i];
			  }	  
		}
		return String.valueOf(Arrays.copyOf(str, index));
	}
	public static void main(String[] args) {
		char[] str="Dell".toCharArray();
		int n=str.length;
		System.out.println(removeduplicate(str,n));
	}
}
