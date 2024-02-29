package aripathMedamArrayProgram;

public class LargestElementWithRank {

	public static void main(String[] args) {
		int[]a= {10,80,60,40,20,70,90,30};
		for (int n = 1; n < a.length; n++) 
		{
			for (int i = 0; i < a.length; i++) 
			{
				int count=1;
				for (int j = 0; j < a.length; j++) 
				{
					if (a[j]>a[i]) 
					{
						count++;
					}
				}
				if (count==n) 
				{
					System.out.println(a[i]+" is "+count+" largest element");
				}
			}
		}
	}
}
