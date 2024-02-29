package aripathMedamArrayProgram;

public class SortByARRayInAscendingOrderUsingSelectionSort {

	
	public static void main(String[] args) {
		
		int[]a= {72,9,12,83,20,14,20,0,23,80};
		
		
		for (int i = 0; i < a.length; i++) 
		{
			int pos=i;
			for (int k = i+1; k < a.length; k++) 
			{
				if (a[pos]>a[k]) 
				{
					pos=k;
				}
			}
			if (pos!=i) 
			{
				int temp=a[pos];
				a[pos]=a[i];
				a[i]=temp;
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}
}
