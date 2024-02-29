package aripathMedamArrayProgram;

public class EvenAndOddArrayMethods {

	public static void main(String[] args) {


		int[]a= {25,36,58,59,56,54,53,52,21};
		int evensize=even(a);
		int oddsize=odd(a);
		System.out.println(evensize);
		int[]evenarray=new int[evensize];
		int[]oddarray=new int[oddsize];
		int evencount=0;
		int oddcount=0;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]%2==0) 
			{
				evenarray[evencount]=a[i];
				evencount++;
			} 
			else 
			{
				oddarray[oddcount]=a[i];
				oddcount++;
			}
		}
		System.out.println("even array");
		for (int i = 0; i < evenarray.length; i++)
		{
			System.out.println(evenarray[i]);
		}
       System.out.println("odd array");
       for (int i = 0; i < oddarray.length; i++) 
       {
		System.out.println(oddarray[i]);
	   }
	}
	public static int even(int[] n)
	{
		int count=0;
		for (int i = 0; i < n.length; i++)
		{
			if (n[i]%2==0)
			{
				count++;
			}
		}
		return count;
	}
	public static int odd(int[] n)
	{
		int count=0;
		for (int i = 0; i < n.length; i++)
		{
		if (n[i]%2==1) 
		{
			count++;
		}
	}
	return count;
}
}