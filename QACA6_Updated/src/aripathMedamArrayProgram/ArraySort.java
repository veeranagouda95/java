package aripathMedamArrayProgram;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int[]a= {52,89,31,78,92,01,23,69,42,81,0};
		Arrays.sort(a);
		System.out.println("after sorting");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	} 
}
