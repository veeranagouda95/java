package aripathMedamArrayProgram;

public class smallestElement {

	public static void main(String[] args) {
		int[]a= {72,9,12,83,20,14,20,1,23,800};
		int small=a[0];
		for (int i = 0; i < a.length; i++)
		{
			if (a[i]<small) 
			{
				small=a[i];
			}
		}
		System.out.println(small);
	}
}
