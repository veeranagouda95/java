package aripathMedamArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargestElementBySorting1 {

	public static void main(String[] args) {
		
		int[]a= {10,80,60,40,20,70,90,30};
	     Arrays.sort(a);
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter value of n");
	     int n = sc.nextInt();
	     System.out.println(n+"largest elemnt is "+ a[a.length-n]);
		
	     
	}
}
