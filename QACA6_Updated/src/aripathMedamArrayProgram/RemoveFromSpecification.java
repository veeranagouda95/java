package aripathMedamArrayProgram;

public class RemoveFromSpecification {

	public static void main(String[] args) {
		int[]a= {10,80,60,40,20,70,90,30};
		int[]res=new int[a.length-1];
		int index=2;
		for (int i = 0; i < res.length; i++) 
		{
		if (i<index) 
		{
			res[i]=a[i];
		} 
		else
		{
            res[i]=a[i+1];
		}
		}	
		for (int i = 0; i < res.length; i++) 
		{
			System.out.println(res[i]);
		}
	}
}
