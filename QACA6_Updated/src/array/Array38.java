//WAJP to print un repeated elements in an integer array
package array;

import java.util.Scanner;

public class Array38 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of values to be store");
			int size=sc.nextInt();
			int a[]=new int[size];
			boolean b[]=new boolean[size];
			System.out.println("Enter the "+size+" values");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println();
			for(int i=0;i<a.length;i++)
			{
				int count=1;
				if(b[i]==false)
				{
					for(int j=i+1;j<a.length;j++)
					{
						if(a[i]==a[j])
						{
							count++;
							b[j]=true;
						}

					}
					if(count==1)
					System.out.println("The unrepeated values "+a[i]);
				}
			}
		}
	}

