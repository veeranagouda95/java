//WAJP to sort the elements in Descending order using selection sort technique 
package array;
import java.util.Scanner;

public class Array29 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to be stored ");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter the "+size+" values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++)
		{
			int pos=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[pos]<a[j])
					pos=j;
			}
			if(pos!=i)
			{
				int temp=a[i];
				a[i]=a[pos];
				a[pos]=temp;
			}
		}
		System.out.println("The array elements after swapping");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

