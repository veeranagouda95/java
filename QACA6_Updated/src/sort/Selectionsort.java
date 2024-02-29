package sort;
//if an array N elemnts the selection sort will have N-1 passes
//in each pass we try to find out the position of smallest element and it will moved swap to it"s original position
//in worist scaniros  the selection sort will have maximum of one swappping for each pass
import java.util.Scanner;

public class Selectionsort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of arrya");
		int size=sc.nextInt();
		int [] a=new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length-1; i++)//this for loop repeat the i value changeing
		{
			int pos=i;
			for (int j = i+1; j < a.length; j++) //this for loop for comaprision purpose
			{
				if(a[pos]>a[j])
				{
					pos=j;
				}

			}
			if(pos!=i)//if this condition pass swap elemnts it will be given
			{
				 int temp=a[pos];
				 a[pos]=a[i];
				 a[i]=temp;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
