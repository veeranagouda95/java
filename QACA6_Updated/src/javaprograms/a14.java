package javaprograms;

import java.util.Scanner;

//wajp to find th e largest element present inside an integer arrya
public class a14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number  of values to be stored");
	int size = sc.nextInt();
	int[]a=new int[size];
	System.out.println("enter the number");//here  user see that enter value output but this statemnt doesnot take values
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	int max=a[0];
	for (int i = 0; i < a.length; i++) {
		if(max<a[i])
			max=a[i];
	}
	System.out.println("the largest element present in arrya is: "+max);
}
}
