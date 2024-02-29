package sort;

import java.util.Scanner;

//wajp to nth largest elemnt in integer arrya
//10,5,25,20,35,15,30
//if user want 1st=>35,2nd=>30,3rd=>25,4th=>20,5th=>15,6=>10

public class s6 {
	public static void main(String[] args) {
		//int n=a.length>1
		Scanner sc=new Scanner(System.in);
		int[]a= {10,5,25,20,35,15,30,45};
		System.out.println("enter the n value from 1 to "+a.length);
		int n=sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[j]>a[i]) {
					count++;

				}
			}
			if(count==n-1) {
				System.out.println(a[i]);
				break;
			}
		}








		/*for (int i = 0; i < a.length; i++) {
		if(a[i]>a[i+1])
			System.out.println();
	}*/
	}
}
