package sort;

import java.util.Scanner;

//wajp to find the key elemnt in an integer arrya
public class selection1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int size = sc.nextInt();
	int[]a=new int[size];
	System.out.println("enter the elemnts");
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
		
	}
/*	int key=100;
	for (int i = 0; i < a.length; i++) {
		if(a[i]==key)                             //this will program will be every time key not found printed(5)
		{
			System.out.println("key element found");
		}
		else
		{
			System.out.println("key not found");
		}
	}*/
	int key=25;
	int count=0;
	
	for (int i = 0; i < a.length; i++) {
		if(a[i]==key) {
			count++;
			break;
		}
	}
	if(count==1) {
		System.out.println("key is found");
	}
	else
	{
		System.out.println("key not present");
	}
}
}