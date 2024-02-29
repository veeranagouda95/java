package aripathMedamArrayProgram;

public class Duplicateelements {

	public static void main(String[] args) {
		int[]a= {10,10,20,50,50,70,70,70,90};
		boolean[]b=new boolean[a.length];
		for (int i = 0; i < b.length; i++)
		{
			int count=0;
			if (b[i]==false) 
			{
				for (int j = 0; j < b.length; j++)
				{
					if (a[i]==a[j]) 
					{
						count++;
						b[j]=true;
					}
				}
				if (count>0)
				{
					System.out.println(a[i]+" is an repeated element");
				}
			}
			
		}
	}
}
