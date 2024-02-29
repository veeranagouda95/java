package aripathMedamArrayProgram;

public class mergeArrays {

	public static void main(String[] args) {
		int[]a= {10,20,30,40,50};
		int[]b= {60,70,80,90,100};
		int res[]=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) 
		{
			res[i]=a[i];
			
		}
		for (int i = 0; i < b.length; i++) 
		{
			res[a.length+i]=b[i];
			
		}
		for (int i = 0; i < res.length; i++) 
		{
			System.out.println(res[i]);
		}
	}
}
