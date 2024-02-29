package aripathMedamArrayProgram;

public class MissingElements {

	public static void main(String[] args) {
		int[]a= {1,2,4,6,7,8};
		for (int i = 1; i <=10; i++) 
		{
			int count=0;
			for (int j = 0; j < a.length; j++) 
			{
				if (a[j]==i)
				{
					count++;
					break;
				}
			}
			if (count==0) 
			{
				System.out.println(i);
			}
		}
		
	}
}
