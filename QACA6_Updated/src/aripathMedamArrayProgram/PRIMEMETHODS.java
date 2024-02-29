package aripathMedamArrayProgram;

public class PRIMEMETHODS {

	public static void main(String[] args) {
		int[]a= {2,9,4,6,13,17,25,29};
		for (int i = 0; i < a.length; i++) 
		{
			boolean result=isprime(a[i]);
			if(result) 
			{
				System.out.println(a[i]+" is a prime number");	
			}
			else 
			{
				System.out.println(a[i]+"is not a prime number");
			}
		}
	}
	public static boolean isprime(int a) {
		for (int j = 2; j <=a/2; j++) 
		{
			if (a%j==0)
			{
				return false;	
			}
		}
		return true;
	}
}
