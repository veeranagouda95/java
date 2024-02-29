package javaprograms;
public class s1 {
public static void main(String[] args) 
{
	int[]a= {10,11,13,256,45,69,97,111};
	
	for (int i = 0; i < a.length; i++)
	{
		int b=isprime(a[i]);
		if(b>0) {
			
		
		System.out.println(a[i]+"is not  prime");
		}
		else {
			System.out.println(a[i]+"is prime number");
		}
	}
}
	public static int isprime(int c) {
		int n=2;
		while(n<=c/2) {
			if(c%n==0) {
				return c;
			}
			n++;
		}
		return 0;
	}

}
