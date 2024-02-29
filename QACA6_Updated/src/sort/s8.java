package sort;

import java.util.Arrays;
import java.util.Scanner;

//wjp to find nth largest element using sorting method
//10,5,25,20,35,15,30,45
public class s8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size ");
	int size = sc.nextInt();
	int[]a=new int[size];
	System.out.println("enter the arrya ");
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	int n = sc.nextInt();
	Arrays.sort(a);
	System.out.println(n+" largest element is");
	System.out.println(a[a.length-n]);
}
}
