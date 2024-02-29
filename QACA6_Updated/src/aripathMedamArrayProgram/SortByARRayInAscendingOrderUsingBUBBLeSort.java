package aripathMedamArrayProgram;

public class SortByARRayInAscendingOrderUsingBUBBLeSort 
{
   public static void main(String[] args) {
	
	   int[]a= {72,9,83,20,14,20,0,23,80};
	   for (int i = 0; i < a.length-1; i++) 
	   {
		for (int j = 0; j < a.length-1; j++) 
		{
			if (a[j]>a[j+1]) 
			{
				int temp=a[i];
				a[i]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	   System.out.println("after sorting");
	   for (int i = 0; i < a.length; i++) 
	   {
		System.out.println(a[i]);
	}
}
}
