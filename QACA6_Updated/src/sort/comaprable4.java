package sort;

import java.util.Scanner;

//wajp to print unrepeated elemnt in the integer array
public class comaprable4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of arrya");
		int size = sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the arrya elemnts");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		boolean[]b=new boolean[a.length];
		for (int i = 0; i < a.length; i++)
		{
			if(b[i]==false)//this stament will comapare that value 1st arrya to repate 2nd value value it fal
			{//beginning of block
				int count=1;
				for (int j = i+1; j< a.length; j++) //this for loop 
				{
					if(a[i]==a[j]) 
					{
						count++;
						b[j]=true;
					}
				}
				System.out.println(a[i]);
			}//end of block
		}
	}
}
