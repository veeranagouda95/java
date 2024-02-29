package sort;

import java.util.Scanner;

//wajp to find nth largest elemnt present in integer arrya
public class s7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of arrya");
		int size = sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter array elemnts");
		for (int k = 0; k < a.length; k++) {
			a[k]=sc.nextInt();
		}
		for (int n = 1; n < a.length; n++)
		{//begining for n for loop 
			for (int i = 0; i < a.length; i++)
			{//begining for i for loop
				int count=0;
				for (int j = 0; j < a.length; j++)
				{//begining of the j for loop
					if(a[j]>a[i]) {
						count++;

					}
				}//end of j loop
				if(count==n-1)
				{
					System.out.println("largest elemnt:"+a[i]);
					break;
				}
			}//end of j loop
		}//end of block
	}
}
