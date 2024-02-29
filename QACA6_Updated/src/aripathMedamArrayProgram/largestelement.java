package aripathMedamArrayProgram;

public class largestelement {

	public static void main(String[] args) {
		
		int[]a= {72,9,12,83,20,14,20,0,23,800};
		int largest=a[0];
		for (int i = 0; i < a.length; i++)
		{
			if (a[i]>largest) 
			{
				largest=a[i];
			}
		}
		System.out.println(largest);
	}
}
