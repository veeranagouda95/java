package aripathMedamArrayProgram;

import java.util.Arrays;

public class binarySearch {

	public static void main(String[] args) {
		int[]a= {10,20,30,40,50,60,70,80};
		Arrays.sort(a);
		int low=0;
		int high=a.length-1;
		int key =50;
		int count=0;
		while(low<=high)
		{
			int mid=(low+high)/2 ;
			if (key==a[mid])
			{
				count++;
				break;
			}
			else if (key>a[mid]) 
			{
				low=mid+1;
			}
			else if (key<a[mid]) 
			{
				high=mid-1;
			}
			
		}
		if (count==0) 
		{
			System.out.println("key element is not found");
		}
		else 
		{
            System.out.println("key element is  found");
		}
	}
}
