package aripathMedamArrayProgram;

import java.util.Arrays;

public class SortSecondHalf {

	public static void main(String[] args) {
		
		int[]a= {72,9,12,83,20,14,20,0};
		
		Arrays.sort(a, a.length/2, a.length);
		
		System.out.println("after sorting");
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}
